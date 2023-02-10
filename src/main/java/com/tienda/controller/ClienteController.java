/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.controller;

import com.tienda.domain.Cliente;
import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Jeausthin
 */
@Controller
public class ClienteController {

    @GetMapping("/")
    public String inicio(Model model) {
        var saludo = "Saludos desde el Back End";
        model.addAttribute("mensaje", saludo);

        Cliente cliente1 = new Cliente("Juan", "Contreras", "jcontreras@gmail.com", "252589947");
        Cliente cliente2 = new Cliente("Pedro", "Contreras", "pcontreras@gmail.com", "252589947");
        Cliente cliente3 = new Cliente("Rita", "Contreras", "rcontreras@gmail.com", "252589947");

        var clientes = Arrays.asList(cliente1, cliente2, cliente3);

        model.addAttribute("clientes", clientes);

        return "index";
    }
}
