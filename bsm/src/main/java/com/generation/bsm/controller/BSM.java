package com.generation.bsm.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")

public class BSM {
	@GetMapping
    public List<String> getBSMs() {
        
        List<String> bsms = Arrays.asList("Comunicação", "Proatividade", "orientação ao detalhe", "Trabalho em equipe", "Mentalidade de Crescimento", "Orientação ao futuro", "Responsabilidade pessoal", "Persistência");
        return bsms;
    }

}
