package fivecard;
import java.util.*;
 
/**
 * A typical 52-card deck. Decks can only be modified by putting them into the
 * "new deck" arrangement, shuffling, and splitting.  
 */
class Deck {
    private List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        generateDeck();
    }

    
    /**
     * Returns the card described by a two-character description of rank then suit.
     * Ranks are A, 2, 3, 4, 5, 6, 7, 8, 9, T, J, Q, K. Example valid descriptions
     * are: "A♠","T♦", and "K♣" .
     */
    private void generateDeck() {
        String[] suits = {"\u2665", "\u2666", "\u2663", "\u2660"}; // Clubs(♣), Spades(♠), Hearts(♥), Diamonds(♦)
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String suit : suits) {
            for (String rank : ranks) {
                try {
                    cards.add(new Card(suit, rank));
                } catch (NumberFormatException e) {
                    // Handle the exception (e.g., log it, skip adding the card, etc.)
                    System.err.println("Invalid rank: " + rank);
                    // Optionally, you can continue to the next iteration of the loop
                    continue;
                }
            }
        }
    }
 
    /**
     * This implementation traverses the list backwards, from the last element
     * up to the second, repeatedly swapping a randomly selected element into
     * the "current position".  Elements are randomly selected from the
     * portion of the list that runs from the first element to the current
     * position, inclusive.
     */
    public void shuffle() {
    	System.out.println("Shuffling ... Shuffling ... Shuffling ...");
    	Collections.shuffle(cards);  
    }

    public List<Card> dealHand() {
    	
        List<Card> hand = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            hand.add(cards.remove(0));
        }
        return hand;
    }
      
}