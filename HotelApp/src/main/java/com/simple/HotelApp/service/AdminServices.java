package com.simple.HotelApp.service;

import com.simple.HotelApp.domain.DTO.AddRoomDTO;
import com.simple.HotelApp.domain.DTO.ClientEditDTO;
import com.simple.HotelApp.domain.entity.Client;
import com.simple.HotelApp.domain.entity.Reservation;
import com.simple.HotelApp.domain.entity.Room;
import com.simple.HotelApp.domain.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServices {
    private final RoomRepository rooms;
    private final LoggedClientRepository logclients;
    private final ReservationRepository reservations;
    private final ClientRepository temp_client;

    @Autowired
    public AdminServices(ReservationRepository reservations, RoomRepository rooms1, LoggedClientRepository logclients1,
                         ClientRepository temp_client){
        this.rooms = rooms1;
        this.logclients = logclients1;
        this.reservations = reservations;
        this.temp_client = temp_client;}


    public void addRoom(AddRoomDTO newroom){
        Room addedRoom = new Room();
        addedRoom.setState(newroom.getState());
        addedRoom.setOccupant(newroom.getOccupant());
        addedRoom.setPrice(newroom.getPrice());
        addedRoom.setSize(newroom.getSize());
        rooms.save(addedRoom);
    }

    public void addClient(ClientEditDTO client1){
        Client test = new Client();
        test.setName(client1.getName());
        test.setAccount_number(client1.getBank_acc_number());
        test.setSurname(client1.getSurname());
        test.setEmail(client1.getEmail());
        test.setPhone(client1.getPhone());
        temp_client.save(test);
    }

    public void changeRoomPrice(Integer id,String newprice){
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

    public List<Reservation> showReservations() {return reservations.findAll();}

}
