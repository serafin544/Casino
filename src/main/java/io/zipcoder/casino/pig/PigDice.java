package io.zipcoder.casino.pig;

import io.zipcoder.casino.casino.GamblingGame;
import io.zipcoder.casino.casino.Player;
import io.zipcoder.casino.utilities.Console;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class PigDice implements GamblingGame {
    Player player;
    double wallet;
    static Random rand = new Random();
    int playerScore = 0;
    int computerScore = 0;
    Scanner sc = new Scanner(System.in);
    Console console = new Console(System.in, System.out);
    int maxPoints = 50;
    double totalPool;

    public void wageMoney(double bet) {
        totalPool += bet;
    }

    public void wageMoney() {

    }

    public int rollDice() {
        int random = rand.nextInt(7) + 1;
        return random;
    }

    public PigDice(Player player) {
        this.player = player;
        wallet = player.getWallet();
    }


    public void play() {

        console.print("\n\n*******************************\n*******************************" +
                "\nWelcome to PIG. \n Take turns to Roll a dice! \nFirst one to 50 Win \n you can place small bets with each turns \n if you tie, the house wins");
        status();
        while (playerScore < 50 || computerScore < 50 || wallet <= 0.0) {
            double playerBet;
            boolean lessThanWallet = false;
            do {
                console.println("Wallet amt: " + wallet);
                playerBet = console.getDoubleInput("Place your bet within your current assets"); //input stand in
                if (playerBet < wallet) {
                    wallet -= playerBet;
                    wageMoney(playerBet);
                    lessThanWallet = true;
                }
                //Takes away the money might move it to end
                //Adds to the betting pool
            } while (!lessThanWallet);
            //Computer will match bet
            System.out.println("Dealer will match your bet");
            double compBet = playerBet;
            totalPool += compBet;
            int input = console.getIntegerInput("Press 1 to roll the dice");
            if (input == 1) {
                console.println("Your turn");
                int tmp = rollDice();
                console.println(".... -> You rolled a : " + tmp);
                playerScore += tmp;

                if (playerScore > 50) {
                    break;
                }
                console.println("The computer's Turn ");
                int comRoll = rollDice();
                console.println(".... -> Computer rolled a : " + comRoll);
                computerScore += comRoll;
                if (computerScore > 50) {
                    break;
                }
                if (tmp > comRoll) {
                    wallet += totalPool;
                    console.println("You win this Round");
                    totalPool = 0.0;
                    console.println("Wallet amt: " + wallet);
                } else {

                    console.println("You Lost this Round, u suck");
                    totalPool = 0.0;
                }
                console.println("Wallet amt: " + wallet);
                status();
            }

        }
        if (playerScore >= 50) {
            console.println("WINNER");

        } else if (computerScore >= 50) {
            console.println("YOU LOST");

        }
        if (wallet <= 0.0) {
            console.println("Get OUT broke boy");
        }

    }


    public void status() {
        console.println("\n***********************************");
        console.println("Your Points: " + playerScore);
        console.println("Computer Points: " + computerScore);
        console.println("***********************************");

    }


}




