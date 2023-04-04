package org.example.player;

import org.example.card.Card;
import org.example.deck.Deck;

import java.util.ArrayList;
import java.util.Stack;

public class Dealer {
    private final String dealer = "Dealer";
    private ArrayList<Player> currentPlayers = new ArrayList<>();
    private final Deck dealerDeck = new Deck();

    public  Dealer(){}
    public void shuffle(){
        dealerDeck.shuffleCards();
    }

    public Stack<Card> getDealerDeck() {
        return dealerDeck.getDeck();
    }

    public void addPlayer(Player newPlayer){
        this.currentPlayers.add(newPlayer);
    }
     public void removePlayer(Player player){
        this.currentPlayers.remove(player);
     }

    public ArrayList<Player> getCurrentPlayers() {
        return this.currentPlayers;
    }

    public void handCards(int numOfCards){
        //TODO implemented with stack
        for(Player player: currentPlayers){
            ArrayList<Card> deal = new ArrayList<>();
            for(int i =0; i < numOfCards; i++){
                Card topCard = dealerDeck.getDeck().pop();
                deal.add(topCard);
            }
            player.setHandOfCards(deal);
        }
    }

    public void handACard (Player player){
        player.updateHandOfCards(dealerDeck.getDeck().pop());
    }

    @Override
    public String toString() {
        return "Dealer{" +
                "currentPlayers=" + currentPlayers +
                ", dealerDeck=" + dealerDeck +
                '}';
    }
}
