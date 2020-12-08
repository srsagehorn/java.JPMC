// // Overview

// // You will create a card deck application that allows the player to shuffle
// a
// // deck of cards and play a card game that draws and plays cards until all
// cards
// // in the deck have been used.

// // At the start of a new game, it shuffles all cards using a deck shuffler.
// // The player then draws X number of cards from the deck and "plays" the
// cards
// // by displaying them in the UI.
// // The played cards are then added to a discard pile.
// // The player draws X new cards and repeats playing and discarding cards.
// // When there are no cards left in the deck, the game should ask the player
// if
// // they want to play again.
// // If the answer is yes, create a new deck with the discard pile and start
// // again.
// // If the answer is no, end the game with a creative message to the player.
// // Requirements
// // The application must include the following features:

// // The player must be able to continue drawing cards without errors.
// // It should include different methods for drawing, shuffling and playing
// cards.
// // It must include three arrays of a Card, using a custom class that includes
// // {Title: String, Description: String}

// package uno;

// public class UnoCard {
// enum Color {
// Red, Blue, Green, Yellow, Wild;

// private static final Color[] colors = Color.values();

// public static Color getColor(int i) {
// return Color.colors[i];
// }
// }

// enum Value {
// Zero, One, Two, Three, Four, Five, Six, Seven, Eight, Nine, DrawTwo, Skip,
// Reverse, Wild;

// private static final Value[] values = Value.values();

// public static Value getValue(int i) {
// return Value.values[i];
// }
// }

// private final Color color;
// privatefinal Value value;

// public UnoCard(final Color color, final Value value) {
// this.color = color;
// this.value = value;
// }

// public Color getColor() {
// return this.color;
// }

// public Value getValue() {
// return this.value;
// }

// public String toString (0 {
// return color + "_" + value;
// })
// }

// public class UnoDeck {
// private UnoCard[] cards;
// private into cardsInDeck

// public UnoDeck() {
// cards = new UnoCard[108];
// }

// public void reset () {
// UnoCard.Color[] = UnoCard.Color.values();
// cardsInDeck = 0;

// for (int i = 0 ; i < colors.length-1; i++) {
// UnoCard.Color color = colors[i]

// cards[cardsInDeck++] = new UnoCard(color, UnoCard.Value.getValue(0));
// for (int j = 1 ; j < 10; j++) {
// cards[cardsInDeck++] = new UnoCard(color, UnoCard.Value.getValue(j));
// cards[cardsInDeck++] = new UnoCard(color, UnoCard.Value.getValue(j));
// }
// UnoCard.Value[] values = new UnoCard.Value[]{UnoCard.Value.DrawTwo,
// UnoCard.Value.Skip, UnoCard.Value.Reverse};
// for (UnoCard.Value value : values) {
// cards[cardsInDeck++] = new UnoCard(color, value);
// cards[cardsInDeck++] = new UnoCard(color, value);
// }
// }
// }
// }