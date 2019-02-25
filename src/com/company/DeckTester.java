package com.company;

public class DeckTester
{
    public static void main(String[] args)
    {
        String[] ranks = {"two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace"};
        String[] suits = {"spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "spades", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "hearts", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "clubs", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds", "diamonds"};
        int[] pointValues = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 , 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 , 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 , 13, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 , 13};
        Deck d = new Deck(ranks, suits, pointValues);
        System.out.println(d);
    }
}
