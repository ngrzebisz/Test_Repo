package com.meli.Calculadoram.Controller;

import com.meli.Calculadoram.DTO.*;
import com.meli.Calculadoram.Exception.BarrioNotFoundException;
import com.meli.Calculadoram.Service.CalculadoramService;
import com.meli.Calculadoram.Service.ICalculadoramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController

public class CalculadoramController {

    @Autowired
    @Qualifier("PostaService")
    ICalculadoramService service;

    @PostMapping ("/Calculadora_M2")
    public ResponseEntity<CalculadoramResponseEntityDTO> ageCalculatorPost (@RequestBody HouseDTO casa) throws BarrioNotFoundException {
        return service.calculate(casa);
    }
}
