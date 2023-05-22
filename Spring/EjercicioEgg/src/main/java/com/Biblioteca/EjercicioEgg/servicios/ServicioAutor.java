package com.Biblioteca.EjercicioEgg.servicios;

import com.Biblioteca.EjercicioEgg.entidades.Autor;
import com.Biblioteca.EjercicioEgg.excepciones.MiExcepcion;
import com.Biblioteca.EjercicioEgg.repositorios.RepositorioAutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Service
@Configurable
public class ServicioAutor {
    @Autowired
    RepositorioAutor autorRepo;
    @Transactional
    public void crearAutor(String nombre) throws MiExcepcion {
        validar(nombre);
        Autor autor = new Autor();
        autor.setNombre(nombre);
        autorRepo.save(autor);
    }
    public Autor buscarPorNombre(String nombre){
        Optional<Autor> resAutor = autorRepo.buscarPorNombre(nombre);
        if(resAutor.isPresent()){
            return resAutor.get();
        }
        return null;
    }

    public List<Autor> listarAutores(){
        List<Autor> autores;
        autores = autorRepo.findAll();
        return autores;
    }

    @Transactional
    public void modificarAutor(String idAutor, String nombre) throws MiExcepcion {
        validar(idAutor, nombre);
        Optional<Autor> resAutor = autorRepo.findById(idAutor);
        if(resAutor.isPresent()){
            Autor autor = resAutor.get();
            autor.setNombre(nombre);
            autorRepo.save(autor);
        }
    }

    private static void validar(String idAutor, String nombre) throws MiExcepcion {
        if(nombre == null || nombre.isEmpty()){
            throw new MiExcepcion("No ingresó nombre");
        }
        if(idAutor == null || idAutor.isEmpty()){
            throw new MiExcepcion("No ingresó ID");
        }
    }

    private static void validar(String nombre) throws MiExcepcion {
        if(nombre == null || nombre.isEmpty()){
            throw new MiExcepcion("El nombre no puede ser Nulo");
        }
    }
}
