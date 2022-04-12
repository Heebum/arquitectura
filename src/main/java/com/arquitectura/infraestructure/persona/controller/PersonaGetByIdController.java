package com.arquitectura.infraestructure.controller.persona;

import com.arquitectura.domain.persona.model.Persona;
import com.arquitectura.domain.persona.service.PersonaGetByIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
@RestController
@RequestMapping(value = "/apiAL/personas")
public class PersonaGetByIdController {
    @Autowired
    PersonaGetByIdService personaGetByIdService;

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Persona>> findById(@PathVariable Long id) {
        Optional<Persona> persona = personaGetByIdService.getByIdPersona(id);
        return ResponseEntity.ok(persona);
    }
}
