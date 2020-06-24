package com.simple.HotelApp.service;

import com.simple.HotelApp.domain.entity.Reservation;
import com.simple.HotelApp.domain.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ReservationServices {
    private final ReservationRepository reservations;

    @Autowired
    public ReservationServices(ReservationRepository reservations) {this.reservations = reservations;}

    public void addReservation(Reservation res1){
        reservations.save(res1);
    }

    public void removeReservation(Integer id){
        reservations.deleteById(id);
    }
}
