package com.poonam.flightResSys;

public class Passenger {
    private static Address address;
    private static ContactDetails contactDetails;
    private static int idCounter;
    public Passenger(String name, String phoneNumber, String emailId, String city, String state, String street) {

        address = new Address(city, state, street);
        contactDetails = new ContactDetails(name, phoneNumber, emailId);
        idCounter++; //counter to count number of passenger
    }

    public int getPassengerCount() {
        return idCounter;
    }

    public Address getAddress() {
        return address;
    }

    public ContactDetails getContactDetails() {
        return contactDetails;
    }
   //Nested static private class
    private static class ContactDetails {
        private String name;
        private String phoneNumber;
        private String emailId;

        public ContactDetails(String name, String phoneNumber, String emailId) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.emailId = emailId;
        }

        public String getName() {

            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoneNumber() {

            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmailId() {

            return emailId;
        }

        public void setEmailId(String emailId) {

            this.emailId = emailId;
        }

    }
    //Nested static private class
    private static class Address {
        private String city;
        private String state;
        private String street;

        public Address(String city, String state, String street) {
            this.city = city;
            this.state = state;
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }
    }


}
