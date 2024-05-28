package fivecard;
import java.util.*;

public class CardUtilities {

    private CardUtilities() {
        // Intentionally empty, because that's how Utility classes roll
    }

    
    public static void printHand(List<Card> hand) {
        System.out.print("Your hand: ");
        for (int i = 0; i < hand.size(); i++) {
            System.out.print(hand.get(i));
            if (i < hand.size() - 1) {
                System.out.print(" "); // Add space between cards
            }
        }
    }
     
    public static String evaluateHand(List<Card> hand) {
        Collections.sort(hand);
        
        String result;
        if (isStraightFlush(hand)) {
            result = "Straight Flush";
        } else if (hasFourOfAKind(hand)) {
            result = "Four of a Kind";
        } else if (isFullHouse(hand)) {
            result = "Full House";
        } else if (isFlush(hand)) {
            result = "Flush";
        } else if (isStraight(hand)) {
            result = "Straight";
        } else if (hasThreeOfAKind(hand)) {
            result = "Three of a Kind";
        } else if (hasTwoPair(hand)) {
            result = "Two Pair";
        } else if (hasOnePair(hand)) {
            result = "One Pair";
        } else {
            result = "High Card";
        }
        
        System.out.println("\nYou have: " + result);
        return result;
    }
    
    public static boolean isStraightFlush(List<Card> hand) {
        return isStraight(hand) && isFlush(hand);
    }
    
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
    
    public static boolean isFullHouse(List<Card> hand) {
        return (hand.get(0).getRank() == hand.get(1).getRank() && hand.get(2).getRank() == hand.get(4).getRank()) ||
               (hand.get(0).getRank() == hand.get(2).getRank() && hand.get(3).getRank() == hand.get(4).getRank());
    }
    
    public static boolean isFlush(List<Card> hand) {
        for (int i = 0; i < hand.size() - 1; i++) {
            if (!hand.get(i).getSuit().equals(hand.get(i + 1).getSuit())) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isStraight(List<Card> hand) {
        for (int i = 0; i < hand.size() - 1; i++) {
            if (hand.get(i).getRankValue() - hand.get(i + 1).getRankValue() != 1) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean hasThreeOfAKind(List<Card> hand) {
        for (int i = 0; i <= hand.size() - 3; i++) {
            if (hand.get(i).getRank() == hand.get(i + 1).getRank() &&
                hand.get(i).getRank() == hand.get(i + 2).getRank()) {
                return true;
            }
        }
        return false;
    }
    
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
    
    public static boolean hasOnePair(List<Card> hand) {
        for (int i = 0; i < hand.size() - 1; i++) {
            if (hand.get(i).getRank() == hand.get(i + 1).getRank()) {
                return true;
            }
        }
        return false;
    }
}
