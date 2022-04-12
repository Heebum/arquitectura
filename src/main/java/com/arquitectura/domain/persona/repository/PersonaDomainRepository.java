package com.arquitectura.domain.persona.repository;

import com.arquitectura.domain.persona.model.Persona;
import com.arquitectura.domain.persona.model.PersonaEntity;

public interface PersonaRepository {

    PersonaEntity getById(Long id);

//    Persona save(Persona persona);
}
