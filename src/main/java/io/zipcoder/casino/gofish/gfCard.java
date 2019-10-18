package io.zipcoder.casino.gofish;

public class gfCard {
    private gfSuits suits;
    private gfCardValue values;

    public gfSuits getCardSuits() {
        return suits;
    }

    public void setCardFaces(gfSuits suits) {
        this.suits = suits;
    }

    public gfCardValue getCardValues() {
        return values;
    }

    public void setCardValues(gfCardValue cardValues) {
        this.values = cardValues;
    }

    public gfCard(gfSuits suits, gfCardValue values) {
        this.suits = suits;
        this.values = values;

    }

    public int getValue() {
        return values.getCardValues();
    }

    @Override
    public String toString() {
        return values + " of " + suits;
    }
}
