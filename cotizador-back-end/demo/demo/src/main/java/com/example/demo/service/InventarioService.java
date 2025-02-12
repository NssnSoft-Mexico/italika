package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.model.Inventario;
import org.springframework.stereotype.Service;
import com.example.demo.repository.InventarioRepository;
import java.util.List;

@Service
public class InventarioService {
    @Autowired
    private InventarioRepository inventarioRepository;

    public List<Inventario> obtenerInventario() {
        return inventarioRepository.findAll();
    }
}
