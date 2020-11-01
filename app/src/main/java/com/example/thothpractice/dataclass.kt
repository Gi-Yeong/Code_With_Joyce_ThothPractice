package com.example.thothpractice

data class Ticket(val companyName: String, val name: String, var date: String, var seatNumber: Int)

class TicketNormal(val companyName: String, val name: String, var date: String, var seatNumber: Int)

// toString(), hashCode(), equals(), copy() 가 자동으로 만들어 진다

fun main() {

    val ticketA = Ticket("koreanAir", "ThothKim", "2020-02-16", 14)
    val ticketB = TicketNormal("koreanAir", "ThothKim", "2020-02-16", 14)

    println(ticketA)
    println(ticketB)

}