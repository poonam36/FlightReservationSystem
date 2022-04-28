package com.poonam.flightResSys;

public abstract class Ticket {
    private int seatNumber;
    private String PNRNumber;
    private double ticketPrice;
    private String duration;
    private String departureDate;
    private String departureTime;
    private String arrivalDate;
    private String arrivalTime;
    private Flight flight;
    private Passenger passenger;
    private boolean confirmedTicket;


    public Ticket(int seatNumber, String PNRNumber, double ticketPrice, String duration, String departureDate, String departureTime, String arrivalDate, String arrivalTime, Flight flight, Passenger passenger) {
        this.seatNumber = seatNumber;
        this.PNRNumber = PNRNumber;
        this.ticketPrice = ticketPrice;
        this.duration = duration;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.arrivalDate = arrivalDate;
        this.arrivalTime = arrivalTime;
        this.flight = flight;
        this.passenger = passenger;
        this.confirmedTicket = true;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public String getPNRNumber() {
        return PNRNumber;
    }


    public double getTicketPrice() {
        return ticketPrice;
    }

    public String getDuration() {
        return duration;
    }

    public String getDepartureDate() {
        return departureDate;
    }


    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public Flight getFlight() {
        return flight;
    }


    public Passenger getPassenger() {
        return passenger;
    }



    public String checkStatus() {
        if (confirmedTicket)
        {
         return "confirmed";
        }else {
       return "cancelled";
        }

    }

    public void cancelTicket() {
        this.confirmedTicket = false;
    }
}
