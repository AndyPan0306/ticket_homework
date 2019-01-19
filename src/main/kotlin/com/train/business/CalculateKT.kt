package com.train.business

class CalculateKT {

    fun ticketCalculate(sum: Int, num: Int): Int {

        val onceTicket = 1000 * (sum - num)
        val twiceTicket = 1800 * num

        return onceTicket + twiceTicket
    }

}