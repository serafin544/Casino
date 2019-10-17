package io.zipcoder.casino.gofish;

import io.zipcoder.casino.blackJack.Card;
import io.zipcoder.casino.blackJack.CardFaces;
import io.zipcoder.casino.blackJack.CardValues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;

public class gfDeck {
    static ArrayList<Card> cards ;
    public gfDeck(){
        cards = new ArrayList<Card>(52);
    }
    public static ArrayList createDeck(){
        ArrayList c = new ArrayList();
        for(CardFaces cardFaces: EnumSet.range(CardFaces.HEARTS, CardFaces.SPADES)){
            for(CardValues cardValues : EnumSet.range(CardValues.TWO,CardValues.ACE)){
                c.add(new Card(cardFaces,cardValues));
            }
        }
        return c;
    }
    public static void shuffledDeck(ArrayList<Card> c) {
        Collections.shuffle(c);
    }

    public Card drawCard(){
        Card tmp = cards.get(0);
        cards.remove(cards.get(0));
        return tmp;
    }
    public static void printDeck(ArrayList<Card> c){
        for(int i = 0; i < c.size(); i++){
            System.out.println(c.get(i).toString());
        }

    }
}
