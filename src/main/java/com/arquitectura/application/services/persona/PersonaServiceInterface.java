package com.arquitectura.application.services.persona;

import com.arquitectura.domain.persona.model.Persona;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonaRepository {
    public Persona create(Persona persona);
    public Optional<Persona> personaById(Long id);

}
