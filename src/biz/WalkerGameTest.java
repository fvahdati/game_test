package biz;

import static org.junit.jupiter.api.Assertions.*;

class WalkerGameTest {

    WalkerGame walkerGame;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        walkerGame = new WalkerGame();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }


    @org.junit.jupiter.api.Test
    void testWalkerGamerFor45300000() {
       assertEquals(true, walkerGame.start(4, 5, 3, new int[]{0, 0, 0, 0, 0}));
    }

    @org.junit.jupiter.api.Test
    void testWalkerGamerFor465000111(){
        assertEquals(true, walkerGame.start(4,6,5, new int[]{0 , 0, 0, 1, 1, 1}));
    }

    @org.junit.jupiter.api.Test
    void testwalkerGamerFor463001110(){
        assertEquals(false, walkerGame.start(4,6,3, new int[]{0 , 0, 1, 1, 1, 0}));


    }

    @org.junit.jupiter.api.Test
    void testwalkerGamerFor431010(){
        assertEquals(false, walkerGame.start(4,3,1, new int[]{0, 1, 0}));


    }
}