package com.tabeldata.bootcamp.web.controller;

import com.tabeldata.bootcamp.web.model.Example;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
public class HaloController {

    @GetMapping(value = "/show")
    public Example showData(
            @RequestParam(name = "msg", required = true) String message,
            @RequestParam(name = "oth", required = false) String other,
            BigDecimal salary,
            Boolean active){
        Example data = new Example();
        data.setMessage(message);
        data.setOther(other);
        data.setSalary(salary);
        data.setIsActive(active);
        data.setTransactionDate(LocalDate.now());
        data.setTransactionDatetime(LocalDateTime.now());
        return data;
    }

    @GetMapping(value = "/input")
    public Example inputData(@RequestBody @Valid Example data){
        data.setTransactionDatetime(LocalDateTime.now());
        data.setTransactionDate(LocalDate.now());
        return data;
    }

}
