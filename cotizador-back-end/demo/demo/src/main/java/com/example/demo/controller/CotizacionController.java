package com.example.demo.controller;

import com.example.demo.model.Cotizacion;
import com.example.demo.service.CotizacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cotizaciones")
public class CotizacionController {
    @Autowired
    private CotizacionService cotizacionService;

    @GetMapping
    public List<Cotizacion> obtenerCotizaciones() {
        return cotizacionService.obtenerTodasCotizaciones();
    }

    @GetMapping("/{id}")
    public Cotizacion obtenerCotizacion(@PathVariable Long id) {
        return cotizacionService.obtenerCotizacionPorId(id);
    }

    @PostMapping
    public Cotizacion createCotizacion(@RequestBody Cotizacion cotizacion) {
        System.out.println("Controller++++++++++++++++++++++++" +  cotizacion);
        return cotizacionService.saveCotizacion(cotizacion);
    }
}
