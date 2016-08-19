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
public interface  LimitsInterface {
    
    
   public ComplianceResults   CheckCompliance(String RuleName,InputParameters inputparameters,ComplianceLimit compliancelimit,  String Operators[]);
   public String ValidateCompliance(String Returnvalues);
    
    
}
