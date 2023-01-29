package br.com.fiap.abctechapi.application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Data
@AllArgsConstructor
public class OrderLocationDto {
    @NotNull
    private Double latitude;
    @NotNull
    private Double longitude;

    @PastOrPresent
    private Date dateTime;

}
