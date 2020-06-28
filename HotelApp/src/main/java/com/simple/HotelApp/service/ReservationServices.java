package com.simple.HotelApp.service;

import com.simple.HotelApp.domain.DTO.NewReservationDTO;
import com.simple.HotelApp.domain.entity.Reservation;
import com.simple.HotelApp.domain.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;

@Service
public class ReservationServices {
    private final ReservationRepository reservations;

    @Autowired
    public ReservationServices(ReservationRepository reservations) {this.reservations = reservations;}

    public void addReservation(NewReservationDTO res1){
        Reservation newres = new Reservation();
        newres.setId_client(res1.getId_client());
        newres.setId_room(res1.getId_room());
        try {
            newres.setStart(new Date(new SimpleDateFormat("dd/MM/yyyy").parse(res1.getStart_date()).getTime()));
            newres.setEnd(new Date(new SimpleDateFormat("dd/MM/yyyy").parse(res1.getEnd_date()).getTime()));
        }catch (ParseException pe){

        }
        reservations.save(newres);
    }

    public void removeReservation(Integer id){
        reservations.deleteById(id);
    }
}
