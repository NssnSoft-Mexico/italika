package com.example.demo.repository;

import com.example.demo.model.Interesado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InteresadoRepository extends JpaRepository<Interesado, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario
}