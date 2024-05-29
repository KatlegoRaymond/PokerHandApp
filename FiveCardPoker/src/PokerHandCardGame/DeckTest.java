package PokerHandCardGame;

import org.junit.jupiter.api.*; // Importing JUnit 5 annotations
import static org.junit.jupiter.api.Assertions.*; // Importing JUnit 5 assertion methods

import java.util.List;

// Class for testing the Deck class
class DeckTest {
    private Deck deck; // Declaration of a Deck object

    // This method runs before each test method to set up the test environment
    @BeforeEach
    void setUp() {
        deck = new Deck(); // Create a new Deck object
    }
 
    // Test case for the shuffle method of the Deck class
    @Test
    void testShuffle() {
        // Shuffle the deck
        deck.shuffle();
        
        // No direct assertions, but if the shuffle method runs without error,
        // it's considered successful
    }

    // Test case for the dealHand method of the Deck class
    @Test
    void testDealHand() {
        // Deal a hand from the deck
        List<Card> hand = deck.dealHand();
        
        // Ensure that the size of the hand is 5
        assertEquals(5, hand.size());
    }
}
