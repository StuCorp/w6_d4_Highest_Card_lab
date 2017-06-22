package com.example.stuartbryce.cardgame;

import java.util.ArrayList;

/**
 * Created by stuartbryce on 2017-06-22.
 */

public class Game {

//    ArrayList<Player> players;
    Player player1;
    Player player2;
    Dealer dealer;
    String player1name;
    String player2name;
//    String player1card;
//    String player2card;



    public Game(Player player1, Player player2, Dealer dealer) {
        this.player1 = player1;
        this.player2 = player2;
        this.dealer = dealer;
        this.player1name = player1.getName();
        this.player2name = player2.getName();
    }



    public void run(){
        dealCards(dealer);
        announceCards();
        int result = compareCards(player1.getCurrentCard(), player2.getCurrentCard());
        displayResult(result);
    }

    public void dealCards(Dealer dealer){
        player1.requestCard(dealer);
//        this.player1card = player1.getCurrentCard().printCard();
        player2.requestCard(dealer);
//        this.player2card = player2.getCurrentCard().printCard();
    }

    public void announceCards(){
        this.player1.printCurrentCard();
        this.player2.printCurrentCard();
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
                break;
            case 1 :
                System.out.println(String.format("%s WINS! %s has %s, %s has %s", player1.getName(), player1.getName(), player1.getCurrentCard().printCard(), player2.getName(), player2.getCurrentCard().printCard()));
                break;

            case -1 :
                System.out.println(String.format("%s WINS! %s has %s, %s has %s", player2.getName(), player1.getName(), player1.getCurrentCard().printCard(), player2.getName(), player2.getCurrentCard().printCard()));
                break;


        }
    }



}



