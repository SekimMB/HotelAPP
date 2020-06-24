package com.simple.HotelApp.service;

import com.simple.HotelApp.domain.DTO.ClientEditDTO;
import com.simple.HotelApp.domain.DTO.ShowRoomDTO;
import com.simple.HotelApp.domain.entity.Client;
import com.simple.HotelApp.domain.entity.Reservation;
import com.simple.HotelApp.domain.entity.Room;
import com.simple.HotelApp.domain.repository.ClientRepository;
import com.simple.HotelApp.domain.repository.ReservationRepository;
import com.simple.HotelApp.domain.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClientServices {
    private final ClientRepository temp_client;
    private final RoomRepository rooms;
    private final ReservationRepository reservations;

    @Autowired
    public ClientServices(ClientRepository temp_client, RoomRepository rooms, ReservationRepository reservations) {
        this.temp_client = temp_client;
        this.rooms = rooms;
        this.reservations = reservations;
    }

    public void addClient(ClientEditDTO client1){
        Client test = new Client();
        test.setName(client1.getName());
        temp_client.save(test);
    }

    public void removeClientById(Integer id){
        //check if exists
        temp_client.deleteById(id);
    }

    public List<Client> getAll(){
        return temp_client.findAll();
    }

    public Optional<Client> getById(Integer id){
        return temp_client.findById(id);
    }

    public void editClient(ClientEditDTO eclient){
       Client clientToUpdate = temp_client.getOne(eclient.getId());
        clientToUpdate.setName(eclient.getName());
        temp_client.save(clientToUpdate);
    }

    public List<ShowRoomDTO> showRooms(){
        // to do, assign variables to showrooms
        List<Room> showlist = rooms.findAll();
        showlist.stream().filter(e->e.getOccupant()==null).filter(e->e.getState()=="functional").collect(Collectors.toList());
        List<ShowRoomDTO> showrooms = null;
        showrooms.forEach(shrooms->shrooms.setId(1));
        return showrooms;
    }

    public void logIn(){
        // see jwc security token for implementation
        // without security just download all of data of client with id
        Optional<Client> loggedclient = temp_client.findById(1);
    }

    public void logOut(){
        // see jwc security token for implementation
        // without security reset Client
        Optional<Client> loggedclient = temp_client.findById(1);
    }

    public List<Reservation> getRoomHistory(Integer id){
        List<Reservation> clientreservation = reservations.findAll();
       return clientreservation.stream().filter(e->e.getId_client()==id).collect(Collectors.toList());
    }

    public void checkPaymentHistory(Integer id){
        List <Reservation> paymenthistory = getRoomHistory(id);
        // to do, get price of all the rooms
        paymenthistory.forEach(Reservation::getId_room);
        
    }



}
