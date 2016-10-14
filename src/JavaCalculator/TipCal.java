package JavaCalculator;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * Created by williamcoleman on 10/12/16.
 */
public class TipCal extends Calculator {
    /**
     * Simple tip cal
     *
     * Still confused by the tax thing, why do you need groceries at a ponderosa. Must be missing something
     *
     * tax system runs okay, still unsure wether I did what was asked, glad to finally find the round function
     *
     * research more before fri
     */

    public static void tipCalFunc() throws IOException {
        String fileName = "TipCalculations.txt";
        PrintWriter calFile = new PrintWriter(new FileWriter(fileName));
        Scanner billScan = new Scanner(System.in);
        Double bill;
        Scanner percentScan = new Scanner(System.in);
        Double percent;
        Scanner peopleScan = new Scanner(System.in);
        Scanner taxScan = new Scanner(System.in);
        int people;
        double tipTotal;
        double billSplit;
        String kenTax;
        System.out.println("Thank you for using Java Tip Calculator. Please enter your total bill below.");
        bill = billScan.nextDouble();
        System.out.println("Thank you. Please enter as a whole number, what percent you would like to tip. (Ex: 3. 15. 20.) ");
        percent = percentScan.nextDouble();
        System.out.println("Did you order alcohol in the State of Kentucky? Yes or no.");
        kenTax = taxScan.nextLine();
        System.out.println("Thank you. Finally, would you like to split your bill? If yes, please enter the number of people that are going to be splitting including yourself. If not, enter zero.");
        people = peopleScan.nextInt();
        if(people == 0 && kenTax.toUpperCase().equals("YES")) {
            tipTotal = (bill * (percent / 100));
            tipTotal = Math.round((tipTotal * 100.0) / 100.0);
            billSplit = ((bill * .06) + bill);
            billSplit = Math.round((billSplit * 100.0) / 100.0);
            System.out.println("Your bill is: $" + billSplit + "\n" + "Your tip is: $" + tipTotal);
            calFile.println("Your bill is: $" + billSplit + "\n" + "Your tip is: $" + tipTotal);
            calFile.close();
        }else if(people == 0 && kenTax.toUpperCase().equals("NO")){
            tipTotal = (bill * (percent / 100));
            tipTotal = Math.round((tipTotal * 100.0) / 100.0);
            billSplit = (bill);
            billSplit = Math.round((billSplit * 100.0) / 100.0);
            System.out.println("Your bill is: $" + billSplit + "\n" + "Your tip is: $" + tipTotal);
            calFile.println("Your bill is: $" + billSplit + "\n" + "Your tip is: $" + tipTotal);
            calFile.close();
        }else if(people > 1 && kenTax.toUpperCase().equals("YES")){
            tipTotal = ((bill * (percent / 100))/people);
            tipTotal = Math.round((tipTotal * 100.0) / 100.0);
            billSplit = (((bill * .06) + bill) / people);
            billSplit = Math.round((billSplit * 100.0) / 100.0);
            System.out.println("Your bill is: $" + billSplit + " each." + "\n" + "Your tip is: $" + tipTotal);
            calFile.println( "Your bill is: $" + billSplit + " each." + "\n" + "Your tip is: $" + tipTotal);
            calFile.close();
        } else if(people >1 && kenTax.toUpperCase().equals("NO")){
            tipTotal = ((bill * (percent / 100))/people);
            tipTotal = Math.round((tipTotal * 100.0) / 100.0);
            billSplit = ( bill / people);
            billSplit = Math.round((billSplit * 100.0) / 100.0);
            System.out.println("Your bill is: $" + billSplit + " each." + "\n" + "Your tip is: $" + tipTotal);
            calFile.println( "Your bill is: $" + billSplit + " each." + "\n" + "Your tip is: $" + tipTotal);
            calFile.close();
        }
        startup();



    }
}
