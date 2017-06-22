package com.example.stuartbryce.cardgame;

import java.util.ArrayList;

/**
 * Created by stuartbryce on 2017-06-22.
 */

public class Game {

//    ArrayList<Player> players;
    Player player1;
    Player player2;
    String player1name;
    String player2name;
    String player1card;
    String player2card;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.player1name = player1.getName();
        this.player2name = player2.getName();
        this.player1card = player1.getCurrentCard().printCard();
        this.player2card = player2.getCurrentCard().printCard();


    }

    public int compareCards(Card card1, Card card2) {
        if (card1.getValue() == card2.getValue()) {
            return 0;
        }
        if (card1.getValue() > card2.getValue()) {
            return 1;
        } else {
            return -1;
        }
    }


    public void displayResult(int result) {
        switch(result){
            case 0 :
                System.out.println(String.format("DRAW! %s has %s, %s has %s", player1name, player1.getCurrentCard().printCard(), player2name, player2.getCurrentCard().printCard()) );
            case 1 :
                System.out.println(String.format("%s WINS! %s has %s, %s has %s", player1.getName(), player1.getName(), player1.getCurrentCard().printCard(), player2.getName(), player2.getCurrentCard().printCard()));
            case -1 :
                System.out.println(String.format("%s WINS! %s has %s, %s has %s", player2.getName(), player1.getName(), player1.getCurrentCard().printCard(), player2.getName(), player2.getCurrentCard().printCard()));

        }
    }
}
