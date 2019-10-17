package io.zipcoder.casino.blackJack;

import io.zipcoder.casino.casino.GamblingGame;
import io.zipcoder.casino.blackJack.BjDeck;

import java.util.ArrayList;

public abstract class bjDealer implements GamblingGame  {
    ArrayList<Card> gameDeck;
    ArrayList<Card> playerHand;
    ArrayList<Card> compHand;
    BjDeck deck = new BjDeck();
    static double totalPool = 0.0;
    public  void wageMoney(double bet) {
        totalPool += bet;
    }
    public bjDealer(ArrayList<Card> gameDeck, ArrayList<Card> playerHand){
       gameDeck =  deck.createDeck();
       this.playerHand = playerHand;

    }





}