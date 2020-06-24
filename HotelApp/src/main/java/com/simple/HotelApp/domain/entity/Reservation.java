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
    @Column(name = "start")
    Date start;
    @Column(name = "end")
    Date end;

    public Reservation(){};

    public Reservation(Integer id_client, Integer id_room, Date start, Date end) {
        this.id_client = id_client;
        this.id_room = id_room;
        this.start = start;
        this.end = end;
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
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }
}
