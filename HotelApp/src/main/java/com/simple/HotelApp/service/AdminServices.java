package com.simple.HotelApp.service;

import com.simple.HotelApp.domain.DTO.AddRoomDTO;
import com.simple.HotelApp.domain.entity.Reservation;
import com.simple.HotelApp.domain.entity.Room;
import com.simple.HotelApp.domain.repository.AdminRepository;
import com.simple.HotelApp.domain.repository.LoggedClientRepository;
import com.simple.HotelApp.domain.repository.ReservationRepository;
import com.simple.HotelApp.domain.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServices {
    private final RoomRepository rooms;
    private final LoggedClientRepository logclients;
    private final ReservationRepository reservations;

    @Autowired
    public AdminServices(ReservationRepository reservations, RoomRepository rooms1, LoggedClientRepository logclients1){
        this.rooms = rooms1;
        this.logclients = logclients1;
        this.reservations = reservations;};

    public void addRoom(AddRoomDTO newroom){
        Room addedRoom = new Room();
        addedRoom.setState(newroom.getState());
        addedRoom.setOccupant(newroom.getOccupant());
        addedRoom.setPrice(newroom.getPrice());
        addedRoom.setSize(newroom.getSize());
        rooms.save(addedRoom);
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
