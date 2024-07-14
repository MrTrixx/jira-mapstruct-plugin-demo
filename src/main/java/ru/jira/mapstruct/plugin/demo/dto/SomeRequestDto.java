package ru.jira.mapstruct.plugin.demo.dto;

import lombok.Data;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SomeRequestDto {
    @JsonProperty
    private String strProp;
    @JsonProperty
    private int intProp;
    @JsonProperty
    private char charProp;
    @JsonProperty
    private Long longProp;
    @JsonProperty
    private SomeRequestPartDto someRequestPartDto;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SomeRequestPartDto {
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
