package com.tabeldata.bootcamp.web.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HaloController {

    @GetMapping(value = "/show",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String showData(){
        return "{\n" +
                "  \"message\"" +
                " : \"halo saya sedang belajar web service dengan json\",\n" +
                "  \"other\": \"test\",\n" +
                "  \"salary\": 10000,\n" +
                "  \"isActive\": true,\n" +
                "  \"transactionDatetime\": \"2022-10-10T10:00:00\",\n" +
                "  \"transactionDate\": \"2022-10-10\"\n" +
                "}";
    }
}
