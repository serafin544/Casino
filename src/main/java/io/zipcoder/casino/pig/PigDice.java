package io.zipcoder.casino.pig;

import io.zipcoder.casino.casino.Player;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PigDice  {
    int numOfPlayers;
    Scanner sc= new Scanner(System.in);




    public static int rollDice(int number, int nSides) {
        int num = 0;
        int roll = 0;
        Random  r = new Random();
        if(nSides >=1)
        {
            for(int i = 0; i < number; i++)
            {
                roll = r.nextInt(nSides)+1;
                System.out.println("Roll is:  "+roll);
                num = num + roll;
            }
        }
        else
        {
            System.out.println("Error num needs to be from 1");
        }
        return num;
    }


    public static void main(String[] args) {
        int numOfPlayers;
        Scanner sc= new Scanner(System.in);
        ArrayList<String> players= new ArrayList<String>();
        ArrayList<Integer> scores= new ArrayList<Integer>();

    do {
        System.out.println("How many players are there (1-2): ");
        numOfPlayers = sc.nextInt();
    }while (numOfPlayers <1 || numOfPlayers > 2);
    for (int i=0; i< numOfPlayers; i++){
        System.out.println("Enter player "+ (i+1) + "'s name");
        players.add(sc.next());
        scores.add(0);
    }
    for(int j=0; j< players.size(); j++){
       String name= players.get(j);
       int score= scores.get(j);
       int die1;
       char c;
       Random rand= new Random();

        System.out.println(name + " it's your turn. Your current score is " + score);
        System.out.println();

        do {
            System.out.println("(R)oll the dice");
            c= sc.next().charAt(0);
        }while (c !='r' && c != 'R');
         die1=rand.nextInt();

        System.out.println("All is good");


    }

}
}
