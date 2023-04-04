package org.example;

import org.example.card.Card;
import org.example.card.Suit;
import org.example.card.Value;
import org.example.deck.Deck;
import org.example.player.Dealer;
import org.example.player.Player;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Deck deck = new Deck();
//        deck.setDeck();
//
//        for(Card card: deck.getDeck()){
//            System.out.println(card);
////        }
//        System.out.println("************************************");
        Dealer dealer = new Dealer();
        dealer.shuffle();
//        for(Card card: dealer.getDealerDeck()){
//            System.out.println(card);
//        }


//        deck.setDeck();

//        for(Card card: deck.getDeck()){
//            System.out.println(card);
//        }



//        deck.shuffleCards();
//        for(Card card: deck.getDeck()){
//            System.out.println(card);
//        }
        Player player = new Player("Debbie");
        Player player2 = new Player("Majid");
        Player player3 = new Player("emma");


        dealer.addPlayer(player);
        dealer.addPlayer(player2);
        dealer.addPlayer(player3);
        //System.out.println(dealer.getCurrentPlayers());
        dealer.handCards(2);
        for(Player player1: dealer.getCurrentPlayers()){
            System.out.println(player1);
            System.out.println( player1.getHandOfCards());
        }

//        player.setHandOfCards(deck.getDeck());


//        Card card1 = new Card(Suit.CLUBS, Value.TWO);
//        Card card2 = new Card(Suit.DIAMONDS, Value.ACE);
//        ArrayList<Card> arrayA = new ArrayList<>();
//        arrayA.add(card1);
//        arrayA.add(card2);
//        player.setHandOfCards(arrayA);
//        System.out.println(player.calcValueOfCards());


    }
}