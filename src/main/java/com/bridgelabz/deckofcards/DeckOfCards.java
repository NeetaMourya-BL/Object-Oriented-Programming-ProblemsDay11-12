package com.bridgelabz.deckofcards;

public class DeckOfCards {
	private String suits;
	private String ranks;
	private static final int NB_PLAYER = 4;
    private static final int NB_CARD_BY_PLAYER = 9;
public static void main(String[] args) {
	    // you loop as much as the number of players
	    // your increment step is the number of cards to deal by player
	    // your end condition is the number of cards you have to
	    // deal for all player
	System.out.println("Welcome to deck of cards");
	DeckOfCards cards=new DeckOfCards();
	cards.initialGame();
}
// initialGame method for Setup the initial game with deck of cards and make sure we have unique cards
public void initialGame() {
	 int playerNumber = 1;
	int[] numOfCards = new int[52];
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    // initialize deck
    int n = suits.length * ranks.length;
    String[] deck = new String[n];
    for (int i = 0; i < ranks.length; i++) {
        for (int j = 0; j < suits.length; j++) {
            deck[suits.length*i + j] = ranks[i] + " of " + suits[j];
        }
    }
    // shuffle
    for (int i = 0; i < n; i++) {
        int r = i + (int) (Math.random() * (n-i));
        String temp = deck[r];
        deck[r] = deck[i];
        deck[i] = temp;
    }
    for (int i = 0; i < NB_PLAYER * NB_CARD_BY_PLAYER; i = i + NB_CARD_BY_PLAYER) {
        System.out.println("player " + playerNumber + ", cards =");
        // you loop as much as the number of cards to deal by player
        // your start from the last dealed card 
        // your increment step is 1 as you want to deal card by card from the deck
        // your end condition is the number of cards to deal by player
        for (int j = i; j < i+NB_CARD_BY_PLAYER; j++) {
            System.out.println(deck[j]);
        }
        playerNumber++;
}
}
}