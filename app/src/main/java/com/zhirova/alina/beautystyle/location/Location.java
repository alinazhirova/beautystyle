package com.zhirova.alina.beautystyle.location;


public class Location {

    private String address;

    public static final Location[] locations = {
            new Location("г.Самара, ул. Упитанных котиков, д. 12, оф.102"),
            new Location("г.Самара, ул. Велосипедов и костылей, д. 208"),
            new Location("г.Самара, ул. Светлого будущего, д. 305а"),
    };


    public Location(String address) {
        this.address = address;
    }


    public String getAddress() {
        return address;
    }


    public String toString() {
        return this.address;
    }


}
