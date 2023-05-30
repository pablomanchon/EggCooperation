package com.Biblioteca.EjercicioEgg.controladores;

import com.Biblioteca.EjercicioEgg.entidades.Usuario;
import com.Biblioteca.EjercicioEgg.excepciones.MiExcepcion;
import com.Biblioteca.EjercicioEgg.servicios.ServicioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class PortalControlador {
    @Autowired
    ServicioUsuario servicioUsuario;
    @PreAuthorize("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
    @GetMapping("/")
    public String index() {
        return "index.html";
    }
    @GetMapping("/login")
    public String login(){
        return "login.html";
    }
    @GetMapping("/registrar")
    public String registrar() {
        return "register.html";
    }
    @PostMapping("/registro")
    public String registro(@RequestParam String nombre, @RequestParam String email, @RequestParam String password, String password2, ModelMap modelo){
        try{
            servicioUsuario.registrarUsuario(nombre,email,password,password2);
            modelo.put("exito","Usuario registrado correctamente!");
            return "login.html";
        }catch(MiExcepcion e){
            modelo.put("error",e.getMessage());
            modelo.put("nombre",nombre);
            modelo.put("email",email);
            modelo.put("password",password);
            modelo.put("password2",password2);
            return "register.html";
        }
    }

}
