package com.spartaglobal.sorting.models;

import org.apache.log4j.Logger;

import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CSVWriter {
    // Something smells funky about needing all 3 of these as private variables, should only need pw?
    private static FileWriter fw;
    private static BufferedWriter bw;
    private static PrintWriter pw;
    public void writeResultToFile(String description, long timeTaken, Logger logger) {
        try {
            fw = new FileWriter("results.csv", true);
        } catch (IOException e) {
            logger.error("Unable to connect to CSV.");
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
