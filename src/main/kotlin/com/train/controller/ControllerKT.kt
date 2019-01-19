package com.train.controller

import com.train.business.CalculateKT
import com.train.model.TicketKT
import javax.swing.JOptionPane

class ControllerKT {

    private lateinit var ticketKT: TicketKT
    private lateinit var calculateKT: CalculateKT
    private lateinit var num: String
    private lateinit var sum: String
    private var ticketCalculate = 0

    private fun question() {
        val place = JOptionPane.showInputDialog("Which side do you want to go from?")
        sum = JOptionPane.showInputDialog("Please enter number of ticket ")
        num = JOptionPane.showInputDialog("How many round-trip ticket?")

        ticketKT = TicketKT(place, sum.toInt())
        calculateKT = CalculateKT()
        ticketCalculate = calculateKT.ticketCalculate(ticketKT.number!!, num.toInt())
    }

    fun printQuestion() {
        question()

        println("Station :${ticketKT.station}")
        println("Total tickets :$sum")
        println("round-trip:$num")
        println("Total :$ticketCalculate")
    }

}