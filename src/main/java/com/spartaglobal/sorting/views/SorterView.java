package com.spartaglobal.sorting.views;

import java.util.*;

public class SorterView {

    /*
    NOTE: Going to have to add another input view for type of Object[] to be sorted
    + and another
     */

    // USER INPUT METHODS
    private Scanner scan = new Scanner(System.in);
    public String getSortTypeInput(LinkedHashMap<String, String> acceptableChoices) {
        String choice = "";
        boolean valid = false;
        while (!valid) {
            System.out.println(buildChoicesString(acceptableChoices, "sorting algorithm"));
            choice = scan.next();
            if (acceptableChoices.containsKey(choice.toLowerCase()))
                valid = true;
        }
        if (choice.equals("x")) {
            System.out.println("Program exiting - Thanks for sorting.");
            System.exit(0);
        }
        return choice;
    }

    public String getObjectTypeInput(LinkedHashMap<String, String> acceptableChoices) {
        String choice = "";
        boolean valid = false;
        while (!valid) {
            System.out.println(buildChoicesString(acceptableChoices, "object type"));
            choice = scan.next();
            if (acceptableChoices.containsKey(choice.toLowerCase()))
                valid = true;
        }
        if (choice.equals("x")) {
            System.out.println("Program exiting - Thanks for sorting.");
            System.exit(0);
        }
        return choice;
    }

    private String buildChoicesString(LinkedHashMap<String, String> acceptableChoices, String choiceType) {
        StringBuilder myString = new StringBuilder();
        myString.append("Please select a :").append(choiceType).append("\s");
        for (String choice : acceptableChoices.keySet()) {
            myString.append("\n -> ").append("'").append(choice).append("'").append(" for ")
                    .append(acceptableChoices.get(choice)).append("\s");
        }
        return myString.toString();
    }

    public int getArrayLengthInput() {
        // This also is handled using a while loop instead of exceptions handling
        int choice = 0;
        while (choice < 1 || choice > 10000) {
            System.out.println("Please enter the desired length of array to be sorted (1-10000): ");
            while (!scan.hasNextInt()) {
                scan.nextLine();
                System.out.println("Not a number, please try again: ");
                scan.nextLine();
            }
            choice = scan.nextInt();
        }
        return choice;
    }

    // DISPLAY METHODS
//    public void displayUnsortedArray(int[] arr) {
//        System.out.println("----Unsorted int[] array----");
//        printIntArray(arr);
//    }
//
//    public void displaySortedArray(int[] arr, long timeTaken) {
//        System.out.println("----Sorted int[] array----");
//        printIntArray(arr);
//        System.out.println("Time elapsed: " + timeTaken + "\n");
//    }
//
//    private static void printIntArray(int[] arr) {
//        for (int number : arr) {
//            System.out.print(number + ", ");
//        }
//        System.out.print("\n");
//    }

    public void displayUnsortedArray(Object[] arr) {
        System.out.println("----Unsorted int[] array----");
        printArray(arr);
    }

    public void displaySortedArray(Object[] arr, long timeTaken) {
        System.out.println("----Sorted int[] array----");
        printArray(arr);
        System.out.println("Time elapsed: " + timeTaken + "\n");
    }

    private static void printArray(Object[] arr) {
        for (Object obj : arr) {
            System.out.print(obj + ", ");
        }
        System.out.print("\n");
    }

    // EXPERIMENTAL
}
