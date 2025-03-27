package com.dccomic.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controler {
    @GetMapping("/")
    String hola(){
        return "Haciendo un Rest";    
    }
    @PostMapping("/")
    public String handlePost(){
        return "Haciendo un Post";
} 
@PutMapping("/")
    public String handlePut() {
        return "Mensaje actualizado a:" ;
}
 @DeleteMapping("/hello")
    public String handleDelete() {
        return "Mensaje eliminado";
    }
}
