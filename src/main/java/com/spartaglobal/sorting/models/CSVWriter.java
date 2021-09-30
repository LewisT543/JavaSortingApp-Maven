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
}
