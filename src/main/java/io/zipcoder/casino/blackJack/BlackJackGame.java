package io.zipcoder.casino.blackJack;

import io.zipcoder.casino.casino.GamblingGame;
import io.zipcoder.casino.blackJack.BjDeck;
import io.zipcoder.casino.casino.Player;
import io.zipcoder.casino.utilities.Console;

import java.util.ArrayList;
import java.util.Scanner;

public class BlackJackGame implements GamblingGame  {




    Player player;
    ArrayList<Card> compHand = new ArrayList<Card>();
    ArrayList<Card> playerHand = new ArrayList<Card>();
    BjDeck deck = new BjDeck();
    double wallet;
    static double totalPool = 0.0;
    ArrayList<Card> gameDeck = deck.createDeck();
    Console console = new Console(System.in,System.out);


    public  void wageMoney(double bet) {
        totalPool += bet;
    }
    public BlackJackGame( Player player){
     this.player = player;
     wallet = player.getWallet();

    }
    public void play(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to BlackJack");
        System.out.println("Rules: \n Make the highest Combo \n Do not go over 21 \n Press 1 to hit \n Press 0 to hit \nPress anything else and you lose your bet");

       //Loop in here
        int counter = 0;
        boolean bust = false;
        status();

        //Set up Scanner to take in double and not go over wallet amt
        double playerBet;
        boolean lessThanWallet = false;
        do{
            console.println("Wallet amt: " + wallet);
            playerBet = console.getDoubleInput("Place your bet within your current assets"); //input stand in
            if(playerBet < wallet){
                wallet -= playerBet;
                wageMoney(playerBet);
                lessThanWallet = true;
            }
            //Takes away the money might move it to end
            //Adds to the betting pool
        }while(!lessThanWallet);

        //Computer will match bet
        System.out.println("Dealer will match your bet");
        double compBet = playerBet;
        wageMoney(compBet);

        System.out.println("Drawing cards");
        deck.shuffledDeck();
        playerHand.add(deck.drawCard());
        compHand.add(deck.drawCard());
        playerHand.add(deck.drawCard());
        compHand.add(deck.drawCard());
        showCards();
        console.println(compHand.get(0).toString());
        counter++;

        while(!bust){
            int input = console.getIntegerInput("hit or stay");
            if(input == 0){
                showCards();
                bust = true;

            }
            hitOrStay(input);
            bust = checkIfBust(playerHand);
            showCards();
            console.println("Current points:  " + totalCurrentPts(playerHand));

        }




    }

    public  void showCompCards(){
       /* if(i == 0){
            System.out.println(compHand.get(i));
        }*/
       console.println("Computer Card. One will be hidden");
        for(int i = 0; i < compHand.size(); i++){
            System.out.println(compHand.get(i).toString());
        }
    }

    public void status(){
        System.out.println(" |STATUS |\n\t WALLET:" + wallet + "\n\t MONEYPOOL:" + totalPool);
      /*  if(playerHand.isEmpty()){
            System.out.println(playerHand.toString());

        }else{
            System.out.println("NO CARDS YET");
        }*/

    }
    public void hitOrStay(int in){
        if(in == 1){
            playerHand.add(deck.drawCard());
            playerHand.toString();
        }else if(in == 0){

        }
    }
    public int totalCurrentPts(ArrayList<Card> c) {
        int tmp = 0;
        for (int i = 0; i < c.size(); i++) {
            tmp += c.get( i ).getValue();
        }
        return tmp;
    }
    public Boolean checkIfBust(ArrayList<Card> c){
        boolean b = false;

     int tmp = 0;

        for(int i = 0; i < c.size(); i++){
            tmp += c.get(i).getValue();
        }
        if(tmp > 21){
            b = true;
        }else {
            b = false;
        }

        return b;
    }

    public void showCards(){
        console.println("YOUR HAND \n");
      for(int i = 0; i < playerHand.size(); i++){
          System.out.println(playerHand.get(i).toString());
      }
        console.println("\n");
    }
    public int compareCards(){
        int tmp = 0;
        int pTotal = totalCurrentPts(playerHand);
        int cTotal = totalCurrentPts(compHand);
        if(pTotal > 21){
            //BUSTED
            tmp = 1;
        }else if ( cTotal > 21){
            //Computer Busted
            tmp = 2;
        }else if( pTotal > cTotal){
            tmp =  3;

        }else if(cTotal > pTotal){
            tmp = 4;
        }else{
            tmp = 5;
        }
    return tmp;
    }


    public void wageMoney() {

    }
}