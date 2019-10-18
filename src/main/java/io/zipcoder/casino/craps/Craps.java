package io.zipcoder.casino.craps;

import io.zipcoder.casino.blackJack.BjDeck;
import io.zipcoder.casino.blackJack.Card;
import io.zipcoder.casino.casino.GamblingGame;
import io.zipcoder.casino.casino.Player;
import io.zipcoder.casino.utilities.Console;

import java.util.ArrayList;
import java.util.Scanner;

public class Craps implements GamblingGame {

    Player player;
    double wallet;
     int dieRoll;
    static double totalPool = 0.0;
    Console console = new Console(System.in, System.out);
    public void wageMoney() {}

    public void wageMoney(double bet) {
        totalPool += bet;
    }

    public Craps(Player player) {
        this.player = player;
        wallet = player.getWallet();
    }

    public void play() {
        Scanner scan = new Scanner(System.in);
       console.println("Welcome to Easy Play Craps JUU HEARDD");
       console.println("Rules:" +
               "\n Win automatically if you get 7 or 11" +
               "\n Lose automatically if you get 2 or 12" +
               "\n  You get anything else; you get and over under guess and  you roll again");
       boolean quit = false;

       while(wallet > 0.0 || !quit){
           //PLACE BETS
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
           totalPool += compBet;

           console.println("Press 1 to roll Dice");
           //Roll dice method
           int input = console.getIntegerInput("Press 1 to roll the dice or 9 to quit");
           if (input == 1) {
                int playerThrow = throwDice();
                int checker = checkStatus(playerThrow);
                if(checker == 1 || checker == 2){
                    console.println("Congrats you have won");
                    wallet += totalPool;
                }else if(checker == 3){
                    int ou = console.getIntegerInput("Press 1 for over or Press 2 for under");
                    int guess = console.getIntegerInput("Take a guess between 1 -12");
                    if(takeGuess(ou,guess,throwDice()) == "Winner"){
                        console.println("Congrats you have won");
                        wallet += totalPool;
                    }else{
                        console.println("Congrats you have Lost");
                    }
                }

           }else{
               quit = true;
           }

           //Check dice points
           //Method to take guess


       }
        //in.nextLine();

    }

    private String takeGuess(int ou, int guess, int throwDice) {
        String tmp = " ";
        if(ou ==1){
            if(guess > throwDice){
                tmp = "Winner";
            }else{
                tmp = "Loser";
            }
        }else {
            if(guess < throwDice){
                tmp = "Winner";
            }else{
                tmp ="Loser";
            }

        }
        return tmp;
    }

    public int roll() {
        dieRoll = (int) (Math.random() * 6) + 1;
        return dieRoll;
    }
    public int throwDice(){
        int dieOne = roll();
        int dieTwo = roll();
        int total = 0;

        return total = dieOne + dieTwo;
    }


    //For switch case 1: winner if you got
    //2: winner if you got 11
    //3: will run compare method to compare dice with computer
    public int checkStatus(int thrownDice){
        int tmp = 0;
        if(thrownDice == 7){
            tmp =1;
        }else if( thrownDice == 11){
            tmp = 2;
        }else{
            tmp = 3;
        }
        return tmp;
    }

}
