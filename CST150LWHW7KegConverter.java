//   CST150-01   HW5liquidConverter

package cst150lwhw5liquidconverter;

import javax.swing.JOptionPane;

/**
 *
 * @author Lexus Washington
 */
public class CST150LWHW5liquidConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double kegs;   // To hold the number of cups
        double gallons; // To hold the number of ounces
        double pints;  // To hold the number of pints
        double liters; // To hold the number of liters
        double ounces; // To hold the number of ounces

        int conversion = getConversion();

        // Get the number of gallons.
        kegs = getKegs();

        // Convert the gets to gallons.
        switch (conversion) {
            case 1:
                gallons = kegsToGallons(kegs);
                displayResultsGallons(kegs, gallons);
                break;
            case 2:
                pints = kegsToPints(kegs);
                displayResultsPints(kegs, pints);
                break;
            case 3:
                liters = kegsToliters(kegs);
                displayResultsLiters(kegs, liters);
                break;
            case 4:
                ounces = kegsToOunces(kegs);
                displayResultsOunces(kegs, ounces);
                break;
            default:
                break;
        }

        // Display the results.
        System.exit(0);
    }

    /**
     * The getKegs method promtps the user to enter a number of cups.
     *
     * @return The number of cups entered by the user.
     */
    public static int getConversion() {
        String input;    // To hold input.
        int conversion;  // To hold cups.
        boolean number = true;
        
        // Choose the number of units to convert into.
        input = JOptionPane.showInputDialog(
                "What units do you want to convert to\n"
                + " Enter 1 for gallons \n\n "
                + " Enter 2 for pints \n\n"
                + " Enter 3 for liters \n\n"
                + " Enter 4 for ounces \n\n");

        // Loop for users to input one of the options provided
        conversion = Integer.parseInt(input);
        if (conversion < 5 && conversion > 0) {
            number = false;
        }
        while (number) {
            
            input = JOptionPane.showInputDialog(
                    "What units do you want to convert to\n"
                    + " Enter 1 for gallons \n\n "
                    + " Enter 2 for pints \n\n"
                    + " Enter 3 for liters \n\n"
                    + " Enter 4 for ounces \n\n");

            
            conversion = Integer.parseInt(input);
            if (conversion < 5 && conversion > 0) {
                number = false;
            }
        }
       
        return conversion;
    }

    public static double getKegs() {
        String input;    // To hold input.
        double numKegs;  // To hold cups.

        // units conversion chart
        input = JOptionPane.showInputDialog(
                "This program converts measurements\n"
                + "in kegs to gallons. For your\n"
                + "reference the formula is:\n"
                + "    1 keg = 15.5 gallons \n\n "
                + "    1 keg = 124 pints \n\n"
                + "    1 kegs = 58.674 liters \n\n"
                + "    1 kegs = 1,984 ounces \n\n"
                + "Enter the number of kegs.");

        // Convert the input to a double.
        numKegs = Double.parseDouble(input);

        // Return the number of kegs.
        return numKegs;
    }

    /**
     * The cupsToGallons method converts a number of kegs to gallons, using the
     * formula 1 Kegs = 15.5 gallons.
     *
     * @param numKegs The number of kegs to convert.
     * @return The number of gallons.
     */
    public static double kegsToGallons(double numKegs) {
        return numKegs * 15.5;
    }

    /**
     * The keysToPints method converts a number of kegs to Pints, using the
     * formula 1 kegs = 124 pints.
     *
     * @param numKegs The number of pints to convert.
     * @return The number of pints.
     */
    
    //converts kegs into pints
    public static double kegsToPints(double numKegs) {
        return numKegs * 124;
    }

    /**
     * The keysToPints method converts a number of kegs to liters, using the
     * formula 1 kegs = 58.674 liters.
     *
     * @param numKegs The number of kegs to convert.
     * @return The number of liters.
     */
    
    //converts kegs into liters
    private static double kegsToliters(double numKegs) {
        return numKegs * 58.674;
    }

    /**
     * The keysToPints method converts a number of kegs to ounces, using the
     * formula 1 kegs = 1,984 ounces.
     *
     * @param numKegs The number of kegs to convert.
     * @return The number of ounces.
     */
    //convert kegs into ounces
    private static double kegsToOunces(double numKegs) {

        return numKegs * 1984;

    }
    
 //display the number of gallons
    public static void displayResultsGallons(double Kegs, double gallons) {
        // Display the number of gallons.
        JOptionPane.showMessageDialog(null,
                Kegs + " kegs equals "
                + gallons + " gallons.");
    }

    /**
     * The displayResults method displays a message showing the results of the
     * conversion.
     *
     * @param Kegs A number of kegs.
     * @param pints A number of pints.
     */
    
    //displays the number of pints
    private static void displayResultsPints(double Kegs, double pints) {
        JOptionPane.showMessageDialog(null,
                Kegs + " kegs equals "
                + pints + " pints.");

    }

    /**
     * The displayResults method displays a message showing the results of the
     * conversion.
     *
     * @param Kegs A number of kegs.
     * @param liters A number of liters.
     */
    
//    displays the number of liters
    private static void displayResultsLiters(double Kegs, double liters) {
        JOptionPane.showMessageDialog(null,
                Kegs + " kegs equals "
                + liters + " liters.");

    }

    /**
     * The displayResults method displays a message showing the results of the
     * conversion.
     *
     * @param Kegs A number of kegs.
     * @param ounces A number of ounces.
     */
    
    //displays the number of ounces
    private static void displayResultsOunces(double Kegs, double ounces) {
        JOptionPane.showMessageDialog(null,
                Kegs + " kegs equals "
                + ounces + " ounces.");

    }

}
