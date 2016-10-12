package JavaCalculator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by williamcoleman on 10/10/16.
 */
public class User {

    public User(String n) throws IOException {
        n = name;

    }
        static public String name;
        static public String nameInput;
        static public ArrayList<String> calculations = new ArrayList<>();
        static public Scanner welInput = new Scanner(System.in);

    public static void calWelcome() throws IOException {
        System.out.println("Welcome to Java Calculator. Please enter your name now: ");
        nameInput = welInput.nextLine();
            calMenu();
        }



    public static void calMenu() throws IOException {
        int commandInput;
        System.out.println("Thank you " + nameInput + ". Please select the program that you would like to run: ");
        System.out.println("1. Calculator" + "\n" + "2. Tip Calculator" + "\n" + "3. Help" + "\n" + "4. Close");
        commandInput = welInput.nextInt();
        while(true)
        if (commandInput == 1) {
            calculator();
            break;
        } else if (commandInput == 2) {
            System.out.println("Tip Calculator");
            break;
        } else if (commandInput == 3) {
            helpSec();
            break;
        } else if (commandInput == 4) {
                System.out.println("Thank you for evaluating arithmetic with Java Calculator. Good-bye.");
                break;
        }
    }

    public static void helpSec() throws IOException {
        System.out.println("Welcome to Java Calculator's Help menu." + "\n" + " To use the Java Calculator, please navigate to Calculator and input one number, space, one operator, space, one number. Your equation will be calculated and the outcome will be shown to you. To exit the calculator, type exit when you are asked for an equation." + "\n" + "To display previous equations that you have inputted to the calculator, Exit the calculator bringing you back to the sub menu and select 2. Display previous Calculations." + "\n" + "To close the program, select exit in the current submenu you are in, taking you back to the main and input to exit.");
        while(true){
            System.out.println("Please try again.");
            calMenu();
            break;
        }
    }

    public static void calculator() throws IOException {

        Scanner calStart = new Scanner(System.in);

        System.out.println("Thank you " + nameInput + " for choosing Calculator. What would you like to do?" + "\n" + "1. Start Calculations" + "\n" + "2. Display previous calculations" + "\n" + "3. Exit");
        int startInput = calStart.nextInt();
        while(true)
        if (startInput == 1) {
            CalculatorBones.CalFunction();
        } else if (startInput == 2) {
            CalculatorHistory.acquireHistory();
        } else if (startInput == 3) {
            calMenu();
            break;
        }

    }
}


