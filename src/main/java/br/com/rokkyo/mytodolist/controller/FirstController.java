package br.com.rokkyo.mytodolist.controller;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller // Controle padrão para telas
@RestController // Controle em formato Rest

// Rota (path até a classe)
@RequestMapping("/helloWorld")
public class FirstController {
    
    // Metodo (path dele)
    @GetMapping("")
    public String firstMethod() {
        return "Olá mundo! Caio aqui";
    }
;}
