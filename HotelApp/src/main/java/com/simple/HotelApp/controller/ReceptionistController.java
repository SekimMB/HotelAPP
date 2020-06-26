package com.simple.HotelApp.controller;

import com.simple.HotelApp.domain.DTO.ClientEditDTO;
import com.simple.HotelApp.domain.entity.Client;
import com.simple.HotelApp.service.ReceptionistServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class ReceptionistController {
    ReceptionistServices recService;

    @Autowired
    public ReceptionistController(ReceptionistServices recService) {
        this.recService = recService;
    }

    @CrossOrigin
    @PostMapping(value = "/receptionist/newclient")
    public String addClientData(@RequestBody ClientEditDTO addclient) {
        recService.addClientData(addclient);
        return "Client added";
    }

    @CrossOrigin
    @PutMapping(value = "/receptionist/check_in{id_client}{id_room}")
    public String checkIn(@PathVariable int id_client,int id_room) {
        recService.checkIn(id_client,id_room);
        return "Client checked in";
    }

    @CrossOrigin
    @PutMapping(value = "/receptionist/check_out{id_client}{id_room}")
    public String checkOut(@PathVariable int id_client,int id_room) {
        recService.checkOut(id_client,id_room);
        return "Client checked out";
    }

}
