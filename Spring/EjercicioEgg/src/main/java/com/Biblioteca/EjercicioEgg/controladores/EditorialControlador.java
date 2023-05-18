package com.Biblioteca.EjercicioEgg.controladores;

import com.Biblioteca.EjercicioEgg.excepciones.MiExcepcion;
import com.Biblioteca.EjercicioEgg.servicios.ServicioEditorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/editorial")
public class EditorialControlador {
    @Autowired
    ServicioEditorial editorialServ;
    @GetMapping("/registrar")
    public String registro(){
        return "editorial_form.html";
    }
    @PostMapping("/registro")
    public String registro(@RequestParam("nombre") String nombre) {
        try {
            editorialServ.crearEditorial(nombre);
        } catch (MiExcepcion e) {
            System.out.println(e.getMessage());
        }
        return "index.html";
    }
}
