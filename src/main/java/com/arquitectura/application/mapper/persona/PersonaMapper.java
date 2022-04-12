package com.arquitectura.application.mapper;

import com.arquitectura.application.dto.PersonaEntityDto;
import com.arquitectura.domain.persona.model.PersonaEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonaMapper {

    PersonaEntityDto toPersonaDto(PersonaEntity persona);

    PersonaEntity toPersonaEntity(PersonaEntityDto personaDto);
}
