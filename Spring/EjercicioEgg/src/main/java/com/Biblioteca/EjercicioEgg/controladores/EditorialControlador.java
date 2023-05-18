package com.Biblioteca.EjercicioEgg.controladores;

import com.Biblioteca.EjercicioEgg.entidades.Editorial;
import com.Biblioteca.EjercicioEgg.excepciones.MiExcepcion;
import com.Biblioteca.EjercicioEgg.servicios.ServicioEditorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

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
    public String registro(@RequestParam(required = false) String nombre, ModelMap modelo) {
        try {
            editorialServ.crearEditorial(nombre);
            modelo.put("exito", "Editorial creada con éxito!");
        } catch (MiExcepcion e) {
            modelo.put("error", e.getMessage());
            return "editorial_form.html";
        }
        return "index.html";
    }
    @GetMapping("/lista")
    public String listar(ModelMap modelo) {
        List<Editorial> editoriales = editorialServ.listarEditoriales();
        System.out.println(editoriales.get(0).getNombre());
        modelo.addAttribute("editoriales",editoriales);
        return "editorial_lista.html";
    }
}
