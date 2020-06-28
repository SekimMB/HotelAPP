package com.simple.HotelApp.domain.DTO;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class NewReservationDTO {
    Integer id_client;
    Integer id_room;
    String start_date;
    String end_date;


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

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }
}
// gdzie ten twój kod dac ?
