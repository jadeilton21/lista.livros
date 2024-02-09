package com.livros.lista.livros.feign;

import com.livros.lista.livros.domain.Livros;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "livros-api",url = "https://livros-exemplos-api.s3.us-east-2.amazonaws.com/livros.json")
public interface LivrosCliente {

 @GetMapping
    List<Livros> getLivros();

}
