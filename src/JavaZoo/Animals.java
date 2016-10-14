package JavaZoo;
import java.util.Scanner;
/**
 * Created by williamcoleman on 10/14/16.
 */
public class Animals {

    /**
     * This is where I have declared what animals are going to be made out of, and made the variables global for easier use
     */

    protected static String food;
    protected static String name;
    protected static String violent;

    public Animals(String n, String f, String v) {
        name = n;
        food = f;
        violent = v;

    }

    /**
     *These are my constructors that retrieve the information created and come in handy in my later methods
     */

    public static String getName() {
        return name;
    }

    public static String getFood(){
        return food;
    }

    public static String getViolence(){
        return violent;
    }


    /**
     * This displays the finished product (animal) once it has been created
     */


    public static void displayAnimals() {
        System.out.println("Name: " + name + "\n" + "Diet: " + food + "\n" + "Is it dangerous: " + violent + "\n");
    }



    /**
     * This is the final and most important method that lets the console and the user do everything they need to create an animal
     */


    public static void createAnimal() {
        System.out.println("Thank you for creating an animal. Please enter the animals name, the food it eats, and if it is violent (yes or no) one at a time, and press enter.");
        Scanner sName = new Scanner(System.in);
        Scanner sFood = new Scanner(System.in);
        Scanner sSafe = new Scanner(System.in);
        name = sName.nextLine();
        food = sFood.nextLine();
        violent = sSafe.nextLine();
        Animals name = new Animals(getName(), getFood(), getViolence());
        name.displayAnimals();
    }
}
