package JavaCalculator;
import ToDo.ChainLine;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Created by williamcoleman on 10/12/16.
 */
public class History extends Calculator {

    /**
     * The cal writes and displays the functions you have inputted during the current session here
     * Spent forever trying to figure out how to keep equations in the array from previous runs, not finished yet
     * writes to the txt file, hope to figure out how to streamline this process and make it run better fri
     */

    public static void acquireHistory() throws IOException {
        String fileName = "Calculations.txt";
        PrintWriter calFile = new PrintWriter(new FileWriter(fileName));
        Scanner hisInput = new Scanner(System.in);
        int hisMenu;
        System.out.println("Welcome to Java Calculator History. Please select your next operation." + "\n" + "1. Display previously worked equations." + "\n" + "2. Remove history." + "\n" + "3. End");
        hisMenu = hisInput.nextInt();
        boolean Will = true;
        while (Will == true) {
            boolean william;
            if (hisMenu == 1) {
                for (int i = 0; i < calculations.size(); ++i) {
                    calFile.println(calculations.get(i));
                }
                calFile.close();
                System.out.println(calculations);
                acquireHistory();
                break;
            } else if (hisMenu == 2) {
                try {
                    System.out.println(calculations);
                    int CalNum;
                    Scanner removeCal = new Scanner(System.in);
                    william = true;
                    while (william == true) {
                        System.out.println("Which item would you like to remove? Please start at 0 for first item on the list. Enter exit to exit.");
                        CalNum = removeCal.nextInt();
                        calculations.remove(CalNum);
                        System.out.println(calculations);
                    }
                } catch (InputMismatchException im) {
                    System.out.println("You have exited the remove function or entered an error.");
                    Will = false;
                    william = false;
                    acquireHistory();
                }

            } else if (hisMenu == 3) {
                Will = false;
                william = false;
                startup();
                break;
            }
        }
    }
}

