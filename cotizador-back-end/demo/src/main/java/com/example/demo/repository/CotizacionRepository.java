package com.example.demo.repository;

import com.example.demo.model.Cotizacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CotizacionRepository extends JpaRepository<Cotizacion, Long> {
}
