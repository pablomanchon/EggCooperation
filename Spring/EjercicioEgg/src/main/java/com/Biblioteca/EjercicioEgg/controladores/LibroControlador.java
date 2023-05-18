package com.Biblioteca.EjercicioEgg.controladores;

import com.Biblioteca.EjercicioEgg.entidades.Libro;
import com.Biblioteca.EjercicioEgg.excepciones.MiExcepcion;
import com.Biblioteca.EjercicioEgg.servicios.ServicioAutor;
import com.Biblioteca.EjercicioEgg.servicios.ServicioEditorial;
import com.Biblioteca.EjercicioEgg.servicios.ServicioLibro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
@RequestMapping("/libro")
public class LibroControlador {
    @Autowired
    ServicioLibro libroServ;
    @Autowired
    ServicioAutor autorServ;
    @Autowired
    ServicioEditorial editorialServ;

    @GetMapping("/registrar")
    public String registrar() {
        return "libro_form.html";
    }

    @PostMapping("/registro")
    public String registro(@RequestParam(required = false) Long isbn, @RequestParam(required = false) String titulo, @RequestParam(required = false) Integer ejemplares, @RequestParam(required = false) Double precio,
                           @RequestParam(required = false) String idAutor, @RequestParam(required = false) String idEditorial, ModelMap modelo) {
        try {
            libroServ.crearLibro(isbn, titulo, precio, ejemplares, idEditorial, idAutor);
            modelo.put("exito", "El libro fue creado correctamente!");
        } catch (MiExcepcion e) {
            System.out.println("Error: " + e.getMessage());
            modelo.put("error", e.getMessage());
            Logger.getLogger(LibroControlador.class.getName()).log(Level.SEVERE, null, e);
            return "libro_form.html";
        }
        return "index.html";
    }
    @GetMapping("/lista")
    public String listar(ModelMap modelo){
        List<Libro> libros = libroServ.listarLibros();
        modelo.addAttribute("libros", libros);
        return "libro_lista.html";
    }
}
