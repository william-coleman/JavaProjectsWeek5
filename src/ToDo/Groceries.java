package ToDo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by williamcoleman on 10/13/16.
 */
public class Groceries {

    /**
     * The first list that needs to be made
     *
     * a lot of practices are copied to the other classes looking easier than thought worried theres a better way
     */



    static ArrayList<String> Groceries = new ArrayList<>();

    /**
     * Add an item to the list
     */

        public static void addGroce() throws IOException {
            String groce1;
            Scanner taskScan = new Scanner(System.in);
            boolean william = true;
            while (william == true) {
                System.out.println("Have a new grocery item? Please type the next item you wish to place on your shopping list now.");
                groce1 = taskScan.nextLine();
                if (groce1.toUpperCase().equals("EXIT")) {
                    System.out.println("You have exited the grocery list.");
                    william = false;
                    ChainLine.startHere();
                }
                Groceries.add(groce1);
            }
        }


    /**
     *  SHow the list in its current state
     */

    public static void showGroce() throws IOException{
            String fileName = "Groceries.txt";
            PrintWriter toDoFile = new PrintWriter(new FileWriter(fileName));
            toDoFile.println(Groceries);
            toDoFile.close();
            System.out.println(Groceries);
        }


    /**
     *  Remove items from the list
     *
     *  chose to have the list shown before removal so you could know which item you were removing
     *
     *  has to be an easier way to explain how to delete items to people un familiar with arrays
     *
     *  no easy way found as of friday
     */

    public static void removeGroce() throws IOException {
        boolean william;
        try {
            showGroce();
            int groceNum;
            Scanner removeG = new Scanner(System.in);
            william = true;
            while (william == true) {
                System.out.println("Which item would you like to remove? Please start at 0 for first item on the list. Enter exit to exit.");
                groceNum = removeG.nextInt();
                Groceries.remove(groceNum);
                System.out.println(Groceries);
            }
        } catch (InputMismatchException im) {
            System.out.println("You have exited the remove function or entered an error.");
            william = false;
            ChainLine.startHere();

        }
    }
    }