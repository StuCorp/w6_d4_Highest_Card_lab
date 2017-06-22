package com.example.stuartbryce.cardgame;
import org.mockito.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import cards.CardSuit;
import cards.CardValue;
import dalvik.annotation.TestTargetClass;

import static org.junit.Assert.assertEquals;
/**
 * Created by stuartbryce on 2017-06-22.
 */

public class GameTest {

    Player player1;
    Player player2;
    Dealer dealer;
    Game game;
    Card card1;
    Card card2;
    Dealer spyDealer;

    @Before
    public void before(){
        player1 = new Player("Stuart");
        player2 = new Player("Absent Sam");
        dealer = new Dealer();
        spyDealer = Mockito.spy(dealer);
        game = new Game(player1, player2, spyDealer);
        card1 = new Card(CardSuit.DIAMONDS, CardValue.ACE);
        card2 = new Card(CardSuit.HEARTS, CardValue.EIGHT);
    }

    @Test
    public void getName(){
        assertEquals("Stuart", player1.getName());
    }

    @Test
    public void testForceCardIn(){

        Mockito.when(spyDealer.deal()).thenReturn(card1);
        game.run();
        assertEquals(card1, player1.getCurrentCard());
    }




//    Game game;
//    Rollable spyDice;
//
//
//    @Before
//    public void before(){
//        Rollable dice = new Dice(6);
//        spyDice = Mockito.spy(dice);
//        game = new Game(spyDice);
//    }
//
//    @Test
//    public void testTakeTurnPass(){
//        Mockito.when(spyDice.roll()).thenReturn(4);
//        boolean result = game.nextTurn();
//        assertEquals(true, result);
//    }


}
