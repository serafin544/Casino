package io.zipcoder.casino.blackJack;

public enum CardValues {
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10),
    ACE(11);

    private int cardValue;

    public int getValue() {
        return cardValue;
    }


    private CardValues(int value){
        this.cardValue = value;


    }


}
