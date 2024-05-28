package fivecard;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class DeckTest {
    private Deck deck;

    @BeforeEach
    void setUp() {
        deck = new Deck();
    }
 
    @Test
    void testShuffle() {
         
        // Shuffle the deck
        deck.shuffle();
        
    }

    @Test
    void testDealHand() {
        // Deal a hand from the deck
        List<Card> hand = deck.dealHand();
        
        // Ensure that the size of the hand is 5
        assertEquals(5, hand.size());
         
    }
}
