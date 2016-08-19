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
public class MultiLimitTest {
 
    
    public static void main(String args[]){
    
         String inputNames[] = {"Length"};
         String RuleName = "SixtyRuleMulti";
         double inputValues[] = {580,89};
         double multiThreshold[] = {9,69};
         
        
        InputParameters inputs = new InputParameters();
        ComplianceLimit   limit = new ComplianceLimit();
        ComplianceOperators operators =  new ComplianceOperators();
        ComplianceResults complianceresults = new ComplianceResults();
        
        
        String Operator1 = operators.getOperator(1); // Lower Threshold less Than 
        String Operator2 = operators.getOperator(2);  // Greater than  Threshold 
        
        String Operators[] = {Operator1,Operator2};
        
        inputs.setInputParametersNames(inputNames);
        inputs.setMinimumNumberOfParameters(1);
        inputs.setInputParametersValues(inputValues);
        limit.setComplianceMultiThreshold(multiThreshold);

        limit.setDocumentation("It must be greater than ....60 >");
        
        
        RoofLimits rf = new RoofLimits();
        
        complianceresults = rf.CheckCompliance(RuleName, inputs, limit, Operators);
        
        
        
        System.out.println("The Complaince Input Parameters Were :"+complianceresults.getInputParamterNames()[0] );
        System.out.println("The Number of Results  are :"+complianceresults.getNumberOfElementsInResults() );    
        System.out.println("The Complaince Result is is :"+complianceresults.getResults()[0]);
        System.out.println("The Name of the Rule is  :"+complianceresults.getNameOfRule());
       
        
    
    }
    
    
}
