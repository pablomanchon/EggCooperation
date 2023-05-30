package com.Biblioteca.EjercicioEgg.controladores;

import com.Biblioteca.EjercicioEgg.entidades.Editorial;
import com.Biblioteca.EjercicioEgg.entidades.Usuario;
import com.Biblioteca.EjercicioEgg.excepciones.MiExcepcion;
import com.Biblioteca.EjercicioEgg.servicios.ServicioEditorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
@RequestMapping("/editorial")
public class EditorialControlador {
    @Autowired
    ServicioEditorial editorialServ;

    @GetMapping("/registrar")
    public String registro() {
        return "editorial_form.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam(required = false) String nombre, ModelMap modelo) {
        try {
            editorialServ.crearEditorial(nombre);
            modelo.put("exito", "Editorial creada con éxito!");
            List<Editorial> editoriales = editorialServ.listarEditoriales();
            modelo.addAttribute("editoriales", editoriales);
        } catch (MiExcepcion e) {
            modelo.put("error", e.getMessage());
            return "editorial_form.html";
        }
        return "editorial_lista.html";
    }

    @GetMapping("/lista")
    public String listar(ModelMap modelo) {
        List<Editorial> editoriales = editorialServ.listarEditoriales();
        modelo.addAttribute("editoriales", editoriales);
        return "editorial_lista.html";
    }

    @GetMapping("/modificar/{nombre}")
    public String modificar(@PathVariable String nombre, ModelMap modelo) {
        System.out.println(nombre);
        try {
            Editorial editorial = editorialServ.buscarPorNombre(nombre);
            modelo.addAttribute("editorial", editorial);
            return "editorial_edit.html";
        } catch (Exception e) {
            System.out.println(e);
        }
        return "redirect:/editorial/modificacion";
    }

    @PostMapping("/modificacion")
    public String modificacion(@RequestParam String idEditorial, @RequestParam String nombre, ModelMap modelo) {
        try {
            editorialServ.modificarEditorial(idEditorial, nombre);
            return "redirect:/editorial/lista";
        } catch (Exception e) {
            System.out.println(e);
        }
        return "redirect:/editorial/modificacion";
    }

    @GetMapping("/borrar/{nombre}")
    public String borrar(@PathVariable String nombre) {
        try {
            editorialServ.borrarEditorial(nombre);
        } catch (Exception e) {
            System.out.println(e);
        }
        return "redirect:/editorial/lista";
    }
}
