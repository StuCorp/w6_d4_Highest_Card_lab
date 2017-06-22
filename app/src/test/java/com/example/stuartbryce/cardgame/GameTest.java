package com.example.stuartbryce.cardgame;
import org.mockito.*;

import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by stuartbryce on 2017-06-22.
 */

public class GameTest {

    Player player1;
    Player player2;
    Dealer dealer;
    Game game;

    @Before
    public void before(){
        player1 = new Player("Stuart");
        player2 = new Player("Absent Sam");
        dealer = new Dealer();
        game = new Game(player1, player2, dealer);
    }

    @Test
    public void getName(){
        assertEquals("Stuart", player1.getName());
    }



}
