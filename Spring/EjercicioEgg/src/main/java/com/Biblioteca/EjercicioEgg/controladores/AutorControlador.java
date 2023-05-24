package com.Biblioteca.EjercicioEgg.controladores;

import com.Biblioteca.EjercicioEgg.entidades.Autor;
import com.Biblioteca.EjercicioEgg.excepciones.MiExcepcion;
import com.Biblioteca.EjercicioEgg.servicios.ServicioAutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
@RequestMapping("/autor")
public class AutorControlador {
    @Autowired
    ServicioAutor autorServ;

    @GetMapping("/registrar")
    public String registrar() {
        return "autor_form.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, ModelMap modelo) {
        try {
            autorServ.crearAutor(nombre);
            modelo.put("exito", "Autor creado Correctamente!");
        } catch (MiExcepcion e) {
            modelo.put("error", e.getMessage());
            return ("autor_form.html");
        }
        return "autor_form.html";
    }

    @GetMapping("/lista")
    public String listaAutor(ModelMap modelo) {
        List<Autor> autores = autorServ.listarAutores();
        modelo.addAttribute("autores", autores);
        return "autor_lista.html";
    }

    @GetMapping("/modificar/{nombre}")
    public String modificar(@PathVariable String nombre, ModelMap modelo) {
        try {
            Autor autor = autorServ.buscarPorNombre(nombre);
            modelo.addAttribute("autor", autor);
            return "autor_edit.html";
        } catch (Exception e) {
            System.out.println(e);
        }
        return "redirect:/autor/modificacion";
    }

    @PostMapping("/modificacion")
    public String modificacion(@RequestParam String idAutor, @RequestParam String nombre){
        try {
            autorServ.modificarAutor(idAutor, nombre);
        }catch (Exception e){
            System.out.println(e);
        }
        return "redirect:/autor/lista";
    }
    @GetMapping("/borrar/{nombre}")
    public String borrar(@PathVariable String nombre){
        try{
            autorServ.borrarAutor(nombre);
        }catch (Exception e){
            System.out.println(e);
        }
        return "redirect:/autor/lista";
    }
}
