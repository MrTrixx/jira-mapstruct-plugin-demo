package ru.jira.mapstruct.plugin.demo.dto;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonProperty;

@Data
public class SomeResponseDto {
    @JsonProperty
    private String strProp;
    @JsonProperty
    private int intProp;
    @JsonProperty
    private char charProp;
    @JsonProperty
    private Long longProp;
    @JsonProperty
    private SomeResponsePartDto someResponsePartDto;

    @Data
    public static class SomeResponsePartDto {
        @JsonProperty
        private String strProp1;
        @JsonProperty
        private int intProp1;
        @JsonProperty
        private char charProp1;
        @JsonProperty
        private Long longProp1;
    }
}
