package org.example.game;

import org.example.player.Dealer;
import org.example.player.Player;

import java.util.ArrayList;

public class GamePlay {
    private Dealer dealer;
    public static int win = 21;
    private Player winner = null;

    public boolean checkHit(Player player) {
        return player.calcValueOfCards() <= Strategy.HIT.getLimit();
    }
    public boolean checkStick(Player player) {
        return player.calcValueOfCards() >= Strategy.STICK.getLimit() && player.calcValueOfCards() <= Strategy.GO_BUST.getLimit();
    }
    public boolean checkGoBust(Player player) {
        return player.calcValueOfCards() >= Strategy.GO_BUST.getLimit();
    }

    public boolean gameFinish(){
        return (allPlayersStick() || anyPlayerHitsTwentyOne() || onlyOnePlayerLeft());
    }

    public boolean allPlayersStick(){
        int max = 0;
        for(Player player: dealer.getCurrentPlayers()){
            if (!checkStick(player))
                return false;
            if(player.calcValueOfCards() > max){
                max = player.calcValueOfCards();
                winner = player;
            }
        }

        return true;
    }

    public boolean anyPlayerHitsTwentyOne(){
        for(Player player: dealer.getCurrentPlayers()){
            if (player.calcValueOfCards() == win){
                winner = player;
                return true;
            }

        }
        return false;
    }
    public boolean onlyOnePlayerLeft(){
        return dealer.getDealerDeck().size() == 1;
    }

//    public Player checkWinner(){
//        int max;
//        for(Player player: dealer.getCurrentPlayers()){
//            if(player.calcValueOfCards())
//        }
//    }



}
