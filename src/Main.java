public class Main {

    public static void main(String[] args) {

        // =======================
        // INT VARIABLES
        // =======================

        int intOperandA = 10;
        int intOperandB = 3;

        int intSum;
        int intProduct;
        int intDifference;
        int intQuotient;
        int intModulo;

        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);


        // =======================
        // DOUBLE VARIABLES
        // =======================

        double doubleOperandA = 10.0;
        double doubleOperandB = 3.0;

        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient;

        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);


        // =======================
        // MEANINGFUL VARIABLES
        // =======================

        double myLunchCost = 12.50;
        int numberOfKids = 3;
        boolean isRaining = false;
        double gasPrice = 3.49;
        int favoriteNumber = 7;
        double shoeSize = 10.5;
        int birthMonth = 8;
        String fullName = "David Oliver";

        System.out.println("The cost of my lunch is: $" + myLunchCost);
        System.out.println("My full name is: " + fullName);

    }
}
