package com.simple.HotelApp.controller;

import com.simple.HotelApp.domain.DTO.NewReservationDTO;
import com.simple.HotelApp.service.ReservationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api")
public class ReservationController {
    ReservationServices rService;

    @Autowired
    public ReservationController(ReservationServices services) {
        this.rService = services;
    }

    //works more or less
    @CrossOrigin
    @PostMapping(value = "/reservation")
    public String addReservation(@RequestBody NewReservationDTO newreserv) {
        rService.addReservation(newreserv);
        return "Added reservation";
    }

    //works
    @CrossOrigin
    @DeleteMapping(value = "/reservation{Id}")
    public String removeReservation(@PathVariable int Id) {
        rService.removeReservation(Id);
        return "removed reservation";
    }

}
