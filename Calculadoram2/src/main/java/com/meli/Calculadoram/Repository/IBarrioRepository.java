package com.meli.Calculadoram.Repository;

import com.meli.Calculadoram.DTO.BarrioDTO;
import com.meli.Calculadoram.Exception.BarrioNotFoundException;

public interface IBarrioRepository {

    BarrioDTO buscarbarrio (String nombre) throws BarrioNotFoundException;

}
