package com.Biblioteca.EjercicioEgg.servicios;

import com.Biblioteca.EjercicioEgg.entidades.Editorial;
import com.Biblioteca.EjercicioEgg.excepciones.MiExcepcion;
import com.Biblioteca.EjercicioEgg.repositorios.RepositorioEditorial;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioEditorial {
    @Autowired
    RepositorioEditorial editorialRepo;

    @Transactional
    public void crearEditorial(String nombre) throws MiExcepcion {
        validar(nombre);
        Editorial editorial = new Editorial();
        editorial.setNombre(nombre);
        editorialRepo.save(editorial);
    }

    public List<Editorial> listarEditoriales() {
        List<Editorial> autores;
        autores = editorialRepo.findAll();
        return autores;
    }

    @Transactional
    public void modificarEditorial(String idEditorial, String nombre) throws MiExcepcion {
        validar(idEditorial, nombre);
        Optional<Editorial> resAutor = editorialRepo.findById(idEditorial);
        if (resAutor.isPresent()) {
            Editorial autor = resAutor.get();
            autor.setNombre(nombre);
            editorialRepo.save(autor);
        }
    }

    private static void validar(String idEditorial, String nombre) throws MiExcepcion {
        if (nombre == null || nombre.isEmpty()) {
            throw new MiExcepcion("No ingresó nombre");
        }
        if (idEditorial == null || idEditorial.isEmpty()) {
            throw new MiExcepcion("No ingresó ID");
        }
    }

    private static void validar(String nombre) throws MiExcepcion {
        if (nombre == null || nombre.isEmpty()) {
            throw new MiExcepcion("Debe ingresar nombre");
        }
    }
}
