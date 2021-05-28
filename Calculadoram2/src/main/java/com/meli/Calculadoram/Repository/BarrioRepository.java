package com.meli.Calculadoram.Repository;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.meli.Calculadoram.DTO.BarrioDTO;
import com.meli.Calculadoram.Exception.BarrioNotFoundException;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

@Repository
public class BarrioRepository implements IBarrioRepository{

    List<BarrioDTO> barrios;

    public BarrioRepository(){
        this.barrios = loadfromDB();
    }

    private List<BarrioDTO> loadfromDB() {

        List<BarrioDTO> ret = null;
        File file = null;

        try {
            file = ResourceUtils.getFile("src/main/resources/m2PorBarrio.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ObjectMapper objectMapper = new ObjectMapper();

        TypeReference<List<BarrioDTO>> typeRef = new TypeReference<>() {};

        try {
            ret = objectMapper.readValue(file, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ret;

    }

    public BarrioDTO buscarbarrio (String nombre) throws BarrioNotFoundException {
        return this.barrios.stream()
                .filter(barrio -> barrio.getNombre().equals(nombre))
                .findFirst().orElseThrow(() -> new BarrioNotFoundException(nombre));
    }

}
