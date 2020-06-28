package com.simple.HotelApp.domain.entity;

import javax.persistence.*;

@Entity
@Table(name="LoggedClient")
public class LoggedClient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;
    @Column(name = "login")
    String login;
    @Column(name = "password")
    String password;
    @Column(name = "name")
    String name;
    @Column(name = "surname")
    String surname;
    @Column(name = "email")
    String email;
    @Column(name = "bank_acc_number")
    String bank_acc_number;
    @Column(name = "phone")
    String phone;

    public LoggedClient(){};

    public LoggedClient(String login, String password, String name, String surname, String email, String bank_acc_number, String phone) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.bank_acc_number = bank_acc_number;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
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

    public String getBank_acc_number() {
        return bank_acc_number;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public void setBank_acc_number(String bank_acc_number) {
        this.bank_acc_number = bank_acc_number;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
