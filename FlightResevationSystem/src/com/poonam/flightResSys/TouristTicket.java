package com.poonam.flightResSys;

public class TouristTicket extends Ticket {
    private final String hotelAddress;
    private String[] touristLocation = new String[5];


    public TouristTicket(int seatNumber, String PNRNumber, double ticketPrice, String duration, String departureDate, String departureTime, String arrivalDate, String arrivalTime, Flight flight, Passenger passenger, String hotelAddress, String... touristLocation) {
        super(seatNumber, PNRNumber, ticketPrice, duration, departureDate, departureTime, arrivalDate, arrivalTime, flight, passenger);
        this.hotelAddress = hotelAddress;
        this.touristLocation = touristLocation;
    }

    //Adding location till totalLocation size as 5
    public void addLocation(String location) {
        int totalLocation = touristLocation.length;
        if (totalLocation < 5) {
            touristLocation[totalLocation] = location;
        }
    }

    public void removeLocation(String location) {
        //To do
    }
}
