package io.zipcoder.casino.gofish;

import io.zipcoder.casino.blackJack.Card;

import io.zipcoder.casino.casino.GamblingGame;
import io.zipcoder.casino.casino.Player;
import io.zipcoder.casino.gofish.gfDeck;
import io.zipcoder.casino.utilities.Console;
import java.util.ArrayList;
import java.util.Scanner;

public class GoFishGame implements GamblingGame {
    Player player;
    ArrayList<Card> playerHand = new ArrayList<Card>();
    ArrayList<Card> computerHand = new ArrayList<Card>();
    gfDeck gameDeck = new gfDeck();
    ArrayList deck = gameDeck.createDeck();

    double wallet;
    double totalPool = 0.0;
    int quadPlayerPt = 0;
    int quadComputerPt = 0;
    Console console = new Console(System.in,System.out);


    public void wageMoney() { }
    public void wageMoney(double bet){ totalPool += bet;}
    public GoFishGame(Player player){
        this.player = player;
        wallet = player.getWallet();
    }
    public void play(){
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
        dishOutSeven();
        showCards();
    }

    public void showCards(){
        console.println("YOUR HAND \n");
        for(int i = 0; i < playerHand.size(); i++){
            System.out.println(playerHand.get(i).toString());
        }
        console.println("\n");
    }

    public void dishOutSeven(){
      /*  int i= 0;
        while(i < 7) {
            playerHand.add(deck.drawCard());
            computerHand.add();
            i++;*/

    }




}
/*    public static Scanner input = new Scanner( System.in );
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
                //testDecks();
                break;
            case 2:
                goFishGame game = new goFishGame();
                break;


        }
        while (repProgram) ;
        System.out.println( "Goodbye!" );

    }

<<<<<<< HEAD
    public static void testDecks() {
=======
*//*    public static void testDecks(){
>>>>>>> 03291670a633f60cdfcfc21f4e7e406facd17482
        boolean repTest = true;
        int hand;
        gfDeck fullDeck;
        gfDeck emptyHand;
        do {
            System.out.println( "Which Deck would you like to manipulate?\n" +
                    "[1] Empty Hand\n[2] Full Deck\nEnter the Corresponding number" );
            hand = input.nextInt();
            switch (hand) {
                case 1:

                    break;
                case 2:

                    break;
            }
<<<<<<< HEAD
        } while (repTest);
    }

}
=======
        }while(repTest);
    }*//*



    //}*/



