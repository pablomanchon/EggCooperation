package com.Biblioteca.EjercicioEgg.repositorios;

import com.Biblioteca.EjercicioEgg.entidades.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RepositorioEditorial extends JpaRepository<Editorial,String> {
    @Query("SELECT e FROM Editorial e WHERE e.nombre = :nombre")
    public Optional<Editorial> buscarPorNombre(@Param("nombre") String nombre);
}
