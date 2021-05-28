package com.meli.Calculadoram.Exception;

import com.meli.Calculadoram.DTO.ErrorDTO;
import org.springframework.http.HttpStatus;

public class CalculadoramException extends Exception{
    private ErrorDTO error;
    private HttpStatus returnHttpStatus;

    public ErrorDTO getError() {
        return error;
    }

    public HttpStatus getReturnHttpStatus() {
        return returnHttpStatus;
    }


    public CalculadoramException (String message, HttpStatus status){
        this.error = new ErrorDTO();
        error.setName(this.getClass().getSimpleName());
        error.setDescription(message);

        this.returnHttpStatus = status;
    }
}
