package JavaCalculator;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Created by williamcoleman on 10/12/16.
 */
public class Calculator {

    /**
     * This is the main method, like I iterated I enjoy menus, so everything flows through here with some added basic functions for the calculator
     */

    static ArrayList<String> calculations = new ArrayList<>();

    /**
     * This is the main method that initiates and cycles through all the methods available
     */

    public static void startup() throws IOException {
        Scanner starting = new Scanner(System.in);
        int startingInput;
        System.out.println("Welcome to Java Calculator." + "\n" + "Please select a function:" + "\n" + "1. Calculator" + "\n" + "2. Tip Calculator" + "\n" + "3. History" + "\n" + "4. Help" + "\n" + "5. Quit");
        startingInput = starting.nextInt();
        switch (startingInput) {
            case (1):
                baseCal();
                break;
            case (2):
                TipCal.tipCalFunc();
                break;
            case (3):
                History.acquireHistory();
                break;
            case (4):
                Help.helpMenu();
                break;
            case (5):
                System.out.println("Thank you for using Java Calculator. Good-bye");
                break;
        }
    }

    /**
     *I also decided to throw my simple calculator in this class as well instead of making a separate unnecessary class for it
     */

    public static void baseCal() throws IOException {
        String fileName = "Calculations.txt";
        PrintWriter calFile = new PrintWriter(new FileWriter(fileName));
        boolean Will;
        try {
            double num1;
            String operator;
            double num2;
            Scanner calInput = new Scanner(System.in);
            Will = true;
            while (Will == true) {
                System.out.println("Enter your equation or enter Exit to close calculator.");
                num1 = calInput.nextDouble();
                operator = calInput.next();
                num2 = calInput.nextDouble();

                switch (operator) {
                    case ("+"):
                        calculations.add(num1 + " " + operator + " " + num2 + " ");
                        System.out.println(num1 + num2);
                        double result = num1 + num2;
                        calFile.println( num1 + " " + operator + " " + num2 + "=" + result);
                        calFile.close();
                        break;


                    case ("-"):
                        calculations.add(num1 + " " + operator + " " + num2 + " ");
                        System.out.println(num1 - num2);
                        result = num1 + num2;
                        calFile.println( num1 + " " + operator + " " + num2 + "=" + result);
                        calFile.close();
                        break;

                    case ("/"):
                        calculations.add(num1 + " " + operator + " " + num2 + " ");
                        System.out.println(num1 / num2);
                        result = num1 + num2;
                        calFile.println( num1 + " " + operator + " " + num2 + "=" + result);
                        calFile.close();
                        break;


                    case ("*"):
                        calculations.add(num1 + " " + operator + " " + num2 + " ");
                        System.out.println(num1 * num2);
                        result = num1 + num2;
                        calFile.println( num1 + " " + operator + " " + num2 + "=" + result);
                        calFile.close();
                        break;
                }
            }
        } catch (InputMismatchException im) {
            System.out.println("You have exited the calculator or entered an error.");
            Will = false;
            startup();

        }
        /**
         * Just to make sure nothing too terrible happened here, I set up a try catch method that also acts as a back button.
         * I really enjoyed this practice once I figured it out so i used it a couple of times
         * there may be a better way to run this
         */
    }
    }

