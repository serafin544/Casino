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
    public Craps( Player player) {
        this.player = player;
        wallet = player.getWallet();


    }

    public void play(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Craps JUU HEARDD");
        System.out.println("Rules: \n Craps is a game where many bettors get to stake their chips on a roll of the dice.  \n Win money by betting on what numbers are rolled on a pair of dice. \n \n" +
                "Place a bet on the pass line to play during the come-out roll. \n \n" +
                "Play the point if no one wins or loses on the come-out roll. \n Place a come bet if the come-out roll has already happened.");
        System.out.println( "Press [Enter] to roll the dice ..." );
        in.nextLine();

        }


    private int dieRoll;



    public Craps() {
        dieRoll = 0;
    }
    public int roll(){
        dieRoll = (int) (Math.random() * 6) +1;
        return dieRoll;
    }


<<<<<<< HEAD
=======
//         Constructor for objects of the class.
         public Craps(){
             //Array;
         }
//         The roll method of the six sided die.
//         Return value for the method.
         public int roll(){
             dieRoll = (int) (Math.random() * 6) +1;
             return dieRoll;
         }
>>>>>>> 03291670a633f60cdfcfc21f4e7e406facd17482

        Die d1 = new Die();
        Die d2 = new Die();
        Scanner in = new Scanner( System.in );
      //  while (true)

<<<<<<< HEAD
    {
    }
     public void rolls() {

         int roll1 = d1.roll();
         int roll2 = d2.roll();

         int rollTotal = roll1 + roll2;
         System.out.println( "You rolled a " + roll1 + " and a " + roll2 );
         System.out.println( "for a total of " + rollTotal );

         if (!(rollTotal == 7 || rollTotal == 11)) {
             System.out.println( "You WON son.." );

         } else if (rollTotal == 2 || rollTotal == 3 || rollTotal == 12) {

             System.out.println( "You lost my guy..." );
         } else {

             int point = rollTotal;
             boolean keepPlaying = true;

             while (keepPlaying) {

                 System.out.println( "Press [Enter] to roll dice..." );
                 keepPlaying = false;
             }
=======
//             Roll the dice for the first roll.
             System.out.println("Let's play a game of Craps");
             int roll1 = d1.roll();
             //int roll2 = d;
             //int rollTotal = roll1 + roll2;
>>>>>>> 03291670a633f60cdfcfc21f4e7e406facd17482
         }
     }
            public void rollAgain() {

                System.out.println( "Great GAME CUZ!" );
                System.out.println( "You tryna run it back? (Y/N) " );
                String playAgain = in.nextLine();
                if (playAgain.equals( "" ))
                    if (playAgain.substring( 0, 1 ).equals( "n" )) {


                    }
                System.out.println("Thanks for playing juu heard");

            }

    public void wageMoney() {

    }
}
