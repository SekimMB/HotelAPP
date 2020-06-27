package com.simple.HotelApp.domain.DTO;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class NewReservationDTO {
    Integer id_client;
    Integer id_room;
    Date start_date;
    Date end_date;


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
        return start_date;
    }

    public void setStart(String start) throws ParseException {
        Date date1= (Date) new SimpleDateFormat("dd/MM/yyyy").parse(start);
        this.start_date = date1;
    }

    public Date getEnd() {
        return end_date;
    }

    public void setEnd(String end) throws ParseException {
        Date date1= (Date) new SimpleDateFormat("dd/MM/yyyy").parse(end);
        this.end_date = date1; }
}
