package com.train.controller;

import com.train.business.Calculate;
import com.train.model.Ticket;

import javax.swing.*;
import java.awt.*;

public class Controller {

    private Ticket ticket;
    private Calculate calculate;
    private String num;
    private String sum;
    private int ticketCalculate;


    private void question() throws HeadlessException,NumberFormatException {
        String placeName = JOptionPane.showInputDialog("Which side do you want to go from?");
        sum = JOptionPane.showInputDialog("Please enter number of ticket ");
        num = JOptionPane.showInputDialog("How many round-trip ticket?");

        ticket = new Ticket(placeName, Integer.parseInt(sum));
        calculate = new Calculate();
        ticketCalculate = calculate.ticketCalculate(ticket.getNum(), Integer.parseInt(num));
    }

    public void printQuestion() {
        question();

        System.out.println("Station :" + ticket.getPlaceName());
        System.out.println("Total tickets:" + num);
        System.out.println("round-trip:" + sum);
        System.out.println("Total:" + ticketCalculate);
    }


}
