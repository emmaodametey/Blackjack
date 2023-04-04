package org.example.player;

import org.example.card.Card;
import org.example.game.Strategy;

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
        calcValueOfCards();
    }

    public int getValueOfCards() {
        return valueOfCards;
    }

    public void updateHandOfCards(Card card){
        this.handOfCards.add(card);
        calcValueOfCards();
    }

    public ArrayList<Card> getHandOfCards() {
        return this.handOfCards;
    }

    public int calcValueOfCards(){
        this.valueOfCards = 0;
        for(Card card: handOfCards){
            this.valueOfCards += card.getValue().getIntValue();
        }
        return valueOfCards;
    }


    public boolean checkHit() {
        return this.getValueOfCards() <= Strategy.HIT.getLimit();
    }
    public boolean checkStick() {
        return this.getValueOfCards() >= Strategy.STICK.getLimit() && this.getValueOfCards() <= Strategy.GO_BUST.getLimit();
    }
    public boolean checkGoBust() {
        return this.getValueOfCards() > Strategy.GO_BUST.getLimit();
    }


    @Override
    public String toString() {
        return "name='" + name + '\'' +
                '}';
    }
}
