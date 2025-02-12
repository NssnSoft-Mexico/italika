package com.example.demo.service;

import com.example.demo.model.Cotizacion;
import com.example.demo.repository.CotizacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CotizacionService {
    @Autowired
    private CotizacionRepository cotizacionRepository;

    public List<Cotizacion> obtenerTodasCotizaciones() {
        return cotizacionRepository.findAll();
    }

    public Cotizacion obtenerCotizacionPorId(Long id) {
        Optional<Cotizacion> cotizacion = cotizacionRepository.findById(id);
        return cotizacion.orElse(null);
    }

    public Cotizacion saveCotizacion(Cotizacion cotizacion) {
        System.out.println("Service +++++++++++++++++++++++" + cotizacion);
        return cotizacionRepository.save(cotizacion);
    }
}