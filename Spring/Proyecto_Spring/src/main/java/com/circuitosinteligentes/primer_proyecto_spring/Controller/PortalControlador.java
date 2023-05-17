/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.circuitosinteligentes.primer_proyecto_spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Julian_Velasco
 */
@Controller
public class PortalControlador {

    @GetMapping("/registro-autor")//URL a donde me dirige
    public String register() {
        return "registroAutor.html";
    }
}
