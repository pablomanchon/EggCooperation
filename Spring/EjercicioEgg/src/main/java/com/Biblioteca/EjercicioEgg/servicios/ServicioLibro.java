package com.Biblioteca.EjercicioEgg.servicios;

import com.Biblioteca.EjercicioEgg.entidades.*;
import com.Biblioteca.EjercicioEgg.excepciones.MiExcepcion;
import com.Biblioteca.EjercicioEgg.repositorios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Service
public class ServicioLibro {
    @Autowired
    RepositorioLibro libroRepo;
    @Autowired
    RepositorioAutor autorRepo;
    @Autowired
    RepositorioEditorial editorialRepo;

    @Transactional
    public void crearLibro(Long isbn, String nombre, Double precio, Integer ejemplares, String nombreEditorial, String nombreAutor) throws MiExcepcion {
        Autor autor = new Autor();
        Editorial editorial = new Editorial();
        validar(isbn, nombre, precio, ejemplares, nombreEditorial, nombreAutor);

        Optional<Autor> resAutor = autorRepo.buscarPorNombre(nombreAutor);
        if (resAutor.isPresent()) {
            autor = resAutor.get();
        }

        Optional<Editorial> resEditorial = editorialRepo.buscarPorNombre(nombreEditorial);
        if (resEditorial.isPresent()) {
            editorial = resEditorial.get();
        }

        Libro libro = new Libro(isbn, nombre, precio, ejemplares, autor, editorial);
        libroRepo.save(libro);
    }


    public List<Libro> listarLibros() {
        List<Libro> libros = new ArrayList<>();
        libros = libroRepo.findAll();
        return libros;
    }

    public Libro buscarPorNombre(String nombre) {
        Optional<Libro> resLibro = libroRepo.buscarPorNombre(nombre);
        return resLibro.isPresent() ? resLibro.get() : null;
    }
    @Transactional
    public void modificarLibro(Long isbn, String nombre, String idAutor, String idEditorial) throws MiExcepcion {
        validar(isbn, nombre, idAutor, idEditorial);
        Editorial editorial = new Editorial();
        Autor autor = new Autor();

        Optional<Editorial> resEditorial = editorialRepo.findById(idEditorial);
        if (resEditorial.isPresent()) {
            editorial = resEditorial.get();
        }

        Optional<Autor> resAutor = autorRepo.findById(idAutor);
        if (resAutor.isPresent()) {
            autor = resAutor.get();
        }

        Optional<Libro> resLibro = libroRepo.findById(isbn);
        if (resLibro.isPresent()) {
            Libro libro = resLibro.get();
            libro.setAutor(autor);
            libro.setEditorial(editorial);
            libro.setNombre(nombre);
            libroRepo.save(libro);
        }
    }

    private static void validar(Long isbn, String nombre, String idAutor, String idEditorial) throws MiExcepcion {
        if (isbn == null) {
            throw new MiExcepcion("Debe ingresar el ISBN");
        }
        if (nombre == null || nombre.isEmpty()) {
            throw new MiExcepcion("Debe ingresar Nombre");
        }
        if (idEditorial == null || idEditorial.isEmpty()) {
            throw new MiExcepcion("Debe ingresar ID de la Editorial");
        }
        if (idAutor == null || idAutor.isEmpty()) {
            throw new MiExcepcion("Debe ingresar ID del Autor");
        }
    }
    private static void validar(Long isbn, String nombre, Double precio, Integer ejemplares, String idEditorial, String idAutor) throws MiExcepcion {
        if (isbn == null) {
            throw new MiExcepcion("Debe ingresar el ISBN");
        }
        if (nombre == null || nombre.isEmpty()) {
            throw new MiExcepcion("Debe ingresar Nombre");
        }
        if (precio == null) {
            throw new MiExcepcion("Debe ingresar Precio");
        }
        if (ejemplares == null) {
            throw new MiExcepcion("Debe ingresar Ejemplares");
        }
        if (idEditorial == null || idEditorial.isEmpty()) {
            throw new MiExcepcion("Debe ingresar ID de la Editorial");
        }
        if (idAutor == null || idAutor.isEmpty()) {
            throw new MiExcepcion("Debe ingresar ID del Autor");
        }
    }
}
