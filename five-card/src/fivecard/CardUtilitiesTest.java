package fivecard;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

class CardUtilitiesTest {

    @Test
    void testPrintHand() {
        List<Card> hand = new ArrayList<>();
        hand.add(new Card("♦", "K"));
        hand.add(new Card("♠", "Q"));
        hand.add(new Card("♣", "J"));
        hand.add(new Card("♥", "10"));
        hand.add(new Card("♦", "A"));
        
        // Redirect System.out to capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        
        // Call printHand method
        CardUtilities.printHand(hand);
        
        // Assert output
        assertEquals("Your hand: K♦ Q♠ J♣ 10♥ A♦", outputStream.toString().trim());
        
        // Reset System.out
        System.setOut(System.out);
    }

    @Test
    void testEvaluateHand() {
         
        List<Card> hand1 = new ArrayList<>();
        hand1.add(new Card("♦", "K"));
        hand1.add(new Card("♦", "Q"));
        hand1.add(new Card("♦", "J"));
        hand1.add(new Card("♦", "10"));
        hand1.add(new Card("♦", "A"));
        assertEquals("Flush", CardUtilities.evaluateHand(hand1));

        List<Card> hand2 = new ArrayList<>();
        hand2.add(new Card("♦", "K"));
        hand2.add(new Card("♠", "K"));
        hand2.add(new Card("♣", "K"));
        hand2.add(new Card("♥", "K"));
        hand2.add(new Card("♦", "A"));
        assertEquals("Four of a Kind", CardUtilities.evaluateHand(hand2));

        List<Card> hand3 = new ArrayList<>();
        hand3.add(new Card("♦", "K"));
        hand3.add(new Card("♠", "K"));
        hand3.add(new Card("♣", "Q"));
        hand3.add(new Card("♥", "Q"));
        hand3.add(new Card("♦", "Q"));
        assertEquals("Full House", CardUtilities.evaluateHand(hand3));

        List<Card> hand4 = new ArrayList<>();
        hand4.add(new Card("♦", "K"));
        hand4.add(new Card("♦", "Q"));
        hand4.add(new Card("♦", "J"));
        hand4.add(new Card("♦", "10"));
        hand4.add(new Card("♦", "8"));
        assertEquals("Flush", CardUtilities.evaluateHand(hand4));

        List<Card> hand5 = new ArrayList<>();
        hand5.add(new Card("♦", "K"));
        hand5.add(new Card("♠", "Q"));
        hand5.add(new Card("♣", "J"));
        hand5.add(new Card("♥", "10"));
        hand5.add(new Card("♦", "9"));
        assertEquals("High Card", CardUtilities.evaluateHand(hand5));
          
        List<Card> hand6 = new ArrayList<>();
        hand6.add(new Card("♦", "K"));
        hand6.add(new Card("♠", "K"));
        hand6.add(new Card("♣", "K"));
        hand6.add(new Card("♥", "10"));
        hand6.add(new Card("♦", "9"));
        assertEquals("Three of a Kind", CardUtilities.evaluateHand(hand6));

        List<Card> hand7 = new ArrayList<>();
        hand7.add(new Card("♦", "K"));
        hand7.add(new Card("♠", "K"));
        hand7.add(new Card("♣", "Q"));
        hand7.add(new Card("♥", "Q"));
        hand7.add(new Card("♦", "10"));
        assertEquals("Two Pair", CardUtilities.evaluateHand(hand7));

        List<Card> hand8 = new ArrayList<>();
        hand8.add(new Card("♦", "K"));
        hand8.add(new Card("♠", "K"));
        hand8.add(new Card("♣", "Q"));
        hand8.add(new Card("♥", "10"));
        hand8.add(new Card("♦", "9"));
        assertEquals("One Pair", CardUtilities.evaluateHand(hand8));
 
    }
 
}
