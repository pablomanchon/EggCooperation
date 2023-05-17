/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.circuitosinteligentes.primer_proyecto_spring.Servicio;

import com.circuitosinteligentes.primer_proyecto_spring.Entidades.Autor;
import com.circuitosinteligentes.primer_proyecto_spring.Entidades.Noticia;
import com.circuitosinteligentes.primer_proyecto_spring.Repositorio.Repositorio;
import com.circuitosinteligentes.primer_proyecto_spring.Repositorio.RepositorioAutor;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Julian_Velasco
 */
@Service
public class AutorNoticiaServicioImpl implements IAutorNoticiaServicio {

    @Autowired
    private Repositorio repositorioNoticia;
    @Autowired
    private RepositorioAutor repositorioAutor;

    @Override
    public List<Noticia> findAll() {
        return repositorioNoticia.findAll();
    }

    @Override
    public Optional<Noticia> getById(Integer id) {
        return repositorioNoticia.findById(id);
    }

    @Override
    public List<Autor> findAllAutores() {
        return repositorioAutor.findAll();
    }

    @Override
    public Optional<Autor> getAutorById(Integer id) {
        return repositorioAutor.findById(id);
    }

    @Override
    public void relacionarAutorNoticia(Autor autor, Noticia noticia) {
        noticia.setAutor(autor);
        repositorioNoticia.save(noticia);
    }
}
