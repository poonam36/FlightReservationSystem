package com.poonam.flightResSys;

public class Flight {
    public static final int flightCapacity = 300; //assuming full capacity of each flight as 300
    private final String airline;
    private final String flightNumber;
    private int availableSeat = flightCapacity;  //initially available seats will be of full capacity


    public Flight(String airline, String flightNumber) {
        this.airline = airline;
        this.flightNumber = flightNumber;
        //available seats are decremented for every flight booking
        availableSeat = availableSeat - 1;
    }

    public String getAirline() {

        return airline;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public int getAvailableSeat() {
        return availableSeat;
    }


}



