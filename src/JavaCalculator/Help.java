package JavaCalculator;

import ToDo.ChainLine;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by williamcoleman on 10/12/16.
 */
public class Help extends Calculator {

    /**
     * This is a simple help menu that just has the basic,
     * decided that creating a while true would give the user time to read things as well as the ability to go back when they choose instead of being
     * thrown back to the main menu
     */

    public static void helpMenu() throws IOException {
        System.out.println("Welcome to the Java Calculator help menu." + "\n" + "To enter into a operation, enter the number associated with that operation and press enter." + "\n" + "To do simple equations, enter 1 at the main menu. The input 1 number, a space, an operator, another number, and press enter. Your answer will be displayed and you can continue to do equations. To exit, enter exit." + "\n" + "To use the tip calculator, press 2 at the main menu, then follow the instructions on the screen." + "\n" + "To see the history of the standard calculator, press 3 from the main menu, then press 1. Your previous equations will be displayed." + "\n" + "To remove equations from your history select 3 from the main menu then select 2. To remove the first number, start at 0 and enter 0. To remove the second, enter 1, to remove the third enter 2 and so on. The number you enter will be one digit lower than the item you're trying to remove. " + "\n" + "To quit, press 5 at the main menu." + "\n" + "To exit this screen please enter Exit below.");
        String help1;
        Scanner helpScan = new Scanner(System.in);
        boolean william = true;
        while (william == true) {
            help1 = helpScan.nextLine();
            if (help1.toUpperCase().equals("EXIT")) {
                System.out.println("You have exited the help menu.");
                william = false;
                Calculator.startup();
            }
        }
    }
}
