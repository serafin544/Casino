package io.zipcoder.casino.blackJack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;

public class BjDeck {
     ArrayList<Card> cards ;

    public BjDeck(){
        cards = new ArrayList<Card>(52);
    }

    public ArrayList<Card> createDeck(){

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
    public  void printDeck(){
        for(int i = 0; i < cards.size(); i++){
            System.out.println(cards.get(i).toString());
        }

    }


}
