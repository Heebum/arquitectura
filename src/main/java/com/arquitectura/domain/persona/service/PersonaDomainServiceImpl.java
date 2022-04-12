package com.arquitectura.domain.persona.service;

import com.arquitectura.domain.persona.model.PersonaEntity;
import com.arquitectura.domain.persona.repository.PersonaDomainRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PersonaGetByIdService implements PersonaUseCase{

    private final PersonaDomainRepository personaRepository;

    @Override
    public PersonaEntity findPersonaById(Long id) {
        return personaRepository.getById(id);
    }

//    public Optional<Persona> getByIdPersona(Long id){
//        Optional<Persona> personaById = personaRepository.personaById(id);
//        return personaById;
//    }


}
