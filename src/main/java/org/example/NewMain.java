package org.example;

import org.example.game.GamePlay;
import org.example.player.Dealer;
import org.example.player.Player;

import java.util.Iterator;

public class NewMain {
    public static void main(String[] args) {
        Dealer dealer = new Dealer();

        Player player = new Player("Debbie");
        Player player2 = new Player("Majid");
        Player player3 = new Player("emma");

        dealer.addPlayer(player);
        dealer.addPlayer(player2);
        dealer.addPlayer(player3);

        GamePlay gamePlay = new GamePlay(dealer);

        for(Player player1: gamePlay.getDealer().getCurrentPlayers()){
            System.out.println(player1);
            System.out.println( player1.getValueOfCards());
        }

        System.out.println("--------------------------------");

        System.out.println("Game Ended : " + gamePlay.gameFinish());

        System.out.println("--------------------------------");



//        Iterator<Player> it = gamePlay.getDealer().getCurrentPlayers().iterator();
//
//        while (!gamePlay.gameFinish()) {
//            while( it.hasNext() ) {
//                Player currentPlayer = it.next();
//                if (currentPlayer.checkHit()) {
//                    System.out.println(currentPlayer + " hit");
//                    gamePlay.getDealer().handACard(currentPlayer);
//                    System.out.println("Players total value of cards " + currentPlayer.getValueOfCards());
//                }else if (currentPlayer.checkStick()) {
//                    System.out.println(currentPlayer + " stick");
//                    System.out.println("Players total value of cards " + currentPlayer.getValueOfCards());
//
//                } else if (currentPlayer.checkGoBust()) {
//                    System.out.println(currentPlayer + " goburst");
//                    System.out.println("Players total value of cards " + currentPlayer.getValueOfCards());
//                    gamePlay.getDealer().removePlayer(currentPlayer);
//                    System.out.println("Removed successfully purrrrr");
//                }
//            }
//        }









//        do {
//            for(Player player1: gamePlay.getDealer().getCurrentPlayers()){
//                if (player1.checkHit()) {
//                    System.out.println(player1 + " hit");
//                    gamePlay.getDealer().handACard(player1);
//                    System.out.println("Players total value of cards " + player1.getValueOfCards());
//                }else if (player1.checkStick()) {
//                    System.out.println(player1 + " stick");
//                    System.out.println("Players total value of cards " + player1.getValueOfCards());
//
//                } else if (player1.checkGoBust()) {
//                    System.out.println(player1 + " goburst");
//                    System.out.println("Players total value of cards " + player1.getValueOfCards());
//                    gamePlay.getDealer().removePlayer(player1);
//                    System.out.println("Removed successfully purrrrr");
//                }
//            }
//        } while (!gamePlay.gameFinish());


        System.out.println("--------------------------------");



        System.out.println("Winner is " + gamePlay.getWinner());



//        for(Player player1: gamePlay.getDealer().getCurrentPlayers()){
//            System.out.println(player1);
//            System.out.println( player1.getHandOfCards());
//        }




//        System.out.println("******************");
//        for(Player player1: gamePlay.getDealer().getCurrentPlayers()){
//            gamePlay.getDealer().handACard(player1);
//            System.out.println(player1);
//            System.out.println( player1.getHandOfCards());
//            System.out.println( player1.calcValueOfCards());
//
//            System.out.println("Hit " + player1.checkHit());
//            System.out.println("Stick " + player1.checkStick());
//            System.out.println("Go Burst " + player1.checkGoBust());
//        }
    }
}
