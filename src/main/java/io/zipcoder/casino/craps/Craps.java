package io.zipcoder.casino.craps;

import io.zipcoder.casino.casino.GamblingGame;

import java.util.ArrayList;
import java.util.Scanner;

public class Craps {
         Scanner scanner = new Scanner(System.in);
         private int dieRoll;

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

         public static void main(String[] args){
//             Create objects.
             Craps d1 = new Craps();

//             Roll the dice for the first roll.
             System.out.println("Let's play a game of Craps");
             int roll1 = d1.roll();
             //int roll2 = d;
             //int rollTotal = roll1 + roll2;
         }
}
