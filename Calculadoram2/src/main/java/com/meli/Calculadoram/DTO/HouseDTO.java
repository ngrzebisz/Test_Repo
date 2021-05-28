package com.meli.Calculadoram.DTO;

import java.util.ArrayList;

public class HouseDTO {
    private String address;
    private String barrio;
    private ArrayList<RoomDTO> habitaciones;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<RoomDTO> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(ArrayList<RoomDTO> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
}
