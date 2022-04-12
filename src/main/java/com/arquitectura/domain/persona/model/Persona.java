package com.arquitectura.domain.persona;

import java.util.Objects;
import java.util.UUID;

public class Persona {

    private UUID codigo;
    private String identificacion;
    private String nombre;
    private String apellido;
    private String edad;

    public UUID getCodigo() {
        return codigo;
    }

    public void setCodigo(UUID codigo) {
        this.codigo = codigo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(codigo, persona.codigo) && Objects.equals(identificacion, persona.identificacion) && Objects.equals(nombre, persona.nombre) && Objects.equals(apellido, persona.apellido) && Objects.equals(edad, persona.edad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, identificacion, nombre, apellido, edad);
    }
}
