package JavaCalculator;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


/**
 * Created by williamcoleman on 10/11/16.
 */
public class CalculatorHistory  extends User  {

    public CalculatorHistory(String n) throws IOException {
        super(n);
    }




    public static void acquireHistory() throws IOException{
        String fileName = "Calculations.txt";
        PrintWriter calFile = new PrintWriter(new FileWriter(fileName));
        Scanner hisInput = new Scanner(System.in);
        int hisMenu;
        System.out.println("Welcome to Java Calculator History. Please select your next operation." + "\n" + "1. Display previously worked equations." + "\n" + "2. Remove history.");
        hisMenu = hisInput.nextInt();
        if (hisMenu == 1) {
            for (int i = 0; i < calculations.size(); ++i) {
                calFile.println(calculations.get(i));
            }
            calFile.println(calculations);
            calFile.close();
            System.out.println(calculations);
            calculator();
        }
    }

}
