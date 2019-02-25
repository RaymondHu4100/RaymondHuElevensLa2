package com.company;
import java.util.List;
import java.util.ArrayList;

public class Deck {
    private List<Card> cards;
    private int numUndealtCards;
    private int size;
    public Deck(String[] ranks, String[] suits, int[] values)
    {
        cards = new ArrayList<>();
        for (int i = 0; i < ranks.length; i++) {
            cards.add(new Card(ranks[i], suits[i], values[i]));
        }
        numUndealtCards = cards.size();
    }
    public boolean isEmpty() {
        return numUndealtCards == 0;
    }
    public int size() {
        return numUndealtCards;
    }
    @Override
    public String toString()
    {
        String rtn = "size = " + size + "\nUndealt cards: \n";
        for (int k = size - 1; k >= 0; k--) {
            rtn = rtn + cards.get(k);
            if (k != 0) {
                rtn = rtn + ", ";
            }
            if ((size - k) % 2 == 0) {
                rtn = rtn + "\n";
            }
        }
        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.size() - 1; k >= size; k--)
        {
            rtn = rtn + cards.get(k);
            if (k != size) {
                rtn = rtn + ", ";
            }
            if ((k - cards.size()) % 2 == 0) {
                rtn = rtn + "\n";
            }
        }
        rtn = rtn + "\n";
        return rtn;
    }
}
