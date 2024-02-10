package com.livros.lista.livros.controllers;


import com.livros.lista.livros.domain.Livros;
import com.livros.lista.livros.service.LivrosServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/livros")
public class LivrosControllers {


    private final LivrosServices livrosServices;

    public LivrosControllers(LivrosServices services){
        this.livrosServices = services;
    }
    @GetMapping("")
    public String getLivros(){
        List<Livros> livros = this.livrosServices.getLivrosFromLibriary();
        return "oiii";

    }


}
