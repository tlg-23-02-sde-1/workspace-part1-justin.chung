package com.transportation;

class BoatClient {
    public static void main(String[] args) {
        Boat boat = new Boat("1234567890");
        boat.moveTo("Mars");
    }
}