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
        console = new Console(System.in,System.out);
        System.out.println("Welcome to BlackJack");
        System.out.println("Rules: \n Make the highest Combo \nDo not go over 21 \n Press 1 to hit \n Press 0 to hit \nPress anything else and you lose your bet");

       //Loop in here
        int counter = 0;
        boolean bust = false;
        status();
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
        showCompCards(counter);
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

        }




    }

    public  void showCompCards(int i){
        if(i == 0){
            System.out.println(compHand.get(i));
        }
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
        System.out.println(playerHand.toString());
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

    //Game TEST






}