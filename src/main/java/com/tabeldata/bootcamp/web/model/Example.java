package com.tabeldata.bootcamp.web.model;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Example {

    @NotNull(message = "gak boleh null")
    @NotEmpty(message = "gak boleh kosong")
    private String message;
    private String other;
    @Min(value = 0, message = "gak boleh minus")
    private BigDecimal salary;
    @Null(message = "gak boleh null")
    private Boolean isActive;
    private LocalDateTime transactionDatetime;
    private LocalDate transactionDate;
}
