package com.Biblioteca.EjercicioEgg.repositorios;

import com.Biblioteca.EjercicioEgg.entidades.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RepositorioAutor extends JpaRepository<Autor,String> {
    @Query("SELECT a FROM Autor a WHERE a.nombre = :nombre")
    public Optional<Autor> buscarPorNombre(@Param("nombre") String nombre);

}
