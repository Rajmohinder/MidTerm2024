/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days;

import java.util.Scanner;

/**This class takes String input from user 
 * and calls method  to print the 
 * name of the day.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the week day names. 
 *
 * @author sivagamasrinivasan
 jn 22nd
 */

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
class Weekdays {
    public void nameOfDay(Day day) {
        System.out.println("Day name: " + day);
    }
}

public class Days {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
    Scanner in =new Scanner(System.in);
    System.out.println("Enter the day number (one,two,three,four,five) in string");
    int dayNumber = in.nextInt();

        // Ensure the entered number is within the valid range
        if (dayNumber >= 0 && dayNumber <= 6) {
            // Convert the entered number to the corresponding Day enum
            Day selectedDay = Day.values()[dayNumber];

            Weekdays weekdays = new Weekdays();
            weekdays.nameOfDay(selectedDay);
        } else {
            System.out.println("Invalid day number. Please enter a number between 0 and 6.");
        }
    }
    
}
