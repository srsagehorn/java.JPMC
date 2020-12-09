import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlayerDeck {
    public static void main(String[] args) {
            int[] deck = new int[52];
            String[] suits = {"Spade", "Hearts", "Diamonds", "Clubs"};
            String[] ranks = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
            
            public void initializeCards() {
                for (int i = 0 ; i < deck.length; i++)
                    deck[i] = i;
            }
            public void shuffleCards (0 {
                for (int i = 0; i< deck.length ; i++) {
                    int index = (int)(Math.random()*deck.length);
                    int temp = deck[i];
                    deck[i] = deck[index];
                    deck[index] = temp
                }
            }
            public void displayCards(0 {
                for ( int i = 0 ; i<52; i++) {
                    String suit = suits[deck[i]/13];
                    String rank = ranks[deck[i]/13];
                    System.out.println("Card Num: " + deck[i] + ": " + rank + " of " + suit);
                           
                }
            }
    }
} 