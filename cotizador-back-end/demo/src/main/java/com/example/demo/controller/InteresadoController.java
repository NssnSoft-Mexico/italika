package com.example.demo.controller;

import com.example.demo.model.Interesado;
import com.example.demo.service.InteresadoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/interesados")
@CrossOrigin(origins = "http://localhost:4200")
public class InteresadoController {

    @Autowired
    private InteresadoService interesadoService;

    @PostMapping
    public Interesado guardarInteresado(@RequestBody Interesado interesado) {
        return interesadoService.guardarInteresado(interesado);
    }
}
