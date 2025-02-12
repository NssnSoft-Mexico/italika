package com.example.demo.controller;

import com.example.demo.model.Inventario;
import com.example.demo.service.InventarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventario")
@CrossOrigin(origins = "http://localhost:4200")
public class InventarioController {
    @Autowired
    private InventarioService inventarioService;

    @GetMapping
    public List<Inventario> obtenerInventario() {
        return inventarioService.obtenerInventario();
    }
}
