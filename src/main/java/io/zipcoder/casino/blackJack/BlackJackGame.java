package io.zipcoder.casino.blackJack;

import io.zipcoder.casino.casino.GamblingGame;
import io.zipcoder.casino.blackJack.BjDeck;
import io.zipcoder.casino.casino.Player;
import io.zipcoder.casino.utilities.Console;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class BlackJackGame implements GamblingGame  {
    ArrayList<Card> gameDeck;
    Player player;
    ArrayList<Card> compHand;
    BjDeck deck = new BjDeck();
    static double totalPool = 0.0;
    public  void wageMoney(double bet) {
        totalPool += bet;
    }
    public BlackJackGame(ArrayList<Card> gameDeck, Player player){
       gameDeck =  deck.createDeck();
       player = new Player(null);

    }
    public void play(Player player, Console console){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to BlackJack");
        System.out.println("Rules: \n Make the highest Combo \n Do not go over 21 \n Press 1 to hit \n Press 0 to hit \nPress anything else and you lose your bet");

    }
    public String checkCardPts(ArrayList<Card> c){
        int tmp = 0;
        String status = " ";
        for(int i = 0; i < c.size(); i++){
            tmp += c.get(i).getValue();
        }
        if (tmp > 21){
            status = "BUSTED!";
        }else if( tmp == 21){
            status = " WHOOOOO 21! ";
        }else{
            status = " Still in the game";
        }

        return status;
    }




}