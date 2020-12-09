
// //Birthday Calculator
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.Period;
import java.time.Year;
//import java.time.format.DateTimeFormatter;

public class BirthdayCalculator {
    public static void main(String[] args) {
//        ask the user for their birthday and save the input
        System.out.println("What is your birthdate? (DD-MM-YYYY)");
        Scanner input = new Scanner (System.in);
        String Input = input.next();
        
//        set each value in their respective designation
        int month = Integer.parseInt(Input.substring(0, 2));
        int day = Integer.parseInt(Input.substring(3, 5));
        int year = Integer.parseInt(Input.substring(Input.length() - 4));
        int thisYear = Year.now().getValue();
        int nextYear = thisYear++;
        

        LocalDate birthdate = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();
        String birthDay = birthdate.getDayOfWeek().toString();
        LocalDate nextBday = LocalDate.of(thisYear, month, day);
        long daysTil = ChronoUnit.DAYS.between(nextBday, today);
        
//        if their next birthday is next year adjust the date and the days til
        if (!nextBday.isAfter(today)) {
            System.out.println("Bday is next year");
            nextBday = LocalDate.of(nextYear, month, day);
            daysTil = ChronoUnit.DAYS.between(today, nextBday);
        }
//        
        String dayThisYear = nextBday.getDayOfWeek().toString();
        long age = ChronoUnit.YEARS.between(birthdate, today) +1;


        System.out.println("Your birthday is " + birthdate.toString());
        System.out.println("This means that you were born on a " + birthDay);
        System.out.println("This year it falls on a " + dayThisYear);
        System.out.println("Since today is " + today);
        System.out.println("There are " + daysTil + " your next birthday when you turn " + age);
    }
 }