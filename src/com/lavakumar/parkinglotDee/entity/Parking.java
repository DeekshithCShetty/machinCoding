package com.lavakumar.parkinglotDee.entity;

public class Parking {
    String parkingId;
    Integer floor;
    Integer totalSlot;
    Integer truckSlotAvailable=1;
    Integer bikeSlotAvailable=2;
    Integer carSlotAvailable;

    public Parking(String parkingId, Integer floor, Integer totalSlot) {
        this.parkingId = parkingId;
        this.floor = floor;
        this.totalSlot = totalSlot;
        this.carSlotAvailable=totalSlot-3;
    }
}
