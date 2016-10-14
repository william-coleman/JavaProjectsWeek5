package JavaZoo;

import java.util.Scanner;

/**
 * Created by williamcoleman on 10/14/16.
 */
public class People {
    /**
     * This is where I have declared what people are going to be made out of, and made the variables global for easier use
     */

    protected static String name;
    protected static String gender;
    protected static int age;

    public People(String n, String g, int a) {
        name = n;
        gender = g;
        age = a;

    }

    /**
     *These are my constructors that retrieve the information created and come in handy in my later methods
     */

    public static String getName() {
        return name;
    }

    public static String getGender(){
        return gender;
    }

    public static int getAge(){
        return age;
    }

    /**
     * This displays the finished product (person) once it has been created
     */

    public static void displayPeople() {
        System.out.println("Name: " + name + "\n" + "Gender: " + gender + "\n" + "Age: " + age + "\n");
    }

    /**
     * This is the final and most important method that lets the console and the user do everything they need to create a person
     */

    public static void createPerson() {
        System.out.println("Thank you for creating a person. Please enter the persons name, its gender, and its age; one at a time, and press enter.");
        Scanner sName = new Scanner(System.in);
        Scanner sGender = new Scanner(System.in);
        Scanner sAge = new Scanner(System.in);
        name = sName.nextLine();
        gender = sGender.nextLine();
        age = sAge.nextInt();
        People name = new People(getName(), getGender(), getAge());
        name.displayPeople();
    }

}
