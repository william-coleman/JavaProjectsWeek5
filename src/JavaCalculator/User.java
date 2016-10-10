package JavaCalculator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by williamcoleman on 10/10/16.
 */
public class User {
    public String name;
    public String nameInput;

    public User(String n) {
        n = name;
    }

    protected ArrayList<String> calculations = new ArrayList<String>();

    protected void calWelcome() {
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

    protected void calculator() {

        double num1;
        double num2;
        String operator;
        Scanner calStart = new Scanner(System.in);
        Scanner calInput = new Scanner(System.in);
        Scanner cont = new Scanner(System.in);
        System.out.println("Thank you " + nameInput + " for choosing Calculator. What would you like to do?" + "\n" + "1. Start Calculations" + "\n" + "2. Display previous calculations" + "\n" + "3. Exit");
        int startInput = calStart.nextInt();
        if(startInput == 1){
        while (true) {

            boolean yes = true;
            boolean no = false;
            try {
            System.out.println("Enter your equation or enter Exit to close calculator.");
            num1 = calInput.nextDouble();
            operator = calInput.next();
            num2 = calInput.nextDouble();



                if (operator.equals("+")) {
                    calculations.add(num1 + " " + operator + " " + num2 + " ");
                    System.out.println(num1 + num2);

                } else if (operator.equals("-")) {
                    calculations.add(num1 + " " + operator + " " + num2 + " ");
                    System.out.println(num1 - num2);
                } else if (operator.equals("/")) {
                    calculations.add(num1 + " " + operator + " " + num2 + " ");
                    System.out.println(num1 / num2);

                } else if (operator.equals("*")) {
                    calculations.add(num1 + " " + operator + " " + num2 + " ");
                    System.out.println(num1 * num2);
                } else {
                    calWelcome();
                }
            } catch(InputMismatchException ie){
                System.out.println("Enter your equation or enter Exit to close calculator.");
                calWelcome();
            }
        }
        }
    }
}

