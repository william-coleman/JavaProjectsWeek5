package ToDo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by williamcoleman on 10/14/16.
 */
public class Important {

    /**
     * Hopefully this is what they meant by add the ability for items to have priority
     *
     * as of friday still unaware, time constraints have arrived
     */

    static ArrayList<String> Importants = new ArrayList<>();

    /**
     * Add an item to the list
     */

    public static void addImportant() throws IOException {
        String imp1;
        Scanner impScan = new Scanner(System.in);
        boolean william = true;
        while (william == true) {
            System.out.println("Have a new important task? Please type the next item you wish to place on your important list now. You can keep adding or enter exit to go back to the menu.");
            imp1 = impScan.nextLine();
            if (imp1.toUpperCase().equals("EXIT")) {
                System.out.println("You have exited the to-do list.");
                william = false;
                ChainLine.startHere();

            }
            Importants.add(imp1);
        }
    }


    /**
     *  Show the list in its current state
     */

    public static void showImportants() throws IOException {
        String fileName = "Importants.txt";
        PrintWriter toDoFile = new PrintWriter(new FileWriter(fileName));
        toDoFile.println(Importants);
        toDoFile.close();
        System.out.println(Importants);
    }

/**
 *  Remove items from the list
 */

 public static void removeImportant() throws IOException {
        boolean william;
        try {
            showImportants();
            int impNum;
            Scanner removeI = new Scanner(System.in);
            william = true;
            while (william == true) {
                System.out.println("Which item would you like to remove? Please start at 0 for first item on the list. Enter exit to exit.");
                impNum = removeI.nextInt();
                Importants.remove(impNum);
                System.out.println(Importants);
            }
        } catch (InputMismatchException im) {
            System.out.println("You have exited the remove function or entered an error.");
            william = false;
            ChainLine.startHere();

        }
    }
}
