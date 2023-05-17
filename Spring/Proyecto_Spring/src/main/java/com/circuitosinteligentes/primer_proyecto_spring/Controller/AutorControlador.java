/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.circuitosinteligentes.primer_proyecto_spring.Controller;

import com.circuitosinteligentes.primer_proyecto_spring.Entidades.Autor;
import com.circuitosinteligentes.primer_proyecto_spring.Servicio.IAutorServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author Julian_Velasco
 */
@Controller
public class AutorControlador {

    @Autowired
    private IAutorServicio autorServ; //le inyectamos la interfaz de servicios

    @GetMapping("/autores")//URL a donde me dirige
    public String index(ModelMap modelmap) {//ModelMap permite pasar valores al HTML para que realice operaciones
        List<Autor> autores = autorServ.findAll();
        modelmap.addAttribute("autor", autores);
        return "noticiasAdmin.html";
    }

    @GetMapping("/registro-autor")//URL a donde me dirige
    public String register() {
        return "registroAutor.html";
    }

    @GetMapping("/create2")
    public String create() {
        return "crear.html";
    }

    @PostMapping("/save2")
    public String save(Autor autor) {
        autorServ.save(autor);
        return "redirect:/noticias";
    }

    @GetMapping("/editar2/{id}")
    public String edit(@PathVariable Integer id, ModelMap modelmap) {
        Autor autor = autorServ.getById(id).get();
        modelmap.addAttribute("autor", autor);
        return "edit.html";
    }

    @PostMapping("/update2")
    public String update(Autor autor) {
        autorServ.update(autor);
        return "redirect:/noticias";
    }

    @GetMapping("/eliminar-autor/{id}")
    public String delete(@PathVariable Integer id) {
        autorServ.delete(id);
        return "redirect:/noticias";
    }
}