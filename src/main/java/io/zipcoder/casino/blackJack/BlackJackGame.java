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
    ArrayList<Card> playerHand;
    BjDeck deck = new BjDeck();
    double wallet = player.getWallet();
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
        System.out.println("Rules: \n Make the highest Combo \nDo not go over 21 \n Press 1 to hit \n Press 0 to hit \nPress anything else and you lose your bet");

       //Loop in here
        System.out.println("\n Place your bet");
        //Set up Scanner to take in double and not go over wallet amt
        double playerBet = 0.0; //input stand in
        //Takes away the money might move it to end
        wallet -= playerBet;
        //Adds to the betting pool
        wageMoney(playerBet);
        //Computer will match bet
        System.out.println("Dealer will match your bet");
        double compBet = playerBet;
        wageMoney(compBet);

        System.out.println("Drawing cards");
        playerHand.add(deck.drawCard());
        compHand.add(deck.drawCard());
        playerHand.add(deck.drawCard());
        compHand.add(deck.drawCard());
        showCards();




    }
    public void status(){
        System.out.println(" |STATUS |\n\t WALLET:" + wallet + "\n\t MONEYPOOL:" + totalPool);
        if(playerHand.isEmpty()){
            System.out.println(playerHand.toString());

        }else{
            System.out.println("NO CARDS YET");
        }

    }
    public void hitOrStay(int in){
        if(in == 1){
            playerHand.add(deck.drawCard());
            playerHand.toString();
        }else if(in == 0){
            System.out.println(checkCardPts(playerHand));
        }
    }
    public int totalCurrentPts(ArrayList<Card> c) {
        int tmp = 0;
        for (int i = 0; i < c.size(); i++) {
            tmp += c.get( i ).getValue();
        }
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

    public void showCards(){
        System.out.println(playerHand.toString());
    }


    //Game TEST






}