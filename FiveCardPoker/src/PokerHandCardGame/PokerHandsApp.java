package PokerHandCardGame;

import java.util.*;

// Class for the main application of the PokerHandsApp
public class PokerHandsApp {

    // Main method to run the application
    @SuppressWarnings("unused")
	public static void main(String[] args) {
        // Create a new deck of cards
        Deck deck = new Deck();
        
        // Shuffle the deck
        deck.shuffle();
         
        // Deal a hand from the shuffled deck
        List<Card> hand = deck.dealHand();
        
        // Print the hand to the console
        CardUtilities.printHand(hand);
        
        // Evaluate the hand and determine its strength
        String handStrength = CardUtilities.evaluateHand(hand);        
    }
}
