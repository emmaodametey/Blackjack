package org.example.player;

import org.example.card.Card;

import java.util.ArrayList;

public class Player {
    private String name;
    private int valueOfCards;
    private ArrayList<Card> handOfCards;

    public Player(String name){
        this.name = name;
    }


    public void setName(String name) {
        this.name = name;
    }

//    public void setValueOfCards(int valueOfCards) {
//        this.valueOfCards = valueOfCards;
//    }

    public void setHandOfCards(ArrayList<Card> handOfCards) {
        this.handOfCards = handOfCards;
    }

    public ArrayList<Card> getHandOfCards() {
        return handOfCards;
    }

    public int calcValueOfCards(){
        for(Card card: handOfCards){
            valueOfCards += card.getValue().getIntValue();
        }
        return valueOfCards;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                '}';
    }
}
