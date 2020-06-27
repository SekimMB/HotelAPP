package com.simple.HotelApp.domain.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name="Reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reservation")
    Integer id_reservation;
    @Column(name = "id_client")
    Integer id_client;
    @Column(name = "id_room")
    Integer id_room;
    @Column(name = "start_date")
    Date start_date;
    @Column(name = "end_date")
    Date end_date;

    public Reservation(){};

    public Reservation(Integer id_client, Integer id_room, Date start_date, Date end_date) {
        this.id_client = id_client;
        this.id_room = id_room;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public Integer getId_reservation() {
        return id_reservation;
    }

    public void setId_reservation(Integer id_reservation) {
        this.id_reservation = id_reservation;
    }

    public Integer getId_client() {
        return id_client;
    }

    public void setId_client(Integer id_client) {
        this.id_client = id_client;
    }

    public Integer getId_room() {
        return id_room;
    }

    public void setId_room(Integer id_room) {
        this.id_room = id_room;
    }

    public Date getStart() {
        return start_date;
    }

    public void setStart(Date start) {
        this.start_date = start;
    }

    public Date getEnd() {
        return end_date;
    }

    public void setEnd(Date end) { this.end_date = end; }
}
