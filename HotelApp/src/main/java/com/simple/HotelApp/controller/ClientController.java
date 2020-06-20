package com.simple.HotelApp.controller;

import com.simple.HotelApp.domain.DTO.ClientEditDTO;
import com.simple.HotelApp.domain.entity.Client;
import com.simple.HotelApp.service.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/api")
public class ClientController {
    ClientServices cService;

    @Autowired
    public ClientController(ClientServices cService) {
        this.cService = cService;
    }

    @CrossOrigin
    @GetMapping(value ="/client")
    public List<Client> getAll(){
        return cService.getAll();
    }

    @CrossOrigin
    @GetMapping(value ="/client/{id}")
    public Optional<Client> getById(@PathVariable Integer id){
        return cService.getById(id);
    }

    @CrossOrigin
    @DeleteMapping(value ="/client/{id}")
    public String removeById(@PathVariable Integer id){
        cService.removeClientById(id);
        return "Works";
    }

    @CrossOrigin
    @PostMapping(value ="/client/")
    public String addClient(@RequestBody ClientEditDTO newclient){
        cService.addClient(newclient);
        return "Works";
    }

    @CrossOrigin
    @PutMapping(value ="/client/")
    public String editClient(@RequestBody ClientEditDTO newclient){
        cService.editClient(newclient);
        return "Works";
    }

}
