package com.train.business;

public class Calculate {

    private double ticket;

    public int ticketCalculate(int sum, int num) {

        int onceTicket = 1000 * (sum - num);

        int twiceTicket = 1800 * num;

        return onceTicket + twiceTicket;
    }


}
