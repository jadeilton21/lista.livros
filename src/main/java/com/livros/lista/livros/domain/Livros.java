package com.livros.lista.livros.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Livros {

    public String titulo;
    public String autor;
    public String area;
    public String imagem;
    public String editora;
    @JsonProperty("year_of_publication")
    public String ano_fabricacao;
    public String isbn;

}
