package JavaZoo;
import java.util.Scanner;
/**
 * Created by williamcoleman on 10/14/16.
 */
public class Workers {
    public static void zooStart(){


        /**
         * This is my worker class. It works as a filter for my other classes and methods. It is not yet finished
         */



        System.out.println("Hello! Welcome to Java Zoo. What would you like to create?" + "\n" + "1. Animal" + "\n" + "2. Person");
        Scanner ZSI = new Scanner(System.in);
        int sI = ZSI.nextInt();
        switch(sI){
            case(1):
                Animals.createAnimal();
                break;
            case(2):
                People.createPerson();
                break;
            default:
                System.out.println("You have exited the program. Good-Bye");
        }

    }
}
