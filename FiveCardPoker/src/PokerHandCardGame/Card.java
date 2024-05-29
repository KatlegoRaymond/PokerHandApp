package PokerHandCardGame;

// Card class represents a playing card with a suit and a rank.
class Card implements Comparable<Card> {
    private String suit; // Represents the suit of the card (e.g., Hearts, Diamonds, Clubs, Spades)
    private String rank; // Represents the rank of the card (e.g., Ace, King, Queen, Jack, 2-10)

    // Constructor to initialize a Card object with a given suit and rank.
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    // Getter method to retrieve the suit of the card.
    public String getSuit() {
        return suit;
    }

    // Getter method to retrieve the rank of the card.
    public String getRank() {
        return rank;
    }

    // Method to get the numeric value of the rank of the card.
    // For Ace, King, Queen, and Jack, it returns predefined values.
    // For numeric ranks, it parses the string to an integer.
    public int getRankValue() {
        switch (rank) {
            case "A": return 14; // Ace has the highest rank
            case "K": return 13; // King
            case "Q": return 12; // Queen
            case "J": return 11; // Jack
            default: return Integer.parseInt(rank); // Numeric ranks are parsed to integers
        }
    }

    // Method to represent the card as a string (e.g., "AS" for Ace of Spades).
    @Override
    public String toString() {
        return rank + "" + suit;
    }

    // Method to compare two cards based on their rank values.
    // Implements the Comparable interface to enable sorting of cards.
    @Override
    public int compareTo(Card other) {
        return Integer.compare(this.getRankValue(), other.getRankValue());
    }
}
