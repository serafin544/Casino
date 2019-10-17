package io.zipcoder.casino;


import io.zipcoder.casino.blackJack.BlackJackGame;
import io.zipcoder.casino.casino.Player;
import io.zipcoder.casino.utilities.Console;

public class Casino {
    public static void main(String[] args) {
        Console console = new Console(System.in,System.out);
        Player p1 = new Player("Serafin");
        double playerMoney = p1.getWallet();
        // write your tests before you start fucking with this
     int gamePick = console.getIntegerInput("Welcome to Native Casino");
        do{
            if(p1.getWallet() != 0){
                switch(gamePick){
                    case 1:
                        BlackJackGame bj = new BlackJackGame(p1);
                        bj.play();
                        break;
                }
            }



        }while(gamePick != 0);





    }
}
