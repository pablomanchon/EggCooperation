package com.Biblioteca.EjercicioEgg.servicios;

import com.Biblioteca.EjercicioEgg.entidades.Editorial;
import com.Biblioteca.EjercicioEgg.excepciones.MiExcepcion;
import com.Biblioteca.EjercicioEgg.repositorios.RepositorioEditorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
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

    public Editorial buscarPorNombre(String nombre) {
        Optional<Editorial> resEditorial = editorialRepo.buscarPorNombre(nombre);
        return resEditorial.isPresent() ? resEditorial.get() : null;
    }

    @Transactional
    public void modificarEditorial(String idEditorial, String nombre) throws MiExcepcion {
        validar(idEditorial, nombre);
        Optional<Editorial> resEditorial = editorialRepo.findById(idEditorial);
        if (resEditorial.isPresent()) {
            Editorial editorial = resEditorial.get();
            editorial.setNombre(nombre);
            editorialRepo.save(editorial);
        }
    }

    public void borrarEditorial(String nombre) {
        Optional<Editorial> resEditorial = editorialRepo.buscarPorNombre(nombre);
        if (resEditorial.isPresent()){
            Editorial editorial = resEditorial.get();
            editorialRepo.delete(editorial);
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
