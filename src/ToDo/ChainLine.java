package ToDo;
import java.io.IOException;
import java.util.Scanner;
/**
 * Created by williamcoleman on 10/13/16.
 */
public class ChainLine {

    /**
     * The main pipe that channels all the functions in the program
     * Probably a better way to streamline this, still fond of this method
     */

    public static void startHere() throws IOException {
        Scanner startUp = new Scanner(System.in);
        int starIn;
        System.out.println("Hello! Welcome to Java to-do. Please select an operation by entering the corresponding number." + "\n" + "1. Add an item to a list" + "\n" + "2. Show your current Lists" + "\n" + "3. Remove items from your list" + "\n" + "4. Help Menu" + "\n" + "5. Quit");
        starIn = startUp.nextInt();
        switch (starIn) {
            case (1):
                subMenuAdd();
                break;
            case (2):
                subMenuSee();
                break;
            case (3):
                removeSub();
                break;
            case (4):
                helpMenu();
                break;
            case (5):
                System.out.println("Good-Bye");
                break;
            default:
                break;

            /**
             * Need a workshop on default but its not broke yet
             */

        }
    }


    /**
     *  Sub menus for all my methods to make the program as flexible as possible
     *
     *  looks a little cramped needs to be cleaned up
     *
     *  looks okay for now
     */

    public static void subMenuAdd() throws IOException {
        Scanner subAdd = new Scanner(System.in);
        int subIn;
        System.out.println("Which list would you like to add to?" + "\n" + "1. To-do" + "\n" + "2. Grocery" + "\n" + "3. Important Priorities");
        subIn = subAdd.nextInt();
        switch (subIn) {
            case (1):
                Tasks.addTask();
                break;
            case (2):
                Groceries.addGroce();
                break;
            case (3):
                Important.addImportant();
                break;
            default:
                break;
        }
    }

    public static void subMenuSee() throws IOException {
        Scanner subShow = new Scanner(System.in);
        int subIn;
        System.out.println("Which list would you like to show?" + "\n" + "1. To-do" + "\n" + "2. Grocery" + "\n" + "3. Important Priorities");
        subIn = subShow.nextInt();
        switch (subIn) {
            case (1):
                Tasks.showTask();
                startHere();
                break;
            case (2):
                Groceries.showGroce();
                startHere();
                break;
            case (3):
                Important.showImportants();
                startHere();
                break;
            default:
                break;
        }

    }

    public static void removeSub() throws IOException {
        Scanner subRemove = new Scanner(System.in);
        int subIn;
        System.out.println("Which list would you like to remove items from?" + "\n" + "1. To-do" + "\n" + "2. Grocery" + "\n" + "3. Important Priorities");
        subIn = subRemove.nextInt();
        switch (subIn) {
            case (1):
                Tasks.removeTask();
                break;
            case (2):
                Groceries.removeGroce();
                break;
            case (3):
                Important.removeImportant();
                break;
            default:
                break;
        }
    }

    public static void helpMenu() throws IOException {
        System.out.println("Welcome to the Java to-do help menu." + "\n" + "To enter into a operation, enter the number associated with that operation and press enter." + "\n" + "To add an item, enter 1 at the main menu, then enter the correct number associated with the list you want to access. Then follow the instructions from the submenu." + "\n" + "To see your current lists, press 2 at the main menu, then press the number associated with the list that you want to see." + "\n" + "To remove an item from a list, press 3 from the main menu, then press the number associated with the list you want to access. Your list will then be displayed. To remove the first number, start at 0 and enter 0. To remove the second, enter 1, to remove the third enter 2 and so on. The number you enter will be one digit lower than the item you're trying to remove. " + "\n" + "To quit, press 5 at the main menu." + "\n" + "To exit this screen please enter Exit below.");
        String help1;
        Scanner helpScan = new Scanner(System.in);
        boolean william = true;
        while (william == true) {
            help1 = helpScan.nextLine();
            if (help1.toUpperCase().equals("EXIT")) {
                System.out.println("You have exited the help menu.");
                william = false;
                ChainLine.startHere();
            }
        }
    }
}



