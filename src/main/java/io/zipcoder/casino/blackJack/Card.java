package io.zipcoder.casino.blackJack;

public class Card {
    private CardFaces cardFaces;
    private CardValues cardValues;

    public CardFaces getCardFaces() {
        return cardFaces;
    }

    public void setCardFaces(CardFaces cardFaces) {
        this.cardFaces = cardFaces;
    }

    public CardValues getCardValues() {
        return cardValues;
    }

    public void setCardValues(CardValues cardValues) {
        this.cardValues = cardValues;
    }

    public Card(CardFaces cardFaces, CardValues cardValues) {
        this.cardFaces = cardFaces;
        this.cardValues = cardValues;

    }

    public int getValue() {
        return cardValues.getValue();
    }

    @Override
    public String toString() {
        return cardValues + " of " + cardFaces;
    }
}
