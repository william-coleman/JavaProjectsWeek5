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
public class Tasks {
    static ArrayList<String> Jobs = new ArrayList<>();

    /**
     * Add an item to the list
     */

    public static void addTask() throws IOException {
        String job1;
        Scanner taskScan = new Scanner(System.in);
        boolean william = true;
        while (william == true) {
            System.out.println("Have a new important task? Please type the next item you wish to place on your to-do list now. You can keep adding or enter exit to go back to the menu.");
            job1 = taskScan.nextLine();
            if (job1.toUpperCase().equals("EXIT")) {
                System.out.println("You have exited the to-do list.");
                william = false;
                ChainLine.startHere();

            }
            Jobs.add(job1);
        }
    }

    /**
     *  Show the list in its current state
     */

    public static void showTask() throws IOException{
        String fileName = "Jobs.txt";
        PrintWriter toDoFile = new PrintWriter(new FileWriter(fileName));
        toDoFile.println(Jobs);
        toDoFile.close();
        System.out.println(Jobs);

    }

/**
 *  Remove items from the list
 */


 public static void removeTask() throws IOException {
        boolean william;
        try {
            showTask();
            int taskNum;
            Scanner removeT = new Scanner(System.in);
            william = true;
            while (william == true) {
                System.out.println("Which item would you like to remove? Please start at 0 for first item on the list. Enter exit to exit.");
                taskNum = removeT.nextInt();
                Jobs.remove(taskNum);
                System.out.println(Jobs);
            }
        } catch (InputMismatchException im) {
            System.out.println("You have exited the remove function or entered an error.");
            william = false;
            ChainLine.startHere();

        }
    }
}


