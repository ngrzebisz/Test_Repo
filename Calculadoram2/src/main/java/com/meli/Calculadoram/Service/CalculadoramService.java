package com.meli.Calculadoram.Service;

import com.meli.Calculadoram.DTO.BarrioDTO;
import com.meli.Calculadoram.DTO.CalculadoramResponseEntityDTO;
import com.meli.Calculadoram.DTO.HouseDTO;
import com.meli.Calculadoram.DTO.RoomDTO;
import com.meli.Calculadoram.Exception.BarrioNotFoundException;
import com.meli.Calculadoram.Repository.IBarrioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service("PostaService")
public class CalculadoramService implements ICalculadoramService{

    @Autowired
    IBarrioRepository barrioRepository;

    @Override
    public ResponseEntity<CalculadoramResponseEntityDTO> calculate (HouseDTO casa) throws BarrioNotFoundException {
        CalculadoramResponseEntityDTO ret = new CalculadoramResponseEntityDTO();
        ArrayList<RoomDTO> Rooms = casa.getHabitaciones();
        int Area = 0;
        int Max = 0;
        int Area_total=0;

        for(RoomDTO Room : Rooms){
            Area = Room.getLength()*Room.getWidth();
            Room.setArea(Area);
            Area_total += Area;
            if (Area>Max){
                Max = Area;
                ret.setHab_mas_grande(Room);
            }
        }
        BarrioDTO barrio = barrioRepository.buscarbarrio(casa.getBarrio());
        ret.setHabitaciones(Rooms);
        ret.setArea_total(Area_total);
        ret.setPrecio(Area_total * barrio.getPrecio());

        return new ResponseEntity<>(ret, HttpStatus.I_AM_A_TEAPOT);
    }
}
