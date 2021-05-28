package com.meli.Calculadoram.Controller;

import com.meli.Calculadoram.DTO.ErrorDTO;
import com.meli.Calculadoram.Exception.BarrioNotFoundException;
import com.meli.Calculadoram.Exception.CalculadoramException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CalculadoramExceptionController {

    @ExceptionHandler(CalculadoramException.class)
    protected ResponseEntity<ErrorDTO> handleGlobalException(CalculadoramException e){
        e.printStackTrace();
        System.out.println("paso por aca");
        return new ResponseEntity<>(e.getError(),e.getReturnHttpStatus());
    }

    @ExceptionHandler(BarrioNotFoundException.class)
    protected ResponseEntity<ErrorDTO> handleBarrioException (BarrioNotFoundException e){
        e.printStackTrace();
        System.out.println("paso por aca mejor");
        return new ResponseEntity<>(e.getError(), e.getReturnHttpStatus());
    }


}
