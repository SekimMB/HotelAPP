package com.simple.HotelApp.controller;

import com.simple.HotelApp.domain.DTO.ClientEditDTO;
import com.simple.HotelApp.service.ReceptionistServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value="/api")
public class ReceptionistController {
    ReceptionistServices recService;

    @Autowired
    public ReceptionistController(ReceptionistServices recService) {
        this.recService = recService;
    }

    //works
    @CrossOrigin
    @PostMapping(value = "/receptionist/add_client")
    public String addClientData(@RequestBody ClientEditDTO addclient) {
        recService.addClientData(addclient);
        return "Client added";
    }

    //works
    @CrossOrigin
    @PutMapping(value = "/receptionist/check_in")
    public String checkIn(@RequestParam int id_client,int id_room) {
        recService.checkIn(id_client,id_room);
        return "Client checked in";
    }

    //works
    @CrossOrigin
    @PutMapping(value = "/receptionist/check_out")
    public String checkOut(@RequestParam int id_client,int id_room) {
        recService.checkOut(id_client,id_room);
        return "Client checked out";
    }

}
