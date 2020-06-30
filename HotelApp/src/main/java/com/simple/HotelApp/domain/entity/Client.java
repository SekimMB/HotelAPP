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
    @Column(name = "login")
    String login;
    @Column(name = "password")
    String password;
    @Column(name = "surname")
    String surname;
    @Column(name = "email")
    String email;
    @Column(name = "account_number")
    String account_number;
    @Column(name = "phone")
    String phone;

    public Client(){};

    public Client(String name, String surname, String email, String account_number, String phone,
    String login, String password) {
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
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

    public String getAccount_number() {
        return account_number;
    }

    public String getPhone() {
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

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLogin() { return login; }

    public void setLogin(String login) { this.login = login; }

    public String getPassword() { return password; }

    public void setPassword(String password) { this.password = password; }
}
