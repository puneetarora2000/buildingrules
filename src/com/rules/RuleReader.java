/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rules;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Ecologic
 */
public class RuleReader {
        private final ArrayList<String[]> Rs = new ArrayList<>();
        private String[] OneRow;

        public ArrayList<String[]> ReadCSVfile(File DataFile) {
            try {
                BufferedReader brd = new BufferedReader(new FileReader(DataFile));
                while (brd.ready()) {
                    String st = brd.readLine();
                    OneRow = st.split(",|\\s|;");
                    Rs.add(OneRow);
                    System.out.println(Arrays.toString(OneRow));
                } // end of while
            } // end of try
            catch (IOException e) {
                String errmsg = e.getMessage();
                System.out.println("Why the File is not found:" + errmsg);
            } // end of Catch
            return Rs;
        }// end of ReadFile method
    }// end of RuleReader cla
