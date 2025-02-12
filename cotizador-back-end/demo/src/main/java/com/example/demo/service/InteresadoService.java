package com.example.demo.service;

import com.example.demo.model.Interesado;
import com.example.demo.repository.InteresadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InteresadoService {
    @Autowired
    private InteresadoRepository interesadoRepository;

    public Interesado guardarInteresado(Interesado interesado) {
        return interesadoRepository.save(interesado);
    }
}
