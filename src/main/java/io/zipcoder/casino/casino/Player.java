package io.zipcoder.casino.casino;

import java.util.ArrayList;

public class Player implements GamblingPlayer {
    private String name;
    private double wallet;
    public Player(String name) {
        this.name = name;
        this.wallet = 1000;
    }

    public double getWallet() {
        return wallet;
    }
<<<<<<< HEAD
=======


    public ArrayList<Object> hand() {
        return null;
    }
>>>>>>> 4e5c422f342e0f70b756e88fdb5faced8d72ec5d
}


