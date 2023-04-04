package org.example.deck;

import org.example.card.Card;
import org.example.card.Suit;
import org.example.card.Value;

import java.util.ArrayList;
import java.util.Stack;

public class Deck {
   private Stack<Card> deck;

   public Deck(){
       this.deck = new Stack<>();
       setDeck();
   }

   public void setDeck() {
        for(Suit suite: Suit.values()){
            for(Value value: Value.values()){
                this.deck.add(new Card(suite, value));
            }
        }
   }
    public Stack<Card> getDeck() {
        return deck;
    }

    public void shuffleCards(){
       int random1;
       int random2;

       for(int i =0; i < deck.size(); i++){
           random1 = (int)(Math.random()* 52);
           random2 = (int)(Math.random()* 52);

           Card cardholder = this.deck.get(random1);
           this.deck.set(random1, this.deck.get(random2));
           this.deck.set(random2, cardholder);
       }

   }


    @Override
    public String toString() {
        return "Deck{" +
                "deck=" + deck +
                '}';
    }
}
