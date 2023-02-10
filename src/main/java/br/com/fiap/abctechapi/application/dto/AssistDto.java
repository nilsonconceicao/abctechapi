package br.com.fiap.abctechapi.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssistDto {
    private Long id;
    private String name;
    private String description;
}
