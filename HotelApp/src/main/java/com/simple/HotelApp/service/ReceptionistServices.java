package com.simple.HotelApp.service;

import com.simple.HotelApp.domain.DTO.ClientEditDTO;
import com.simple.HotelApp.domain.entity.Client;
import com.simple.HotelApp.domain.entity.Room;
import com.simple.HotelApp.domain.repository.ClientRepository;
import com.simple.HotelApp.domain.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceptionistServices {
    private final ClientRepository temp_client;
    private final RoomRepository rooms;

    @Autowired
    public ReceptionistServices(ClientRepository temp_client, RoomRepository rooms) {
        this.temp_client = temp_client;
        this.rooms = rooms;
    }

    public void addClientData(ClientEditDTO cedit){
        Client newclient = new Client();
        newclient.setName(cedit.getName());
        newclient.setSurname(cedit.getSurname());
        newclient.setPhone(cedit.getPhone());
        newclient.setEmail(cedit.getEmail());
        newclient.setAccount_number(cedit.getBank_acc_number());
        temp_client.save(newclient);
    }

    public void checkIn(Integer clientId,Integer roomId){
        Room roomToUpdate = rooms.getOne(roomId);
        roomToUpdate.setOccupant(clientId);
        roomToUpdate.setState("Occupied");
        rooms.save(roomToUpdate);
    }

    public void checkOut(Integer clientId,Integer roomId){
        Room roomToUpdate = rooms.getOne(roomId);
        roomToUpdate.setOccupant(null);
        roomToUpdate.setState("Free");
        rooms.save(roomToUpdate);
    }

}
