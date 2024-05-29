package PokerHandCardGame;

import java.util.*;


//Utility class for evaluating poker hands and printing cards.
public class CardUtilities {

	// Private constructor to prevent instantiation.
    private CardUtilities() {
        // Intentionally empty, because that's how Utility classes roll
    }

    // Method to print the player's hand.
    public static void printHand(List<Card> hand) {
        System.out.print("Your hand: ");
        for (int i = 0; i < hand.size(); i++) {
            System.out.print(hand.get(i));
            if (i < hand.size() - 1) {
                System.out.print(" "); // Add space between cards
            }
        }
    }
     
    // Method to evaluate the player's hand and determine its strength.
    public static String evaluateHand(List<Card> hand) {
        Collections.sort(hand); // Sort the hand to enable easier evaluation

        // Array defining the possible hand types in descending rank order.
        String[] handTypes = {"Straight Flush", "Four of a Kind", "Full House", "Flush", "Straight",
                "Three of a Kind", "Two Pair", "One Pair", "High Card"};

        // Iterate through each hand type and check if the hand matches it.
        for (String handType : handTypes) {
            switch (handType) {
                case "Straight Flush":
                    if (isStraightFlush(hand)) {
                        System.out.println("\nYou have: " + handType);
                        return handType;
                    }
                    break;
                case "Four of a Kind":
                    if (hasFourOfAKind(hand)) {
                        System.out.println("\nYou have: " + handType);
                        return handType;
                    }
                    break;
                case "Full House":
                    if (isFullHouse(hand)) {
                        System.out.println("\nYou have: " + handType);
                        return handType;
                    }
                    break;
                case "Flush":
                    if (isFlush(hand)) {
                        System.out.println("\nYou have: " + handType);
                        return handType;
                    }
                    break;
                case "Straight":
                    if (isStraight(hand)) {
                        System.out.println("\nYou have: " + handType);
                        return handType;
                    }
                    break;
                case "Three of a Kind":
                    if (hasThreeOfAKind(hand)) {
                        System.out.println("\nYou have: " + handType);
                        return handType;
                    }
                    break;
                case "Two Pair":
                    if (hasTwoPair(hand)) {
                        System.out.println("\nYou have: " + handType);
                        return handType;
                    }
                    break;
                case "One Pair":
                    if (hasOnePair(hand)) {
                        System.out.println("\nYou have: " + handType);
                        return handType;
                    }
                    break;
                case "High Card":
                    System.out.println("\nYou have: " + handType);
                    return handType;
            }
        }

        // This should not happen
        return "Invalid Hand";
    }

    
    // Method to check if the hand is a straight flush.
    public static boolean isStraightFlush(List<Card> hand) {
        return isStraight(hand) && isFlush(hand);
    }

    // Method to check if the hand has four of a kind.
    public static boolean hasFourOfAKind(List<Card> hand) {
        for (int i = 0; i <= hand.size() - 4; i++) {
            if (hand.get(i).getRank() == hand.get(i + 1).getRank() &&
                hand.get(i).getRank() == hand.get(i + 2).getRank() &&
                hand.get(i).getRank() == hand.get(i + 3).getRank()) {
                return true;
            }
        }
        return false;
    }

    // Method to check if the hand is a full house.
    public static boolean isFullHouse(List<Card> hand) {
        return (hand.get(0).getRank() == hand.get(1).getRank() && hand.get(2).getRank() == hand.get(4).getRank()) ||
               (hand.get(0).getRank() == hand.get(2).getRank() && hand.get(3).getRank() == hand.get(4).getRank());
    }

    // Method to check if the hand is a flush.
    public static boolean isFlush(List<Card> hand) {
        for (int i = 0; i < hand.size() - 1; i++) {
            if (!hand.get(i).getSuit().equals(hand.get(i + 1).getSuit())) {
                return false;
            }
        }
        return true;
    }

    // Method to check if the hand is a straight.
    public static boolean isStraight(List<Card> hand) {
        for (int i = 0; i < hand.size() - 1; i++) {
            if (hand.get(i).getRankValue() - hand.get(i + 1).getRankValue() != 1) {
                return false;
            }
        }
        return true;
    }
    
    // Method to check if the hand has three of a kind.
    public static boolean hasThreeOfAKind(List<Card> hand) {
        for (int i = 0; i <= hand.size() - 3; i++) {
            if (hand.get(i).getRank() == hand.get(i + 1).getRank() &&
                hand.get(i).getRank() == hand.get(i + 2).getRank()) {
                return true;
            }
        }
        return false;
    }
    
    // Method to check if the hand has two pair
    public static boolean hasTwoPair(List<Card> hand) {
        int pairCount = 0;
        for (int i = 0; i < hand.size() - 1; i++) {
            if (hand.get(i).getRank() == hand.get(i + 1).getRank()) {
                pairCount++;
                i++;
            }
        }
        return pairCount == 2;
    }
    
    // Method to check if the hand has one pair.
    public static boolean hasOnePair(List<Card> hand) {
        for (int i = 0; i < hand.size() - 1; i++) {
            if (hand.get(i).getRank() == hand.get(i + 1).getRank()) {
                return true;
            }
        }
        return false;
    }
}
