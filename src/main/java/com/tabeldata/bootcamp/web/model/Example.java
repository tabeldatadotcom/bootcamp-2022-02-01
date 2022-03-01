package com.tabeldata.bootcamp.web.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class Example {

    private String message;
    private String other;
    private BigDecimal salary;
    private Boolean isActive;
    private LocalDateTime transactionDatetime;
    private LocalDate transactionDate;
}
