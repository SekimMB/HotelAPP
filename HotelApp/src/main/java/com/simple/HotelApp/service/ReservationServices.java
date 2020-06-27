package com.simple.HotelApp.service;

import com.simple.HotelApp.domain.DTO.NewReservationDTO;
import com.simple.HotelApp.domain.entity.Reservation;
import com.simple.HotelApp.domain.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationServices {
    private final ReservationRepository reservations;

    @Autowired
    public ReservationServices(ReservationRepository reservations) {this.reservations = reservations;}

    public void addReservation(NewReservationDTO res1){
        Reservation newres = new Reservation();
        newres.setId_client(res1.getId_client());
        newres.setId_room(res1.getId_room());
        newres.setStart(res1.getStart());
        newres.setEnd(res1.getEnd());
        reservations.save(newres);
    }

    public void removeReservation(Integer id){
        reservations.deleteById(id);
    }
}
