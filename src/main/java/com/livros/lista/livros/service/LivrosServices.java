package com.livros.lista.livros.service;

import com.livros.lista.livros.domain.Livros;
import com.livros.lista.livros.feign.LivrosCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivrosServices {


    private final LivrosCliente livrosCliente;


    public LivrosServices(LivrosCliente cliente){
        this.livrosCliente = cliente;
    }


    public List<Livros> getLivrosFromLibriary(){
        return this.livrosCliente.getLivros();

    }




}
