package com.Biblioteca.EjercicioEgg.controladores;

import com.Biblioteca.EjercicioEgg.entidades.Autor;
import com.Biblioteca.EjercicioEgg.entidades.Editorial;
import com.Biblioteca.EjercicioEgg.entidades.Libro;
import com.Biblioteca.EjercicioEgg.excepciones.MiExcepcion;
import com.Biblioteca.EjercicioEgg.servicios.ServicioAutor;
import com.Biblioteca.EjercicioEgg.servicios.ServicioEditorial;
import com.Biblioteca.EjercicioEgg.servicios.ServicioLibro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
@PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
@RequestMapping("/libro")
public class LibroControlador {
    @Autowired
    ServicioLibro libroServ;
    @Autowired
    ServicioAutor autorServ;
    @Autowired
    ServicioEditorial editorialServ;

    @GetMapping("/registrar")
    public String registrar(ModelMap modelo) {
        List<Editorial> editoriales = editorialServ.listarEditoriales();
        modelo.addAttribute("editoriales", editoriales);
        List<Autor> autores = autorServ.listarAutores();
        modelo.addAttribute("autores", autores);
        return "libro_form.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam(required = false) Long isbn, @RequestParam(required = false) String titulo, @RequestParam(required = false) Integer ejemplares, @RequestParam(required = false) Double precio,
                           @RequestParam(required = false) String idAutor, @RequestParam(required = false) String idEditorial, ModelMap modelo) {
        try {
            List<Editorial> editoriales = editorialServ.listarEditoriales();
            modelo.addAttribute("editoriales", editoriales);
            List<Autor> autores = autorServ.listarAutores();
            modelo.addAttribute("autores", autores);
            libroServ.crearLibro(isbn, titulo, precio, ejemplares, idEditorial, idAutor);
            modelo.put("exito", "El libro fue creado correctamente!");
        } catch (MiExcepcion e) {
            modelo.put("error", e.getMessage());
            Logger.getLogger(LibroControlador.class.getName()).log(Level.SEVERE, null, e);
            return "libro_form.html";
        }
        return "redirect:lista";
    }

    @GetMapping("/lista")
    public String listar(ModelMap modelo) {
        List<Libro> libros = libroServ.listarLibros();
        modelo.addAttribute("libros", libros);
        List<Editorial> editoriales = editorialServ.listarEditoriales();
        modelo.addAttribute("editoriales", editoriales);
        List<Autor> autores = autorServ.listarAutores();
        modelo.addAttribute("autores", autores);
        return "libro_lista.html";
    }

    @GetMapping("/modificar/{nombre}")
    public String modificar(@PathVariable String nombre, ModelMap modelo) {
        Libro libro = libroServ.buscarPorNombre(nombre);
        modelo.addAttribute("libro", libro);
        List<Editorial> editoriales = editorialServ.listarEditoriales();
        modelo.addAttribute("editoriales", editoriales);
        List<Autor> autores = autorServ.listarAutores();
        modelo.addAttribute("autores", autores);
        return "libro_edit.html";
    }

    @PostMapping("/modificacion")
    public String modificacion(@RequestParam(required = false) Long isbn, @RequestParam(required = false) String titulo, @RequestParam(required = false) Integer ejemplares, @RequestParam(required = false) Double precio,
                               @RequestParam(required = false) String autor, @RequestParam(required = false) String idEditorial, ModelMap modelo) {
        try{
            System.out.println(titulo);
            libroServ.modificarLibro(isbn,titulo, precio, ejemplares, autor, idEditorial);
        }catch(Exception e){
            return "redirect:/libro/modificar/" + titulo;
        }
        return "redirect:lista";
    }
    @GetMapping("/borrar/{nombre}")
    public String borrar(@PathVariable String nombre){
        try{
            libroServ.borrarLibro(nombre);
        }catch (Exception e){
            System.out.println("hola");
        }
        return "redirect:/libro/lista";
    }
}
