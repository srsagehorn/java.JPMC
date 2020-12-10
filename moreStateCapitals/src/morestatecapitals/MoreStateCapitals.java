//State is key value is an object with info about the capital/state
//load in info from file instead of hand writing it
//It will have a class called Capital with name population and square mileage properties
//It will have another class with your main method called StateCapitalsApp.
//This class will have a main method.
//The main method will include a Map declared to map the name of a state to its corresponding Capital object. (State name is the key, Capital object is the value.)
//Next, using your data unmarshaling strategy to use this linked file to create all appropriate Capital objects and store them under their appropriate state name in your Map:
//MoreStateCapitals.txt (Links to an external site.)
//Print out a message detailing how many State Capitals were loaded into your HashMap.
//Next, print out each state and its capitals name, population, and square mileage to the screen. 
//Hint: Use the key set to get each Capital object out of the map one by one and then print each field of the Capital object to the screen.
//Then, prompt the user for a population limit, print out all states & their capitals who have a population over that limit.
//Hint: You will have to add code to ask the user for a minimum population. Once you have this value, go through each state/capital pair as you did for the last step, but only print the information for capitals that have a population above the limit.
//Finally, prompt the user for an area limit, print out all states & their capitals who have an area under that limit.
//Sample output (order may vary):
//50 STATE/CAPITAL PAIRS LOADED.
//==============================
//Alabama - Montgomery | Pop: 205000 | Area: 156 sq mi
//Alaska - Juneau | Pop: 31000 | Area: 3255 sq mi
//Arizona - Phoenix | 1445000 | Area: 517 sq mi
//Arkansas - Little Rock | Pop: 193000 | Area: 116 sq mi
//…
//…
//
//Please enter the lower limit for capital city population: 150000
//150000
//
//LISTING CAPITALS WITH POPULATIONS GREATER THAN 150000:
//
//Alabama - Montgomery | Pop: 205000 | Area: 156 sq mi
//Arizona - Phoenix | 1445000 | Area: 517 sq mi
//Arkansas - Little Rock | Pop: 193000 | Area: 116 sq mi
//…
//…
//
//Please enter the upper limit for capital city sq mileage:
//150
//
//LISTING CAPITALS WITH AREAS LESS THAN 150:
//Arkansas - Little Rock | Pop: 193000 | Area: 116 sq mi
//…
//…
package morestatecapitals;

/**
 *
 * @author shannonsagehorn
 */
public class MoreStateCapitals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
