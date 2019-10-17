package io.zipcoder.casino.pig;

import java.util.Random;

public class PigDice  {

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
            System.out.println("Error num needs to be from 1 to 6");
        }
        return num;
    }

    public static void main(String[] args)
    {
        System.out.println("Total is: "+rollDice(1, 6));
    }
}
