package com.meli.Calculadoram.DTO;

import java.util.ArrayList;

public class CalculadoramResponseEntityDTO {
    private int Area_total;
    private int precio;
    private RoomDTO Hab_mas_grande;
    private ArrayList<RoomDTO> Habitaciones;

    public int getArea_total() {
        return Area_total;
    }

    public void setArea_total(int area_total) {
        Area_total = area_total;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public RoomDTO getHab_mas_grande() {
        return Hab_mas_grande;
    }

    public void setHab_mas_grande(RoomDTO hab_mas_grande) {
        Hab_mas_grande = hab_mas_grande;
    }

    public ArrayList<RoomDTO> getHabitaciones() {
        return Habitaciones;
    }

    public void setHabitaciones(ArrayList<RoomDTO> habitaciones) {
        Habitaciones = habitaciones;
    }
}
