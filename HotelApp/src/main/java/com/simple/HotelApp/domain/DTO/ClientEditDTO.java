package com.simple.HotelApp.domain.DTO;

public class ClientEditDTO {
    Integer id;
    String name,surname,email,bank_acc_number,phone;


    public ClientEditDTO(Integer id, String name, String surname, String email,String bank_number,String phone) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.bank_acc_number = bank_number;
        this.phone = phone;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBank_acc_number() {
        return bank_acc_number;
    }

    public void setBank_acc_number(String bank_acc_number) {
        this.bank_acc_number = bank_acc_number;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
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
