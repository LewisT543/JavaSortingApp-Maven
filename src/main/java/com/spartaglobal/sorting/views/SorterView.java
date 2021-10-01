package com.spartaglobal.sorting.views;

import com.spartaglobal.sorting.models.CSVWriter;

import java.util.*;

public class SorterView {
    private Scanner scan = new Scanner(System.in);
    public String getSortTypeInput(LinkedHashMap<String, String> acceptableChoices) {
        // This is currently handled with a while loop but could be done with exception handling
        String choice = "";
        boolean valid = false;
        while (!valid) {
            System.out.println(buildChoicesString(acceptableChoices));
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

    private String buildChoicesString(LinkedHashMap<String, String> acceptableChoices) {
        StringBuilder myString = new StringBuilder();
        myString.append("Enter a choice of sorting algorithm:\s");
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
            System.out.println("Please enter the desired length of array (1-10000): ");
            while (!scan.hasNextInt()) {
                scan.nextLine();
                System.out.println("Not a number, try again: ");
                scan.nextLine();
            }
            choice = scan.nextInt();
        }
        return choice;
    }

    public void displayUnsortedArray(int[] arr) {
        System.out.println("----Unsorted int[] array----");
        printIntArray(arr);
    }

    public void displaySortedArray(int[] arr, long timeTaken) {
        System.out.println("----Sorted int[] array----");
        printIntArray(arr);
        System.out.println("Time elapsed: " + timeTaken + "\n");
    }

    private static void printIntArray(int[] arr) {
        for (int number : arr) {
            System.out.print(number + ", ");
        }
        System.out.print("\n");
    }
}
