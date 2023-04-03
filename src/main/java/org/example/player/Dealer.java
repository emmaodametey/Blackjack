package org.example.player;

import org.example.card.Card;
import org.example.deck.Deck;

import java.util.ArrayList;

public class Dealer {
    private final String dealer = "Dealer";
    private ArrayList<Player> currentPlayers = new ArrayList<>();
    private final Deck dealerDeck = new Deck();

    public  Dealer(){
//        dealerDeck.setDeck();
    }
    public void shuffle(){
        dealerDeck.shuffleCards();
    }

    public ArrayList<Card> getDealerDeck() {
        return dealerDeck.getDeck();
    }

//    public ArrayList<Card> dealCards(int numberOfCards){
//        ArrayList<Card> cards = new ArrayList<>();
//        for(int i =0; i < numberOfCards; i++){
//            cards.add(dealerDeck.getDeck().get(i));
//        }
//        return  cards;
//    }
    public void addPlayer(Player newPlayer){
        this.currentPlayers.add(newPlayer);
    }
     public void removePlayer(Player player){
        currentPlayers.remove(player);
     }

    public ArrayList<Player> getCurrentPlayers() {
        return currentPlayers;
    }

    public void handCards(int numOfCards){
        //TODO implemented with stack
        for(Player player: currentPlayers){
            ArrayList<Card> deal = new ArrayList<>();
            for(int i =0; i < numOfCards; i++){
                Card topCard = dealerDeck.getDeck().get(0);
                deal.add(topCard);
               // System.out.println("deal printing from dealer " + deal.get(0));
                dealerDeck.removeFromDeck(topCard);
            }
            player.setHandOfCards(deal);
        }

    }


    @Override
    public String toString() {
        return "Dealer{" +
                "currentPlayers=" + currentPlayers +
                ", dealerDeck=" + dealerDeck +
                '}';
    }
}
