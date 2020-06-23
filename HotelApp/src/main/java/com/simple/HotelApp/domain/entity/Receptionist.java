package com.simple.HotelApp.domain.entity;

import javax.persistence.*;

@Entity
@Table(name="Receptionist")
public class Receptionist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_employee")
    Integer id_employee;
    @Column(name = "name")
    String name;
    @Column(name = "surname")
    String surname;

    public Receptionist(){};

    public Receptionist(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Integer getId_employee() {
        return id_employee;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setId_employee(Integer id_employee) {
        this.id_employee = id_employee;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
