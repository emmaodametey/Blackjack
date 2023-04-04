package org.example.deck;

import org.example.card.Card;
import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNot;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DeckTest {
    Deck deck;
    @BeforeEach
    void setUp() {
       deck = new Deck();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void setDeck() {
    }

    @Test
    void getDeck() {
    }

    @Test
    void testShuffleCards() {
        Stack<Card> newDeck = new Stack<>();
        newDeck.addAll(deck.getDeck());
        deck.shuffleCards();
        assertNotEquals(newDeck, deck.getDeck());

    }
}