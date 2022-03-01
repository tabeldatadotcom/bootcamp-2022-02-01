package com.tabeldata.bootcamp.web.controller;

import com.tabeldata.bootcamp.web.model.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api")
public class HaloController {

    @GetMapping(value = "/show")
    public Example showData(){
        Example data = new Example();
        data.setMessage("halo saya sedang belajar web service dengan json");
        data.setOther("test");
        data.setSalary(new BigDecimal(10000));
        data.setIsActive(false);
        data.setTransactionDatetime(LocalDateTime.now());
        data.setTransactionDate(LocalDate.now());
        return data;
    }
}
