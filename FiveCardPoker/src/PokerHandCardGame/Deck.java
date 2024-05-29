package PokerHandCardGame;

import java.util.*;

// Represents a deck of playing cards.
class Deck {
    private List<Card> cards; // List to hold the cards in the deck

    // Constructor to initialize a new deck.
    public Deck() {
        this.cards = new ArrayList<>(); // Initialize the list of cards
        generateDeck(); // Generate a standard deck of 52 cards
    }

    // Private method to generate a standard deck of 52 cards.
    private void generateDeck() {
        String[] suits = {"\u2665", "\u2666", "\u2663", "\u2660"}; // Unicode symbols for Hearts, Diamonds, Clubs, Spades
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"}; // Card ranks
        for (String suit : suits) { // Iterate over each suit
            for (String rank : ranks) { // Iterate over each rank
                try {
                    cards.add(new Card(suit, rank)); // Create a new Card object with the given suit and rank, and add it to the deck
                } catch (NumberFormatException e) {
                    // Handle the exception (e.g., log it, skip adding the card, etc.)
                    System.err.println("Invalid rank: " + rank);
                    // Optionally, you can continue to the next iteration of the loop
                    continue;
                }
            }
        }
    }

    // Method to shuffle the deck.
    public void shuffle() {
        System.out.println("Shuffling ... Shuffling ... Shuffling ..."); // Print a shuffling message
        Collections.shuffle(cards); // Shuffle the list of cards randomly
    }

    // Method to deal a hand of cards from the deck.
    public List<Card> dealHand() {
        List<Card> hand = new ArrayList<>(); // Initialize a new list to hold the dealt cards (hand)
        for (int i = 0; i < 5; i++) { // Deal 5 cards
            hand.add(cards.remove(0)); // Remove the first card from the deck and add it to the hand
        }
        return hand; // Return the hand of cards
    }
}
