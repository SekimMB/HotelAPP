package com.simple.HotelApp.domain.entity;

import javax.persistence.*;

@Entity
@Table(name="Admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_admin")
    Integer id_admin;
    @Column(name = "name")
    String name;
    @Column(name = "surname")
    String surname;

    public Admin(){};

    public Admin(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Integer getId_admin() {
        return id_admin;
    }

    public void setId_admin(Integer id_admin) {
        this.id_admin = id_admin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
