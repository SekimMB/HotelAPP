package com.simple.HotelApp.service;

import com.simple.HotelApp.domain.DTO.ClientEditDTO;
import com.simple.HotelApp.domain.DTO.ShowRoomDTO;
import com.simple.HotelApp.domain.entity.Client;
import com.simple.HotelApp.domain.entity.LoggedClient;
import com.simple.HotelApp.domain.entity.Reservation;
import com.simple.HotelApp.domain.entity.Room;
import com.simple.HotelApp.domain.repository.ClientRepository;
import com.simple.HotelApp.domain.repository.LoggedClientRepository;
import com.simple.HotelApp.domain.repository.ReservationRepository;
import com.simple.HotelApp.domain.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClientServices {
    private final ClientRepository temp_client;
    private final RoomRepository rooms;
    private final ReservationRepository reservations;
    private final LoggedClientRepository logged_client;

    @Autowired
    public ClientServices(ClientRepository temp_client, RoomRepository rooms, ReservationRepository reservations,
                          LoggedClientRepository logged_client) {
        this.temp_client = temp_client;
        this.rooms = rooms;
        this.reservations = reservations;
        this.logged_client = logged_client;
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
        clientToUpdate.setAccount_number(eclient.getBank_acc_number());
        clientToUpdate.setSurname(eclient.getSurname());
        clientToUpdate.setEmail(eclient.getEmail());
        clientToUpdate.setPhone(eclient.getPhone());
        temp_client.save(clientToUpdate);
    }

    public List<ShowRoomDTO> getAvailableRooms(){
        List<ShowRoomDTO> showAvailableRooms = null;
        List<Room> availablerooms = rooms.findAll();
        availablerooms = availablerooms.stream()
                .filter(e->e.getOccupant()==null)
                .filter(e->e.getState()=="functional").collect(Collectors.toList());
        showAvailableRooms = availablerooms.stream()
                .map(newroom->{
                    ShowRoomDTO showroom = new ShowRoomDTO();
                    showroom.setId(newroom.getId_room());
                    showroom.setPrice(newroom.getPrice());
                    showroom.setSize(newroom.getSize());
                    return showroom;
                })
                .collect(Collectors.toList());
        return showAvailableRooms;
    }

    public void logIn(String login,String password){
        // see jwc security token for implementation
        // without security just download all of data of client with id
        Optional<Client> loggedclient = logged_client.findAll().stream().
                filter(l->l.getLogin()==login && l.getPassword()==password);
    }

    public void logOut(){
        // see jwc security token for implementation
        // without security reset Client
        Optional<Client> loggedclient = temp_client.findById(1);
    }

    public List<Reservation> getPastReservations(Integer id){
        List<Reservation> clientreservation = reservations.findAll();
       return clientreservation.stream().filter(e->e.getId_client()==id).collect(Collectors.toList());
    }
    public List<Reservation> getCurrentReservations(Integer id){
        List<Reservation> clientreservation = reservations.findAll();
        return clientreservation.stream()
                .filter(e->e.getId_client()==id)
                .filter(e->e.getEnd().toLocalDate().isAfter(LocalDate.now()))
                .collect(Collectors.toList());
    }

    public void getPaymentHistory(Integer id){
        List <Reservation> paymenthistory = getPastReservations(id);
        // to do, get price of all the rooms
        List<Reservation>transactionHistory = paymenthistory.forEach(e->e.getId_room());

    }



}
