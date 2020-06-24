package com.simple.HotelApp.domain.entity;

import javax.persistence.*;

@Entity
@Table(name="Clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;
    @Column(name = "name")
    String name;
    @Column(name = "surname")
    String surname;
    @Column(name = "email")
    String email;
    @Column(name = "account_number")
    Integer account_number;
    @Column(name = "phone")
    Integer phone;

    public Client(){};

    public Client(String name, String surname, String email, int account_number, int phone) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.account_number = account_number;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public int getAccount_number() {
        return account_number;
    }

    public int getPhone() {
        return phone;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
