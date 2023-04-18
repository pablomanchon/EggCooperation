package Controladora;

import Entidades.Autor;
import Entidades.Editorial;
import Entidades.Libro;
import JPAController.AutorJpaController;
import JPAController.LibroJpaController;

public class Logica {
    
    public void crearLibro(){
        System.out.println("_________Crear Libro_________");
        Autor a = new Autor("Jose Maria", true);
        Editorial e = new Editorial("DreamWorks", true);
        Libro l = new Libro("Harry Potter", 1997, 99999,99999,0,true,a,e);
        
        LibroJpaController libroJpa = new LibroJpaController();
        
        libroJpa.create(l);
        
          System.out.println("_________Crear Libro_________");
        Autor au = new Autor("Pepe Alberto", true);
        Editorial ed = new Editorial("Disney", true);
        Libro lo = new Libro("Pocahontas", 1995, 1231412,52351,(1231412-52351),true,au,ed);
       
        libroJpa.create(lo);
    }
    
    public void buscarAutor(){
        AutorJpaController autorJpa = new AutorJpaController();
        System.out.println(autorJpa.findAutor(2));
    }
}
