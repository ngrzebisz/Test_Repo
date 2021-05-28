package com.meli.Calculadoram.Service;

import com.meli.Calculadoram.DTO.CalculadoramResponseEntityDTO;
import com.meli.Calculadoram.DTO.HouseDTO;
import com.meli.Calculadoram.Exception.BarrioNotFoundException;
import org.springframework.http.ResponseEntity;

public interface ICalculadoramService {
    ResponseEntity<CalculadoramResponseEntityDTO> calculate (HouseDTO casa) throws BarrioNotFoundException;
}
