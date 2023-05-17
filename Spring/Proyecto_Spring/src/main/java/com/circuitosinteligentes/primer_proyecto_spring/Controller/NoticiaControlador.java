/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.circuitosinteligentes.primer_proyecto_spring.Controller;

import com.circuitosinteligentes.primer_proyecto_spring.Entidades.Autor;
import com.circuitosinteligentes.primer_proyecto_spring.Entidades.Noticia;
import com.circuitosinteligentes.primer_proyecto_spring.Servicio.IAutorNoticiaServicio;
import com.circuitosinteligentes.primer_proyecto_spring.Servicio.IAutorServicio;
import com.circuitosinteligentes.primer_proyecto_spring.Servicio.INoticiaServicio;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Julian_Velasco
 */
@Controller
public class NoticiaControlador {

    @Autowired
    private INoticiaServicio noticiaServicio;

    @Autowired
    private IAutorServicio autorServ;

    @Autowired
    private IAutorNoticiaServicio autorNoticiaServicio;

    @GetMapping("/")
    public String home(ModelMap modelmap) {
        List<Noticia> noticias = noticiaServicio.findAll();
        Collections.sort(noticias, (n1, n2) -> n2.getId().compareTo(n1.getId()));
        modelmap.addAttribute("noticias", noticias);
        return "index.html";
    }

    @GetMapping("/noticias")
    public String index(ModelMap modelmap) {
        List<Noticia> noticias = noticiaServicio.findAll();
        modelmap.addAttribute("noticias", noticias);
        return "noticiasAdmin.html";
    }

    @GetMapping("/create")
    public String create(ModelMap modelMap) {
        Noticia noticia = new Noticia();
        modelMap.addAttribute("noticia", noticia);
        return "crear.html";
    }

    @PostMapping("/save")
    public String save(Noticia noticia, String autorNombre, String autorApellido) {
        if (autorNombre != null && autorApellido != null) {
            Autor autor = new Autor();
            autor.setNombre(autorNombre);
            autor.setApellido(autorApellido);
            autor = autorServ.save(autor);
            noticia.setAutor(autor);
            noticiaServicio.save(noticia);
        }
        return "redirect:/noticias";
    }

    @GetMapping("/editar/{id}")
    public String edit(@PathVariable Integer id, ModelMap modelmap) {
        Noticia noticia = noticiaServicio.getById(id).get();
        modelmap.addAttribute("noticia", noticia);
        List<Autor> autor = autorServ.findAll();
        modelmap.addAttribute("autor", autor);
        return "edit.html";
    }

    @PostMapping("/update")
    public String update(Noticia noticia) {
        noticiaServicio.update(noticia);
        return "redirect:/noticias";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        noticiaServicio.delete(id);
        return "redirect:/noticias";
    }
}
