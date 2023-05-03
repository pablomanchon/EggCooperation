package com.eggcooperation.eggnews.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Noticia {
    @Id
    private String titulo;
    private String cuerpo;

    public Noticia() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
    
}
