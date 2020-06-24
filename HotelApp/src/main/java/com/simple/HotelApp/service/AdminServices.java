package com.simple.HotelApp.service;

import com.simple.HotelApp.domain.DTO.AddRoomDTO;
import com.simple.HotelApp.domain.DTO.ClientEditDTO;
import com.simple.HotelApp.domain.entity.Admin;
import com.simple.HotelApp.domain.entity.Client;
import com.simple.HotelApp.domain.entity.LoggedClient;
import com.simple.HotelApp.domain.entity.Room;
import com.simple.HotelApp.domain.repository.AdminRepository;
import com.simple.HotelApp.domain.repository.ClientRepository;
import com.simple.HotelApp.domain.repository.LoggedClientRepository;
import com.simple.HotelApp.domain.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServices {
    private final AdminRepository admins;
    private final RoomRepository rooms;
    private final LoggedClientRepository logclients;

    @Autowired
    public AdminServices(AdminRepository admin1, RoomRepository rooms1, LoggedClientRepository logclients1){
        this.admins = admin1;
        this.rooms = rooms1;
        this.logclients = logclients1;};

    public void addRoom(AddRoomDTO newroom){
        Room addedRoom = new Room();
        addedRoom.setState(newroom.getState());
        addedRoom.setOccupant(newroom.getOccupant());
        addedRoom.setPrice(newroom.getPrice());
        addedRoom.setSize(newroom.getSize());
        rooms.save(addedRoom);
    }

    public void changeRoomPrice(Integer id,double newprice){
            Room pricechange = rooms.getOne(id);
            pricechange.setPrice(newprice);
            rooms.save(pricechange);
    }

    public void deleteRoom(Integer id){
        rooms.deleteById(id);
    }

    public void deleteAccount(Integer id){
        logclients.deleteById(id);
    }

}
