package com.example.stuartbryce.cardgame;

import java.util.ArrayList;

/**
 * Created by stuartbryce on 2017-06-22.
 */

public class Runner {

    public static void main(String[] args) {

        Player player1 = new Player("Stuart");
        Player player2 = new Player("Absent Sam");
        Dealer dealer = new Dealer();
        Game game = new Game(player1, player2, dealer);
        game.run();


//        ArrayList<Player>  players = new ArrayList<Player>(player1, player2);


//
//        int result = game.compareCards(player1.getCurrentCard(), player2.getCurrentCard());
//        game.displayResult(result);


    }
}
