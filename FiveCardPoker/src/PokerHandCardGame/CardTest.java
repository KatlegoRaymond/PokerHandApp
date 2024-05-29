package PokerHandCardGame;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

// Test class for the Card class
class CardTest {

    // Test case for the getSuit() method of the Card class
    @Test
    void testGetSuit() {
        // Create a new Card object with suit "♥" and rank "A"
        Card card = new Card("♥", "A");
        // Assert that the getSuit() method returns "♥"
        assertEquals("♥", card.getSuit());
    }
 
    // Test case for the getRank() method of the Card class
    @Test
    void testGetRank() {
        // Create a new Card object with suit "♦" and rank "K"
        Card card = new Card("♦", "K");
        // Assert that the getRank() method returns "K"
        assertEquals("K", card.getRank());
    }

    // Test case for the getRankValue() method of the Card class
    @Test
    void testGetRankValue() {
        // Create Card objects with different ranks and test their rank values
        Card card1 = new Card("♣", "A");
        assertEquals(14, card1.getRankValue()); // Ace has a rank value of 14

        Card card2 = new Card("♠", "Q");
        assertEquals(12, card2.getRankValue()); // Queen has a rank value of 12

        Card card3 = new Card("♥", "10");
        assertEquals(10, card3.getRankValue()); // Numeric rank values are parsed correctly
    }

    // Test case for the toString() method of the Card class
    @Test
    void testToString() {
        // Create a new Card object with suit "♦" and rank "K"
        Card card = new Card("♦", "K");
        // Assert that the toString() method returns "K♦"
        assertEquals("K♦", card.toString());
    }

    // Test case for the compareTo() method of the Card class
    @Test
    void testCompareTo() {
        // Create Card objects with different suits and ranks for comparison
        Card card1 = new Card("♣", "A");
        Card card2 = new Card("♠", "Q");
        // Assert that the compareTo() method correctly compares the cards
        assertTrue(card1.compareTo(card2) > 0); // Ace (♣A) is greater than Queen (♠Q)

        Card card3 = new Card("♥", "10");
        assertEquals(0, card3.compareTo(card3)); // A card is equal to itself

        Card card4 = new Card("♦", "5");
        assertTrue(card3.compareTo(card4) > 0); // Ten (♥10) is greater than Five (♦5)
    }
}
