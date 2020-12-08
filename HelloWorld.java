// public class playerDeck {

// }

// public class playerDeck {
//     public static void main(String[] args) {
//         String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };

//         String[] VALUES = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

//         // initialize deck
//         int n = SUITS.length * VALUES.length;
//         String[] deck = new String[n];
//         for (int i = 0; i < VALUES.length; i++) {
//             for (int j = 0; j < SUITS.length; j++) {
//                 deck[SUITS.length * i + j] = VALUES[i] + " of " + SUITS[j];
//             }
//         }

//         // shuffle
//         for (int i = 0; i < n; i++) {
//             int r = i + (int) (Math.random() * (n - i));
//             String temp = deck[r];
//             deck[r] = deck[i];
//             deck[i] = temp;
//         }

//         // print shuffled deck
//         for (int i = 0; i < n; i++) {
//             System.out.println(deck[i]);
//         }
//     }

// }

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}