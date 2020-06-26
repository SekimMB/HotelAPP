package com.simple.HotelApp.domain.DTO;

public class ClientEditDTO {
    Integer id,bank_acc_number,phone;
    String name,surname,email;


    public ClientEditDTO(Integer id, String name,Integer phone,Integer bank_number, String surname, String email) {
        this.id = id;
        this.name = name;
        this.bank_acc_number = bank_number;
        this.phone = phone;
        this.surname = surname;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBank_acc_number() {
        return bank_acc_number;
    }

    public void setBank_acc_number(Integer bank_acc_number) {
        this.bank_acc_number = bank_acc_number;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
