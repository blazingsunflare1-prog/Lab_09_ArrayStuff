import java.util.Scanner;
public class SafeInput {
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = ""; // Set this to zero length. Loop runs until it isn't
        do {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;

    }

    public static int getInt(Scanner pipe, String prompt) {
        int retInt = 0;

        boolean done = false;

        while (!done) {
            System.out.print(prompt);


            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                done = true;
            } else {
                String trash = pipe.next();

                System.out.println("You must enter a valid input, not: " + trash);
            }
            pipe.nextLine();


        }

        return retInt;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double retDouble = 0.0;

        boolean done = false;

        while (!done) {
            System.out.print(prompt);


            if (pipe.hasNextDouble()) {
                retDouble = pipe.nextDouble();
                done = true;
            } else {
                String trash = pipe.next();

                System.out.println("You must enter a valid input, not: " + trash);
            }
            pipe.nextLine();


        }

        return retDouble;
    }

    public static int getRangedInt(Scanner pipe, String prompt) {
        int rangInt = 0;
        int low = 0;
        int high = 100;

        boolean done = false;

        while (!done) {
            System.out.print(prompt);


            if (pipe.hasNextInt()) {
                rangInt = pipe.nextInt();
                if (rangInt >= low && rangInt <= high) {
                    done = true;
                } else {
                    System.out.println("Your value is not in range");
                }

            } else {
                String trash = pipe.next();

                System.out.println("You must enter a valid input, not: " + trash);
            }
            pipe.nextLine();


        }

        return rangInt;
    }

    public static double getRangedDouble(Scanner pipe, String prompt) {
        double rangdub = 0.0;
        double low = 0.0;
        double high = 100.0;

        boolean done = false;

        while (!done) {
            System.out.print(prompt);


            if (pipe.hasNextDouble()) {
                rangdub = pipe.nextDouble();
                if (rangdub >= low && rangdub <= high) {
                    done = true;
                } else {
                    System.out.println("Your value is not in range");
                }

            } else {
                String trash = pipe.next();

                System.out.println("You must enter a valid input, not: " + trash);
            }
            pipe.nextLine();


        }

        return rangdub;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        boolean yn = false;
        String ask = "";

        while (!yn) {

            System.out.print(prompt);
            ask = pipe.nextLine();

            if (ask.equalsIgnoreCase("Y") || ask.equalsIgnoreCase("N")) {
                yn = true;
                return ask.equalsIgnoreCase("Y");
            } else {
                System.out.println("You must enter a valid input, not: " + ask);
            }
        }

        return false;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String input;
        boolean valid = false;


        while (!valid) {
            System.out.print(prompt);
            input = pipe.nextLine().trim();


            if (input.matches(regEx)) {
                return input;
            } else {
                System.out.println("Invalid input: " + input + " Please enter a value that matches the required pattern.");
            }
        }

        return "";
    }

    public static String PrettyHeader(Scanner pipe, String msg) {

        msg = pipe.nextLine();

        for (int h = 1; h <= 60; h++) {
            System.out.print("*");

        }
        System.out.println();


        System.out.println("***                          " + msg + "                        ***");
        for (int h = 1; h <= 60; h++) {
            System.out.print("*");
        }
        return "";
    }

    public static double getAverage(int values[]) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return (double) sum / values.length;
    }
}

