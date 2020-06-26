package com.simple.HotelApp.controller;

import com.simple.HotelApp.domain.DTO.AddRoomDTO;
import com.simple.HotelApp.domain.entity.Reservation;
import com.simple.HotelApp.service.ClientServices;
import com.simple.HotelApp.service.ReservationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api")
public class ReservationController {
    ReservationServices rServices;

    @Autowired
    public ReservationController(ReservationServices service) {
        this.rServices = service;
    }

    @CrossOrigin
    @PostMapping(value = "/reservation")
    public String addReservation(@RequestBody Reservation newreserv) {
        rServices.addReservation(newreserv);
        return "Added reservation";
    }

    @CrossOrigin
    @DeleteMapping(value = "/reservation{Id}")
    public String removeReservation(@PathVariable int Id) {
        rServices.removeReservation(Id);
        return "removed reservation";
    }

}
