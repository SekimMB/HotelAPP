package com.simple.HotelApp.domain.DTO;

public class AddRoomDTO {
    String size,state;
    Integer occupant;
    double price;
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getOccupant() {
        return occupant;
    }

    public void setOccupant(Integer occupant) {
        this.occupant = occupant;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
