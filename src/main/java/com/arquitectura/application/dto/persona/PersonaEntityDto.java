package com.arquitectura.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class PersonaEntityDto implements Serializable {
    private final String nombre;
    private final String apellido;
    private final String edad;
    private final String ciudad;
}
