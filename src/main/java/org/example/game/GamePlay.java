package org.example.game;

import org.example.player.Dealer;
import org.example.player.Player;

import java.util.ArrayList;

public class GamePlay {
    private final Dealer dealer;
    public static int win = 21;
    private Player winner = null;

    public GamePlay (Dealer newDealer){
        this.dealer = newDealer;
        this.dealer.shuffle();
        this.dealer.handCards(2);
    }


    public boolean allPlayersStick(){
        for(Player player: dealer.getCurrentPlayers()){
            if (!player.checkStick())
                return false;
        }
        return true;
    }

    public boolean anyPlayerHitsTwentyOne(){
        for(Player player: dealer.getCurrentPlayers()){
            if (player.calcValueOfCards() == win){
                return true;
            }
        }
        return false;
    }
    public boolean onlyOnePlayerLeft(){
        return dealer.getCurrentPlayers().size() == 1;
    }

    public Player getWinner(){
        int max = 0;
        if (gameFinish()) {
            for(Player player: dealer.getCurrentPlayers()) {
                if (player.calcValueOfCards() > max) {
                    max = player.calcValueOfCards();
                    winner = player;
                }
            }
        }
        return winner;
    }

    public boolean gameFinish(){
        return (allPlayersStick() || anyPlayerHitsTwentyOne() || onlyOnePlayerLeft());
    }

    public Dealer getDealer (){
        return dealer;
    }

}
