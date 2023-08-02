package com.mateusfaustino.cruda.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/filmes")
public class FilmController {

    @GetMapping
    public String carregaPaginaFormulario() {
        return "filmes/formulario";
    }

}
