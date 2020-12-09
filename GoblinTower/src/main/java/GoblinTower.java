
import java.util.Random;
import java.util.Scanner;



public class GoblinTower {
    public static void main(String[] args) {
        System.out.println("What would you like your characters name to be?");
        Scanner input = new Scanner (System.in);
        String Name = input.next();
        int position = 0;
            
        public void estStats() {
            //Each new hero starts with random max health points between 20 to 30.
            Random health = new Random();
            int healthPts = health.nextInt((30 - 20) + 1) + 20;
            //Each new hero will start with a random attack power between 1 to 3.
            Random attack = new Random();
            int attackPower = attack.nextInt((3 - 1) + 1) + 1;
            //Each new hero will start with a random defense power between 1-5.
            Random defense = new Random();
            int defensePower = defense.nextInt((5 - 1) + 1) + 1;

            //Each new hero will start with an array of potions (int) with a max of 5 slots. Each slot set to 2.
            int potions = 5;
            //Each new hero will start with 0 gold.
            int gold = 0;

            System.out.println(Name + " has: \n" + 
                    healthPts + " health points \n" + 
                    attackPower + " attack power \n" + 
                    defensePower + " defense power \n" +
                    potions + " potions (Each one has +2 health power) \n" +
                    gold + " gold \n"
            );
        }
        public void walk (){
            position++;
            //After every 10 steps the hero advances one level in the game.
            if (position == 10) {
                System.out.println("You have reached the next level!");
            }
            Random odds = new Random();
            int goblinOdds = odds.nextInt((10 - 1) + 1) + 1;
            //The hero will take a step, and possibly encounter a 'goblin.'
            if (goblinOdds >7) {
                System.out.println(Name + " has encountered a Goblin at position " + position);
                fight();
            }
            else {
                System.out.println(Name + " has moved to position " + position + "and did not encounter a goblin");
                whatNext();
            }
        }
//        public void estGoblin() {
//            //A goblin starts with 5-10 Health points, 2-3 attack power, and 1-2 defense power
            Random gHealth = new Random();
            int gHealthPts = gHealth.nextInt((3 - 1) + 1) + 1;
            Random gattack = new Random();
            int gattackPower = gattack.nextInt((3 - 1) + 1) + 1;
            Random gDefense = new Random();
            int gDefensePower = gDefense.nextInt((3 - 1) + 1) + 1;
//
//        }
//        public void fight () {
//            //If a goblin is found, the hero fights the goblin until either the hero or goblin's health points reach 0.
//            //If the hero wins, reward the hero with 2 gold.
//        }
//        
//        public void potions() {
//            //Each potion is worth their value in the array: 1 potion = 2 health points.
//            //Drinking a potion will increase the hero’s health points up to the max random health points assigned at the start of the game.
//        }
//        
//        public void playAgain() {
//            //When the hero dies, ask the player if they would like to play again.
//            //If the player says yes, create a new character with the same gold they had when they died.
//            //If the player says no, print out the level the current character reached with the number of goblins slain!
//        }
//        
//        public void whatNext () {
//            //The hero may visit the "potion shop" to buy more potions for 4 gold each.
//            //Walk or eat potion?
//        }
    }
    
}

//Requirements
//The completed application must be a Java Maven console application.
//The code must use String, double, int arrays and Scanner variables correctly.
//The code must include multiple classes that are designed appropriately for their use.
//The program must use at least one loop and include appropriate conditional statements using if or switch statements.