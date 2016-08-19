/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package limit.theory;

import com.rules.ProcessRule;

/**
 *
 * @author Ecologic
 */
public class test {
 
    
    public static void main(String args[]){
    
        try{
        
         String Rule4Evaluation = "50.0<60.0";   
            
         ProcessRule pr = new ProcessRule(Rule4Evaluation);
         System.out.println(pr.eval().toString());
        
        }catch(Exception e){
        
            System.out.println(e.getMessage());
        
        }
    
    
    }
    
    
}
