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
 *  This is basic class made to read typical any csv file . ..in our case 
 *  the rules are made from the web based application called rule engine 
 *  when for a project rules are complete the , there is facility to export these rules 
 *  this exported rules are imported or read here using this class function calls .
 * @author Ecologic
 */
public class RuleReader {
        private final ArrayList<String[]> Rs = new ArrayList<>();
        private String[] OneRow;

        
        
        
        public ArrayList<String[]> ReadCSVfile(File DataFile) {
            try {
                
                System.out.println(DataFile.getAbsoluteFile());
                
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
