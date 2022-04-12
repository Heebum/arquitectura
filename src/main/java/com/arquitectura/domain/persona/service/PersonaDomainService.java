package com.arquitectura.domain.persona.service;

import com.arquitectura.domain.persona.model.Persona;
import com.arquitectura.domain.persona.model.PersonaEntity;

public interface PersonaUseCase {
    PersonaEntity findPersonaById(Long id);

//    Persona create(Persona persona);
}
