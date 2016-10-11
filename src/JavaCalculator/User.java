package JavaCalculator;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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



    public static void calWelcome() {
        int commandInput;
        System.out.println("Welcome to Java Calculator. Please enter your name now: ");
        Scanner welInput = new Scanner(System.in);
        nameInput = welInput.nextLine();
        System.out.println("Thank you " + nameInput + ". Please select the program that you would like to run: ");
        System.out.println("1. Calculator" + "\n" + "2. Tip Calculator" + "\n" + "3. Help" + "\n" + "4. Close");
        commandInput = welInput.nextInt();
        if (commandInput == 1) {
            calculator();
        } else if (commandInput == 2) {
            System.out.println("Tip Calculator");
        } else if (commandInput == 3) {
            System.out.println("Help");
        } else if (commandInput == 4) {
            System.out.println("Thank you for evaluating arithmetic with Java Calculator. Good-bye.");
        }
    }

    public static void calculator() {

        Scanner calStart = new Scanner(System.in);

        System.out.println("Thank you " + nameInput + " for choosing Calculator. What would you like to do?" + "\n" + "1. Start Calculations" + "\n" + "2. Display previous calculations" + "\n" + "3. Exit");
        int startInput = calStart.nextInt();
        if (startInput == 1) {
            CalculatorBones.CalFunction();
        } else if (startInput == 2) {
            CalculatorHistory.acquireHistory();
        } else if (startInput == 3) {
            calWelcome();
        }

    }
}


