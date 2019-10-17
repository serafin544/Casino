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
}


