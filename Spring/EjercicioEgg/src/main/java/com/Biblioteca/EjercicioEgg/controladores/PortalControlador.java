package com.Biblioteca.EjercicioEgg.controladores;

import com.Biblioteca.EjercicioEgg.excepciones.MiExcepcion;
import com.Biblioteca.EjercicioEgg.servicios.ServicioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class PortalControlador {
    @Autowired
    ServicioUsuario servicioUsuario;
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
            return "index.html";
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
