/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package limit.theory;

/**
 *
 * @author Ecologic
 */
public class SingleLimitTest {
 
    
    public static void main(String args[]){
    
         String inputNames[] = {"Length"};
         String RuleName = "SixtyRule";
         double inputValues[] = {50};
         
        InputParameters inputs = new InputParameters();
        ComplianceLimit   limit = new ComplianceLimit();
        ComplianceOperators operators =  new ComplianceOperators();
        ComplianceResults complianceresults = new ComplianceResults();
       
        String Operators[] = {operators.getOperator(2)};  
        
        inputs.setInputParametersNames(inputNames);
        inputs.setMinimumNumberOfParameters(1);
        inputs.setInputParametersValues(inputValues);
        limit.complianceSingleThreshold = 60;
        limit.setDocumentation("It must be greater than ....60 >");
        
        
        RoofLimits rf = new RoofLimits();
        
        complianceresults = rf.CheckCompliance(RuleName, inputs, limit,Operators);
        
        
        
        System.out.println("The Complaince Input Parameters Were :"+complianceresults.getInputParamterNames()[0] );
        System.out.println("The Number of Results  are :"+complianceresults.getNumberOfElementsInResults() );    
        System.out.println("The Complaince Result is is :"+complianceresults.getResults()[0]);
        System.out.println("The Name of the Rule is  :"+complianceresults.getNameOfRule());
       
        
    
    }
    
    
}
