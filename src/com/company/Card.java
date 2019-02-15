package com.company;

public class Card
{
    private String suit;
    private String rank;
    private int pointValue;
    private static final String[] suits = { "spades", "hearts", "clubs", "diamonds" };
    private static final String[] ranks = { "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace" };
    public Card(String cardRank, String cardSuit, int cardPointValue)
    {
        boolean rankOK = false;
        cardRank = cardRank.toLowerCase();
        for (int i = 0; i < ranks.length; i++)
        {
            if (cardRank.equals(ranks[i]))
            {
                rankOK = true;
                break;
            }
        }
        if (!rankOK)
        {
            throw new IllegalArgumentException("The cardRank parameter, " + cardRank + ", is not allowed.\n" + "Acceptable values are: two, three, four, five, six, seven, eight, nine, " + "ten, jack, queen, king, and ace");
        }
        rank = cardRank;
        boolean suitOK = false;
        cardSuit = cardSuit.toLowerCase();
        for (int i = 0; i < suits.length; i++)
        {
            if (cardSuit.equals(suits[i]))
            {
                suitOK = true;
                break;
            }
        }
        if (!suitOK)
        {
            throw new IllegalArgumentException("The cardSuit parameter, " + cardSuit + ", is not allowed.\n" + "Acceptable values are: spades, hearts, clubs, diamonds");
        }
        suit = cardSuit;
        pointValue = cardPointValue;
    }
    @Override
    public String toString()
    {
        return rank + " of " + suit + " (point value = " + pointValue + ")";
    }
}
