package io.zipcoder.casino.gofish;

import io.zipcoder.casino.blackJack.Card;
import io.zipcoder.casino.blackJack.CardFaces;
import io.zipcoder.casino.blackJack.CardValues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;

public class gfDeck {
     ArrayList<Card> cards ;
    public gfDeck(){
        cards = new ArrayList<Card>(52);
    }
    public  ArrayList createDeck(){
        for(CardFaces cardFaces: EnumSet.range(CardFaces.HEARTS, CardFaces.SPADES)){
            for(CardValues cardValues : EnumSet.range(CardValues.TWO,CardValues.ACE)){
                cards.add(new Card(cardFaces,cardValues));
            }
        }
        return cards;
    }
    public ArrayList<Card> shuffledDeck() {
        Collections.shuffle(cards);
        return cards;
    }

    public Card drawCard(){
        Card tmp = cards.get(0);
        cards.remove(cards.get(0));
        return tmp;
    }
    public void printDeck(ArrayList<Card> c){
        for(int i = 0; i < c.size(); i++){
            System.out.println(c.get(i).toString());
        }

    }
}
