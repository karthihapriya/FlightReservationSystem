package com.company;

public class Address {
    String street;
    String city;
    String state;


    String getAddressDetails() {
        return street + "," + city + "," + state;
    }

    void updateAddressDetails(String street, String city, String state){
        this.street = street;
        this.city = city;
        this.state = state;
    }
}

