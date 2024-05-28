package fivecard;
 
class Card implements Comparable<Card> {
    private String suit;
    private String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    public int getRankValue() {
        switch (rank) {
            case "A": return 14;
            case "K": return 13;
            case "Q": return 12;
            case "J": return 11;
            default: return Integer.parseInt(rank);
        }
    }

    @Override
    public String toString() {
        return rank + "" + suit;
    }

    @Override
    public int compareTo(Card other) {
        return Integer.compare(this.getRankValue(), other.getRankValue());
    }
}

 