package com.arquitectura.infraestructure.config;

import com.arquitectura.application.mapper.persona.PersonaMapper;
import com.arquitectura.application.services.persona.PersonaServiceImpl;
import com.arquitectura.domain.persona.repository.PersonaRepository;
import com.arquitectura.domain.persona.service.PersonaGetByIdService;
import com.arquitectura.domain.persona.service.PersonaUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public PersonaServiceImpl personaService(PersonaUseCase personaUseCase, PersonaMapper personaMapper){
        return new PersonaServiceImpl(personaUseCase, personaMapper);
    }
    
    @Bean
    public PersonaGetByIdService personaGetByIdService(PersonaRepository personaRepository){
        return new PersonaGetByIdService(personaRepository);
    }
}
