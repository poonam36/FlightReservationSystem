package com.poonam.flightResSys;

public class Main {

    //prints pnr number of the given ticket
    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPNRNumber());
    }


    public static void main(String[] args) {

        //Register 2 passengers using Passenger constructor
        Passenger p1 = new Passenger("poonam", "6575364896", "poonamSingh@gmail.com", "Hyderabad", "Telangana", "Hi-TechCity");
        Passenger p2 = new Passenger("atul", "4324543345", "atulSingh@gmail.com", "Hyderabad", "Telangana", "Hi-TechCity");
        //Creating 2 flight instances
        Flight f1 = new Flight("Spicejet", "APS231");
        Flight f2 = new Flight("Indigo", "JST876");

        //Check flight availability before booking the ticket
        if (f1.getAvailableSeat() > 1) {
            //booking regular ticket
            RegularTicket rt = new RegularTicket(23, "24567890", 6896.00, "2 hrs", "07/05/2022", "05:00", "07/05/2022", "07:00", f1, p1, "food");
            printTicketDetails(rt);
        }
        if (f2.getAvailableSeat() > 1) {
            //booking tourist ticket
            TouristTicket tt = new TouristTicket(24, "45678987", 10754.54, "8 hrs", "15/03/2023", "13:05", "15/03/2023", "22:10", f2, p2, "Lemontree Gachibowli", "Hyderabad");
            printTicketDetails(tt);
        }
    }
}
