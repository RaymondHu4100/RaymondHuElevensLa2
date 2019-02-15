package com.company;

public class DeckTester
{
    public static void main(String[] args)
    {
        String[] ranks = {"two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace"};
        String[] suits = {"spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds"};
        int[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 , 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 , 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 , 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 , 13};
        Deck deck1 = new Deck(ranks, suits, values);
        System.out.println("Deck 1 toString method reports:");
        System.out.println("    " + deck1);
        System.out.println("The individual accessor method calls below should return the same values:");
        System.out.println("isEmpty: " + deck1.isEmpty());
        System.out.println("numUndealtCards: " + deck1.numUndealtCards());
        System.out.println();
    }
}