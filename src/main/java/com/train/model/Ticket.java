package com.train.model;

public class Ticket {

    private String placeName;
    private int num;

    public Ticket(String placeName, int num) {
        this.placeName = placeName;
        this.num = num;
    }

    public String getPlaceName() {
        return placeName;
    }

    public int getNum() {
        return num;
    }

}
