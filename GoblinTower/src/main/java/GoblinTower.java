
import java.util.Random;
import java.util.Scanner;



public class GoblinTower {
    public static void main(String[] args) {
        System.out.println("What would you like your characters name to be?");
        Scanner input = new Scanner (System.in);
        String Name = input.next();
        //Each new hero will start with 0 gold.
        int gold = 0;
        int level = 0;
            
        public void estStats() {
            //Each new hero starts with random max health points between 20 to 30.
            Random hHealth = new Random();
            int hHealthPts = hHealth.nextInt((30 - 20) + 1) + 20;
            int postionMax = hHealthPoints;
            //Each new hero will start with a random attack power between 1 to 3.
            Random hAttack = new Random();
            int hAttackPower = hAttack.nextInt((3 - 1) + 1) + 1;
            //Each new hero will start with a random defense power between 1-5.
            Random hDefense = new Random();
            int hDefensePower = hDefense.nextInt((5 - 1) + 1) + 1;
            int position = 0;
            //Each new hero will start with an array of potions (int) with a max of 5 slots. Each slot set to 2.
            int potions = 5;
            printStats();
        }
        
        public void printStats () {
            
            System.out.println(Name + "is at position " + position + " on level " + level + "with: \n" + 
                    hHealthPts + " health points \n" + 
                    hAttackPower + " attack power \n" + 
                    hDefensePower + " defense power \n" +
                    potions + " potions (Each one has +2 health power) \n" +
                    gold + " gold \n")
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
                if (position % 10 = 0) {
                    System.out.println("Congrats you have made it to the next level!");
                    level++;
                }
            }
        }
        
        public void estGoblin() {
//            //A goblin starts with 5-10 Health points, 2-3 attack power, and 1-2 defense power
            Random gHealth = new Random();
            int gHealthPts = gHealth.nextInt((3 - 1) + 1) + 1;
            Random gAttack = new Random();
            int gAttackPower = gAttack.nextInt((3 - 1) + 1) + 1;
            Random gDefense = new Random();
            int gDefensePower = gDefense.nextInt((3 - 1) + 1) + 1;
            
            
        }
        public void fight () {
            int gImpact = hDefencePower - gAttack;
            int hImpact = gDefencePower - hAttackPower
            //If a goblin is found, the hero fights the goblin until either the hero or goblin's health points reach 0.
            boolean alive = true;
            while (alive == true) {  //while both characters are alive
                gHealth = gHealth - hImpact;  //hero attacks goblin         
                if(gHealth > 0) { //if the goblin is still alive
                    hHealth = hHealth - gImpact;  //goblin attacks hero
                    if (hHealth <= 0){  //if hero is dead ask if they want to play again
                        alive = false;
                        System.out.printLn("You have been killed");
                        playAgain()
                    }
                    else { //if goblin is dead report your new health points, award them two gold and ask what to do next
                        alive = false;
                        System.out.printLn("You killed the Goblin \n "
                                + "You now have" + hHealthPts + "health points");
                        //If the hero wins, reward the hero with 2 gold.
                        gold += 2;
                        whatNext();
                    }
                }
            }
        }
//        
        public void potions() {
            //The hero may visit the "potion shop" to buy more potions for 4 gold each.
            System.out.println("You currently have " + gold + " gold and " + potions + "potions \n" +
                    "Would you like to drink a potion or buy a potion? (Press B for buy, T for take, and X for exit");
                Scanner potionC = new Scanner (System.in);
                String potionChoice = potionC.next();
//                Walk or eat potion?
                if (potionChoice.toLowerCase() == "b") {
                    if (gold >=4) {
                        gold = gold-4;
                }
                if(potionChoice.toLowerCase() == "t") {
                    if (potions > 0) {
                        potions--;
                        hHealthPoints = hHealthPoints + 2;
                        System.out.println("Potion taken, you currently have " + hHealthPoints + " and " + potions +  " potions left.")
                        whatNext();
                    }
                    else {
                        System.out.println("You do not have any more potions left");
                    }}
                }
                if(potionChoice.toLowerCase() == "x") {
                    whatNext();
                }
                else{
                    System.out.println("incorrect input, you must answer with a b or t");
                    potions();
                }
//            //Each potion is worth their value in the array: 1 potion = 2 health points.
//            //Drinking a potion will increase the hero’s health points up to the max random health points assigned at the start of the game.
        }
      
        public void playAgain() {
            //When the hero dies, ask the player if they would like to play again.
            System.out.println("Would you like to play again? (Press Y for yes and N for no);
                Scanner again = new Scanner (System.in);
                String playAgain = again.next();
//                Walk or eat potion?
                if (playAgain.toLowerCase() == "y") {
                    estStats();
                }
                if(playAgain.toLowerCase() == "n") {
                    System.out.println("Fine then, bye");
                }
                else{
                    System.out.println("incorrect input, you must answer with a y or n");
                    playAgain();
                }
            //If the player says yes, create a new character with the same gold they had when they died.
            //If the player says no, print out the level the current character reached with the number of goblins slain!
        }        
        public void whatNext () {
//                Walk or eat potion?
                System.out.println("What would you like to do next? \n"
                        + "Visit the Potion Shop (presss P) \n "
                        + "Walk forward (press W) \n "
                        + "Print your current stats (press S");
                Scanner action = new Scanner (System.in);
                String nextMove = action.next();
                if (nextMove.toLowerCase() == "p") {potion();}
                if(nextMove.toLowerCase() == "w") {walk();}
                if(nextMove.toLowerCase() == "s") {printStats();}
                else{
                    System.out.println("incorrect input, you must answer with a b or w");
                    whatNext();
                }
        }
    }
    
}

//Requirements
//The completed application must be a Java Maven console application.
//The code must use String, double, int arrays and Scanner variables correctly.
//The code must include multiple classes that are designed appropriately for their use.
//The program must use at least one loop and include appropriate conditional statements using if or switch statements.