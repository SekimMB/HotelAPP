package com.simple.HotelApp.service;

import com.simple.HotelApp.domain.DTO.ClientEditDTO;
import com.simple.HotelApp.domain.entity.Client;
import com.simple.HotelApp.domain.entity.Room;
import com.simple.HotelApp.domain.repository.ClientRepository;
import com.simple.HotelApp.domain.repository.ReservationRepository;
import com.simple.HotelApp.domain.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ReceptionistServices {
    private final ClientRepository temp_client;
    private final RoomRepository rooms;
    private final ReceptionistServices reception;

    @Autowired
    public ReceptionistServices(ClientRepository temp_client, RoomRepository rooms, ReceptionistServices reception) {
        this.temp_client = temp_client;
        this.rooms = rooms;
        this.reception = reception;
    }

    public void addClientData(ClientEditDTO cedit){
        Client clientToUpdate = temp_client.getOne(cedit.getId());
        clientToUpdate.setName(cedit.getName());
        temp_client.save(clientToUpdate);
    }

    public void takePayment(Integer id, double payment){

    }

    public void checkIn(Integer clientId,Integer roomId){
        Room roomToUpdate = rooms.getOne(roomId);
        roomToUpdate.setOccupant(clientId);
        rooms.save(roomToUpdate);
    }

    public void checkOut(Integer clientId,Integer roomId){
        Room roomToUpdate = rooms.getOne(roomId);
        roomToUpdate.setOccupant(null);
        rooms.save(roomToUpdate);
    }
}
