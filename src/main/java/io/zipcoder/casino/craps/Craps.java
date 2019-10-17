package io.zipcoder.casino.craps;

import io.zipcoder.casino.casino.GamblingGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Craps {

//         private int dieRoll;

//         Constructor for objects of the class.
//         public Craps(){
//             Array
//         }
//         The roll method of the six sided die.
//         Return value for the method.
//         public int roll(){
//             dieRoll = (int) (Math.random() * 6) +1;
//             return dieRoll;
//         }

    public static void main(String[] args){
//             Create objects.
//             Craps d1 = new Craps();

        Die d1 = new Die();
        Die d2 = new Die();
        Scanner scanner = new Scanner(System.in);

//             Roll the dice for the first roll.
        System.out.println("Let's play a game of Craps");
        System.out.println("Press [Enter] to roll the dice ...");
        int roll1 = d1.roll();
        int roll2 = d2.roll();
        int rollTotal = roll1 + roll2;
        System.out.println("You rolled a "+ roll1 + "and a " + roll2 );
        System.out.println("for a total of " + rollTotal);



    }
}









