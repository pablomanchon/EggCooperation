package com.Biblioteca.EjercicioEgg.repositorios;

import com.Biblioteca.EjercicioEgg.entidades.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioLibro extends JpaRepository<Libro,Long> {
    @Query("SELECT l FROM Libro l WHERE l.nombre = :nombre")
    public Libro buscarPorNombre(@Param("nombre") String nombre);
}
