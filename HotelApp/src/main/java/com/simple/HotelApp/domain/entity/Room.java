package com.simple.HotelApp.domain.entity;

import javax.persistence.*;

@Entity
@Table(name="Room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_room")
    Integer id_room;
    @Column(name = "state")
    String state;
    @Column(name = "price")
    String price;
    @Column(name = "size")
    String size;
    @Column(name = "occupant")
    String occupant;

    public Room(){};

    public Room(String state, String price, String size, String occupant) {
        this.state = state;
        this.price = price;
        this.size = size;
        this.occupant = occupant;
    }

    public Integer getId_room() {
        return id_room;
    }

    public void setId_room(Integer id_room) {
        this.id_room = id_room;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getOccupant() {
        return occupant;
    }

    public void setOccupant(String occupant) {
        this.occupant = occupant;
    }
}
