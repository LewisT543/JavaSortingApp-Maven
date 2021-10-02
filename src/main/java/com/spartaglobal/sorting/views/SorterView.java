package com.spartaglobal.sorting.views;

import java.util.*;

public class SorterView {
    // USER INPUT METHODS
    private Scanner scan = new Scanner(System.in);
    public void printWelcomeBanner() {
        System.out.println("+----------- WELCOME -----------+");
        System.out.println("| Thanks for using my sort app. |");
        System.out.println("| NOTE:                         |");
        System.out.println("|    -> Rectangles are sorted   |");
        System.out.println("|       by AREA.                |");
        System.out.println("|    -> People are sorted by    |");
        System.out.println("|       NAME, alphabetically    |");
        System.out.println("+-------------------------------+");
    }

    public String getInput(LinkedHashMap<String, String> acceptableChoices, String message) {
        String choice = "";
        boolean valid = false;
        while (!valid) {
            System.out.println(buildChoicesString(acceptableChoices, message));
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
        myString.append("Please select ").append(choiceType).append(":\s");
        for (String choice : acceptableChoices.keySet()) {
            myString.append("\n -> ").append("'").append(choice).append("'").append(" for ")
                    .append(acceptableChoices.get(choice)).append("\s");
        }
        return myString.toString();
    }

    public int getArrayLengthInput() {
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

    public <E> void displayUnsortedObjArray(E[] arr) {
        System.out.println("----Unsorted Object[] array----");
        printObjArray(arr);
    }

    public <E> void displaySortedObjArray(E[] arr, long timeTaken) {
        System.out.println("----Sorted Object[] array----");
        printObjArray(arr);
        System.out.println("Time elapsed: " + timeTaken + "\n");
    }

    private static <E> void printObjArray(E[] arr) {
        for (E obj : arr) {
            System.out.print(obj + ", ");
        }
        System.out.print("\n");
    }
}
