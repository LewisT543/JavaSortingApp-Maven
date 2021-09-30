package com.spartaglobal.sorting.models;

import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CSVWriter {
    private static FileWriter fw;
    private static BufferedWriter bw;
    private static PrintWriter pw;

    // Implement singleton generator here

//    public static void createWriterObjects(String filepath) {
//        try {
//            fw = new FileWriter("results.csv", true);
//        } catch (IOException e) {
//            e.fillInStackTrace();
//        }
//        bw = new BufferedWriter(fw);
//        pw = new PrintWriter(bw);
//    }

    public void writeResultToFile(String description, long timeTaken) {
        try {
            fw = new FileWriter("results.csv", true);
        } catch (IOException e) {
            e.fillInStackTrace();
        }
        bw = new BufferedWriter(fw);
        pw = new PrintWriter(bw);
        int index = description.indexOf(":");
        String sortType = description.substring(0, index);
        String sizeString = description.substring(index + 6, description.indexOf(")"));
        String finString = sortType + "," + sizeString + "," + timeTaken;
        pw.println(finString);
        pw.flush();
        pw.close();
    }

    /*public void writeResultsToFile(LinkedHashMap<String, String> results, String filePath) {
        try {
            int i = 0;
            for(String result : results.keySet()) {
                int index = result.indexOf(":") + 5;
                String sortType = result.substring(0, index);
                String sizeString = result.substring(index, index + 2);
                String finString = i + "," + sortType + "," + sizeString + "," + results.get(result);
                pw.println(finString);
                pw.flush();
            }
            pw.close();
            JOptionPane.showMessageDialog(null, "Records Saved.");

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Records failed to save.");
            e.printStackTrace();
        }
    }*/

}
