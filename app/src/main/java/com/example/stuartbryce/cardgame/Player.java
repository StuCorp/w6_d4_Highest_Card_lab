package com.example.stuartbryce.cardgame;

/**
 * Created by stuartbryce on 2017-06-22.
 */

public class Player {

    private String name;
    private Card currentCard;

    public Player(String name){
        this.name = name;

    }

    public void requestCard(Dealer dealer){
        this.currentCard = dealer.deal();
    }

    public Card getCurrentCard() {
        return currentCard;
    }

    public void printCurrentCard() {
        System.out.println(String.format("I am %s I have %s", this.name, currentCard.printCard()));

    }

    public String getName() {
        return this.name;
    }
}
