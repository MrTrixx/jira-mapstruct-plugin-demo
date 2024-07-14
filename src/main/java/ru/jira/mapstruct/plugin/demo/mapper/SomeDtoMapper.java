package ru.jira.mapstruct.plugin.demo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.jira.mapstruct.plugin.demo.dto.SomeRequestDto;
import ru.jira.mapstruct.plugin.demo.dto.SomeResponseDto;

/*
   Use componentModel = "spring" to have mapper bean in Plugin Spring Context
 */
@Mapper(componentModel = "spring")
public interface SomeDtoMapper {
    @Mapping(target = "strProp", source = "strProp")
    @Mapping(target = "intProp", source = "intProp")
    @Mapping(target = "charProp", source = "charProp")
    @Mapping(target = "longProp", source = "longProp")
    @Mapping(target = "someResponsePartDto", source = "someRequestPartDto")
    SomeResponseDto toResponseDto(SomeRequestDto someRequestDto);
}
