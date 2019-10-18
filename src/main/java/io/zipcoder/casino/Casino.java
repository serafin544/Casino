package io.zipcoder.casino;


import io.zipcoder.casino.blackJack.BlackJackGame;
import io.zipcoder.casino.casino.Player;
import io.zipcoder.casino.pig.Pig;
import io.zipcoder.casino.pig.PigDice;
import io.zipcoder.casino.utilities.Console;

public class Casino {
    public static void main(String[] args) {
        Console console = new Console(System.in,System.out);
        Player p1 = new Player("Serafin");
        double playerMoney = p1.getWallet();
        // write your tests before you start fucking with this
        console.println("Welcome to RMMS Casino");
        int gamePick = console.getIntegerInput("Pick a game by pressing a number.\n 1 : BlackJack \n 2: Pig");
        do{
            if(p1.getWallet() != 0){

                switch(gamePick){
                    case 1:
                        BlackJackGame bj = new BlackJackGame(p1);
                        bj.play();
                        break;
                    case 2:
                        PigDice pd = new PigDice(p1);
                        pd.play();
                        break;
                }
            }



        }while(gamePick != 0);





    }
}
