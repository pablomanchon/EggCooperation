package com.Biblioteca.EjercicioEgg.controladores;

import com.Biblioteca.EjercicioEgg.entidades.Autor;
import com.Biblioteca.EjercicioEgg.excepciones.MiExcepcion;
import com.Biblioteca.EjercicioEgg.servicios.ServicioAutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/autor")
public class AutorControlador {
    @Autowired
    ServicioAutor autorServ;
    @GetMapping("/registrar")
    public String registrar() {
        return "autor_form.html";
    }
    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, ModelMap modelo){
        try {
            autorServ.crearAutor(nombre);
            modelo.put("exito", "Autor creado Correctamente!");
        } catch (MiExcepcion e) {
            modelo.put("error", e.getMessage());
            return("autor_form.html");
        }
        return "autor_form.html";
    }
    @PostMapping("/lista")
    public String listaAutor(ModelMap modelo){
        return "autor_lista.html";
    }

    public void buscarPorNombre(@RequestParam String nombre){
       autorServ.buscarPorNombre(nombre);
    }
}
