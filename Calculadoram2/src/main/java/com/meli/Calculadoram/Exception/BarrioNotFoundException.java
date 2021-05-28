package com.meli.Calculadoram.Exception;

import org.springframework.http.HttpStatus;

public class BarrioNotFoundException extends CalculadoramException{

    public BarrioNotFoundException(String barrio){
        super ("El barrio " + barrio + " no fue encontrado", HttpStatus.NOT_FOUND);
    }
}
