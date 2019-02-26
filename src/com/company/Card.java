package com.company;

public class Card
{
    private String suit;
    private String rank;
    private int pointValue;
    public Card(String cardRank, String cardSuit, int cardPointValue)
    {
        cardRank = cardRank.toLowerCase();
        cardSuit = cardSuit.toLowerCase();
        rank = cardRank;
        suit = cardSuit;
        pointValue = cardPointValue;
    }
    @Override
    public String toString()
    {
        return "[" + rank + ", " + suit + ", " + pointValue + "]";
    }
}
