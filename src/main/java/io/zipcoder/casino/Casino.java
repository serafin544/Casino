package io.zipcoder.casino;


import io.zipcoder.casino.blackJack.BlackJackGame;
import io.zipcoder.casino.casino.Player;
import io.zipcoder.casino.craps.Craps;
import io.zipcoder.casino.gofish.GoFishGame;
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
        int gamePick = console.getIntegerInput("Pick a game by pressing a number.\n 1 : BlackJack \n 2: Pig \n 3: Craps \n 4: GO FISH");
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
                    case 3:
                        Craps c = new Craps(p1);
                        c.play();
                        break;
                    case 4:
                        GoFishGame gf = new GoFishGame(p1);
                        gf.play();
                        break;
                }
            }



        }while(gamePick != 0);





    }
}
