package com.lavakumar.parkinglotDee.repo;

import com.lavakumar.parkinglotDee.entity.Parking;

import java.util.HashMap;
import java.util.Map;

public class parkingRepo {
    Map<Integer, Parking> availableSlots = new HashMap<>();
    void createParking(Integer floor,String parkingName,Integer slots){
        if(availableSlots.containsKey(floor)){

        }
    }
}
