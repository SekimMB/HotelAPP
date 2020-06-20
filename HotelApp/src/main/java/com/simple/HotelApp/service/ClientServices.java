package com.simple.HotelApp.service;

import com.simple.HotelApp.domain.DTO.ClientEditDTO;
import com.simple.HotelApp.domain.entity.Client;
import com.simple.HotelApp.domain.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServices {
    private final ClientRepository temp_client;

    @Autowired
    public ClientServices(ClientRepository temp_client) {
        this.temp_client = temp_client;
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


}
