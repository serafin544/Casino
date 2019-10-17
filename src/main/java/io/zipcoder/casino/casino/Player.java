package io.zipcoder.casino.casino;

import java.util.ArrayList;

public class Player implements GamblingPlayer {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public double money() {
        return 0;
    }
}


