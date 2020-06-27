package com.simple.HotelApp.controller;

import com.simple.HotelApp.domain.DTO.ClientEditDTO;
import com.simple.HotelApp.domain.DTO.ReceiptDTO;
import com.simple.HotelApp.domain.DTO.ShowRoomDTO;
import com.simple.HotelApp.domain.entity.Client;
import com.simple.HotelApp.domain.entity.Reservation;
import com.simple.HotelApp.service.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
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

    @CrossOrigin
    @GetMapping(value ="/client/rooms")
    public List<ShowRoomDTO> getAvailableRooms(){
        return cService.getAvailableRooms();
    }

    @CrossOrigin
    @GetMapping(value ="/client/login")
    public int logIn(@RequestParam String login, String password){
        return cService.logIn(login,password);
    }

    @CrossOrigin
    @GetMapping(value ="/client/past_reservations{id}")
    public List<Reservation> getPastReservations(@PathVariable Integer id){
        return cService.getPastReservations(id);
    }

    @CrossOrigin
    @GetMapping(value ="/client/active_reservations{id}")
    public List<Reservation> getActiveReservations(@PathVariable Integer id){
        return cService.getActiveReservations(id);
    }

    @CrossOrigin
    @GetMapping(value ="/client/paymenthistory{id}")
    public List<ReceiptDTO> getPaymentHistory(@PathVariable Integer id){
        return cService.getPaymentHistory(id);
    }


}
