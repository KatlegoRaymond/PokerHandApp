package fivecard;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    void testGetSuit() {
        Card card = new Card("♥", "A");
        assertEquals("♥", card.getSuit());
    }
 
    @Test
    void testGetRank() {
        Card card = new Card("♦", "K");
        assertEquals("K", card.getRank());
    }

    @Test
    void testGetRankValue() {
        Card card1 = new Card("♣", "A");
        assertEquals(14, card1.getRankValue());

        Card card2 = new Card("♠", "Q");
        assertEquals(12, card2.getRankValue());

        Card card3 = new Card("♥", "10");
        assertEquals(10, card3.getRankValue());
    }

    @Test
    void testToString() {
        Card card = new Card("♦", "K");
        assertEquals("K♦", card.toString());
    }

    @Test
    void testCompareTo() {
        Card card1 = new Card("♣", "A");
        Card card2 = new Card("♠", "Q");
        assertTrue(card1.compareTo(card2) > 0);

        Card card3 = new Card("♥", "10");
        assertEquals(0, card3.compareTo(card3));

        Card card4 = new Card("♦", "5");
        assertTrue(card3.compareTo(card4) > 0);
    }
}


