package com.arquitectura.infraestructure.controller.persona;

import com.arquitectura.domain.persona.model.Persona;
import com.arquitectura.domain.persona.service.PersonaCreateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/apiAL/personas")
public class PersonaCreateController {
    @Autowired
    PersonaCreateService personaCreateService;

    @PostMapping
    public ResponseEntity<Persona> create(@RequestBody Persona persona) {
        personaCreateService.createPersona(persona);
        return ResponseEntity.status(HttpStatus.CREATED).body(persona);
    }
}
