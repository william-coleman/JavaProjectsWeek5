package JavaCalculator;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by williamcoleman on 10/11/16.
 */
public class CalculatorBones extends User{
    static double num1;
   static double num2;
   static String operator;
   static Scanner calInput = new Scanner(System.in);

    public CalculatorBones(String n) throws IOException {
        super(n);
    }

    public static void CalFunction() throws IOException {

        while (true)

        {

//            try {
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
                    CalFunction();
                    break;
                }
//            } catch (InputMismatchException ie) {
//                System.out.println("You have exited the program or entered an error. Please come again.");
//                calculator();
//                break;
//            e
        }
    }
}