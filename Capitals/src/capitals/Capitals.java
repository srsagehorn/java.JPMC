package capitals;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

//Print all of the state names to the screen. 
//Print all of the capital names to the screen. 
//Print each state along with its capital to the screen. 

public class Capitals {
    public static void main(String[] args) {
        Map<String, String> cityState = new HashMap<>();
                
        cityState.put("Alabama", "Montgomery");
        cityState.put("Alaska", "Juneau");
        cityState.put("Arizona", "Phoenix");
        cityState.put("Arkansas", "Little Rock");
        cityState.put("California", "Sacramento");
        cityState.put("Colorado", "Denver");
        cityState.put("Connecticut", "Hartford");
        cityState.put("Delaware", "Dover");
        cityState.put("Florida", "Tallahassee");
        cityState.put("Georgia", "Atlanta");
        cityState.put("Hawaii", "Honolulu");
        cityState.put("Idaho", "Boise");
        cityState.put("Illinois", "Springfield");
        cityState.put("Indiana", "Indianapolis");
        cityState.put("Iowa", "Des Moines");
        cityState.put("Kansas", "Topeka");
        cityState.put("Kentucky", "Frankfurt");
        cityState.put("Louisiana", "Baton Rouge"); 
        cityState.put("Maine", "Augusta");
        cityState.put("Maryland", "Annapolis");
        cityState.put("Massachusetts", "Boston");
        cityState.put("Michigan", "Lansing");
        cityState.put("Minnesota", "Saint Paul");
        cityState.put("Mississippi", "Jackson");
        cityState.put("Missouri", "Jefferson City");
        cityState.put("Montana", "Helena");
        cityState.put("Nebraska", "Lincoln");
        cityState.put("Nevada", "Carson City");
        cityState.put("New Hampshire", "Concord");
        cityState.put("New Jersey", "Trenton");
        cityState.put("New Mexico", "Santa Fe");
        cityState.put("New York", "Albany");
        cityState.put("North Carolina", "Raleigh");
        cityState.put("North Dakota", "Bismarck");
        cityState.put("Ohio", "Columbus");
        cityState.put("Oklahoma", "Oklahoma City");
        cityState.put("Oregon", "Salem");
        cityState.put("Pennsylvania", "Harrisburg");
        cityState.put("Rhode Island", "Providence");
        cityState.put("South Carolina", "Columbia");
        cityState.put("South Dakota", "Pierre");
        cityState.put("Tennessee", "Nashville");
        cityState.put("Texas", "Austin");
        cityState.put("Utah", "Salt Lake City");
        cityState.put("Vermont", "Montpelier");
        cityState.put("Virginia", "Richmond");
        cityState.put("Washington", "Olymoia");
        cityState.put("West Virginia", "Charleston");
        cityState.put("Wisconsin", "Madison");
        cityState.put("Wyoming", "Cheyenne");
        
        Set set = cityState.entrySet();
        System.out.println("The States are:");
        Iterator states = set.iterator();
        while(states.hasNext()) {
        Map.Entry mentry = (Map.Entry)states.next();
        System.out.println(mentry.getKey());
    }
        System.out.println("The Capitals are:");
        Iterator capitals = set.iterator();
        while(capitals.hasNext()) {
        Map.Entry mentry = (Map.Entry)capitals.next();
        System.out.println(mentry.getValue());
    }
        System.out.println("The States and matching capitals are:");
        Iterator both = set.iterator();
        while(both.hasNext()) {
        Map.Entry mentry = (Map.Entry)both.next();
        System.out.println("The capital of " + mentry.getKey() + " is " + mentry.getValue());
    }
}
}