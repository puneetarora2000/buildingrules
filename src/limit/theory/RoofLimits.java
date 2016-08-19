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
public class RoofLimits 
    implements LimitsInterface
{

    /*
    L=5.79119m, b=0.4572m, h=.6096m
    
    */
    
    @Override
    public ComplianceResults CheckCompliance(String RuleName,InputParameters inputparameters,ComplianceLimit compliancelimit,String operator[]) {
            
        
            String results[] = {"0"};
           
        ComplianceResults complianceResults = new ComplianceResults();
         
         double inputsValues[] = inputparameters.getInputParametersValues();
         String names[] =  inputparameters.getInputParametersNames();
      
       
         double thresholdValue = compliancelimit.getComplianceSingleThreshold();
         //String operator = op.getOperator(2);
         
         String answer ="";
         
         
         if(inputsValues.length==inputparameters.getMinimumNumberOfParameters()){
                    
           String RuleString1 =   (inputsValues[0]+operator[0]+thresholdValue).trim()  ;
          // String RuleString2 =   (inputsValues[1]+operator[1]+thresholdValue).trim()  ;
           
           String RuleString = "";
           
           try{
           
              answer = ValidateCompliance( new com.rules.ProcessRule(RuleString1).eval().toString());
              
           }catch(Exception e){
           
           
           System.out.println(e.getMessage());
           
           }
         }
         
         results[0] = answer;
         
         
         complianceResults.setInputParamterNames(names);
         complianceResults.setNameOfRule(RuleName.trim());
         complianceResults.setNumberOfElementsInResults(results.length);
         complianceResults.setResults(results);
        
            return complianceResults;
    }

    @Override
    public String ValidateCompliance(String Returnvalues) {
      
        String rtnString = "";
        
        if (Returnvalues.equals("1")){
        
            rtnString = "Compliance Followed";
        }else{
        
         rtnString = "Compliance Not Followed";
        
        }
        
       
        return rtnString;
      
        
        
        
        // ComplianceFlag        
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
