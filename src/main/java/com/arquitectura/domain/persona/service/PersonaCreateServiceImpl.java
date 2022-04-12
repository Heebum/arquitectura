package com.arquitectura.domain.persona.service;

import com.arquitectura.domain.persona.model.Persona;
import com.arquitectura.application.persistence.persona.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonaCreateService {

    @Autowired
    PersonaRepository personaRepository;


    public Persona create(Persona persona) {
        return personaRepository.create(persona);
    }


    public Optional<Persona> personaById(Long id) {
        return Optional.empty();
    }
}
