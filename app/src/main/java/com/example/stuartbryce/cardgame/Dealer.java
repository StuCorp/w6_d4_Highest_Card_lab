package com.example.stuartbryce.cardgame;

import java.util.Random;

import cards.CardSuit;
import cards.CardValue;

/**
 * Created by stuartbryce on 2017-06-22.
 */

public class Dealer {

    Deck deck;

    public Dealer() {
        this.deck = new Deck();
        deck.fillDeck();
    }

//    public CardSuit generateSuit(){
//        CardSuit[] suits = CardSuit.values();
//        Random random = new Random();
//        int index = random.nextInt(suits.length);
//        return suits[index];
//    }
//
//    public CardValue generateValue(){
//        CardValue[] cardVals = CardValue.values();
//        Random random = new Random();
//        int index = random.nextInt(cardVals.length);
//        return cardVals[index];


    public Card deal(){
        Card card = deck.popRandomCard();

//        CardSuit cardSuit = generateSuit();
//        CardValue cardValue = generateValue();
//        Card card = new Card(cardSuit, cardValue);
        return card;
    }


}
