/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test;

import com.rules.ProcessRule;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Ecologic
 */
public class MyCheck {
    
    
    
    public static void main(String arags[]){
    
        // Custom Operator :
        
        
        
            String err = "";
            String expressionText = "2.1234 >> 2";
            
		try {
			ProcessRule expression = new ProcessRule("2<1");
	                System.out.println(expression.eval().toString());
		} catch (ProcessRule.ExpressionException e) {
			err = e.getMessage();
		}

    
    
    
    }
    
    
    
}
