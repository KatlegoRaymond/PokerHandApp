package fivecard;
import java.util.*;
 

/**
 * The PokerHandsApp generates a random five card hand, prints each card, then
 * displays the classification of the hand.
 */
public class PokerHandsApp {

    @SuppressWarnings("unused")
	public static void main(String[] args) {
    	Deck deck = new Deck();
        
    	//Shuffle 
    	deck.shuffle();
         
    	//Show Hand 
        List<Card> hand = deck.dealHand();
        CardUtilities.printHand(hand);
        
        //Show hand evaluation  
        String handStrength = CardUtilities.evaluateHand(hand);        
    }
}