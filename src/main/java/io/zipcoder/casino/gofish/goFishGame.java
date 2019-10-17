package io.zipcoder.casino.goFish;

import io.zipcoder.casino.blackJack.Card;
import io.zipcoder.casino.casino.Player;

import java.util.ArrayList;


import io.zipcoder.casino.blackJack.BjDeck;
import io.zipcoder.casino.blackJack.Card;
import io.zipcoder.casino.casino.Player;
import io.zipcoder.casino.utilities.Console;

import java.util.ArrayList;
import java.util.Scanner;

public class goFishGame {
    public static Scanner input = new Scanner( System.in );
    ArrayList<Card> gfDeck;
    Player player;
    ArrayList<Card> compHand;
    gfDeck deck = new gfDeck();
    static double totalPool = 0.0;

    //    public void wageMoney(double bet) {
//        totalPool += bet;
//    }
// go Fish method with a constructor of arrayList and a player


    public goFishGame() {
        gfDeck = deck.createDeck();
        player = new Player( null );

    }
//play method

    public static void main(String[] args) {
        boolean repProgram = true;

        int menu;

        Scanner scan = new Scanner( System.in );
        System.out.println( "Welcome to GO Fish Ju heard" );
        System.out.println( "Rules: \n The goal is to win the most \"books\" of cards \n The cards rank from ace (high) to two (low).  \n Each player gets a turn in clockwise order  \n When you \"go fish\" you can take any card from the pool.\n Go Fish is over when one player runs out of cards or there are no more cards in the pool." );

        System.out.println( "\n\n\n[1] Play Go Fish \n[2] Get OUT" );
        menu = input.nextInt();
        switch (menu) {
            case 1:
                testDecks();
                break;
            case 2:
                goFishGame game = new goFishGame();
                break;


        }
        System.out.println( "Goodbye!" );

    }

    public static void testDecks(){


    }
}


