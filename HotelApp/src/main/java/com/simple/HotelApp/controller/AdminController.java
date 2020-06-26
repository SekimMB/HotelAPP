package com.simple.HotelApp.controller;

import com.simple.HotelApp.domain.DTO.AddRoomDTO;
import com.simple.HotelApp.service.AdminServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class AdminController {
    AdminServices admins;

    @Autowired
    public AdminController(AdminServices admins) {
        this.admins = admins;
    }

    @CrossOrigin
    @PostMapping(value = "/admin/add_room")
    public String addRoom(@RequestBody AddRoomDTO newroom) {
        admins.addRoom(newroom);
        return "Added room";
    }

    @CrossOrigin
    @PutMapping(value = "/admin/change_room_price")
    public String changeRoomPrice(@RequestParam int id, double price) {
        admins.changeRoomPrice(id,price);
        return "Price changed";
    }
}
