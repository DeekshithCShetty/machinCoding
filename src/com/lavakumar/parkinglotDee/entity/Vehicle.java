package com.lavakumar.parkinglotDee.entity;

public class Vehicle {
    String regNo;
    String colour;
    VehicleType vehicleType;

    public Vehicle(String regNo, String colour, VehicleType vehicleType) {
        this.regNo = regNo;
        this.colour = colour;
        this.vehicleType = vehicleType;
    }
}
