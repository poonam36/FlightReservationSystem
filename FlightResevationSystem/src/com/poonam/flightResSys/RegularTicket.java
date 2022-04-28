package com.poonam.flightResSys;

public class RegularTicket extends Ticket {
    String specialServices;

    public RegularTicket(int seatNumber, String PNRNumber, double ticketPrice, String duration, String departureDate, String departureTime, String arrivalDate, String arrivalTime, Flight flight, Passenger passenger, String specialServices) {
        super(seatNumber, PNRNumber, ticketPrice, duration, departureDate, departureTime, arrivalDate, arrivalTime, flight, passenger);
        this.specialServices = specialServices;
    }


    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
}
