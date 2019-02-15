package com.company;
import java.util.List;
import java.util.ArrayList;

public class Deck
{
    private List<Card> cards;
    private int numUndealtCards;
    private static final String[] DEFAULT_RANKS = {"two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace"};
    private static final String[] DEFAULT_SUITS = {"spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds"};
    private static final int[] DEFAULT_VALUES = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 , 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 , 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 , 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 , 13};
    public Deck(String[] ranks, String[] suits, int[] values)
    {
        cards = new ArrayList<>();
        if (ranks == null)
        {
            throw new IllegalArgumentException("The 'ranks' array parameter was 'null'. " + "You must supply three valid arrays.");
        }
        else if (suits == null)
        {
            throw new IllegalArgumentException("The 'suits' array parameter was 'null'. " + "You must supply three valid arrays.");
        }
        else if (values == null)
        {
            throw new IllegalArgumentException("The 'values' array parameter was 'null'. " + "You must supply three valid arrays.");
        }
        else if (ranks.length != suits.length || ranks.length != values.length)
        {
            throw new IllegalArgumentException("The lengths of the three arrays are not all the same.  They must match.\n" + "The lengths are:\nranks.length = " + ranks.length + "\nsuits.length = " + suits.length + "\nvalues.length = " + values.length);
        }
        for (int i=0; i < ranks.length; i++)
        {
            cards.add(new Card(ranks[i], suits[i], values[i]));
        }
        numUndealtCards = cards.size();
    }
    public Deck()
    {
        this(DEFAULT_RANKS, DEFAULT_SUITS, DEFAULT_VALUES);
    }
    public boolean isEmpty()
    {
        return numUndealtCards == 0;
    }
    public int numUndealtCards()
    {
        return numUndealtCards;
    }
    @Override
    public String toString()
    {
        String rtn = "size = " + numUndealtCards + "\nUndealt cards: \n";
        for (int k = numUndealtCards - 1; k >= 0; k--)
        {
            rtn = rtn + cards.get(k);
            if (k != 0)
            {
                rtn = rtn + ", ";
            }
            if ((numUndealtCards - k) % 2 == 0)
            {
                rtn = rtn + "\n";
            }
        }
        return rtn;
    }
}
