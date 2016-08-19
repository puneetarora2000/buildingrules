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
public class ComplianceLimit {
    
    double complianceSingleThreshold = 0;
    double complianceMultiThreshold[] = {};
    String Documentation = "No Documentation Available";

    public String getDocumentation() {
        return Documentation;
    }

    public void setDocumentation(String Documentation) {
        this.Documentation = Documentation;
    }
    

    public double getComplianceSingleThreshold() {
        return complianceSingleThreshold;
    }

    public void setComplianceSingleThreshold(double complianceSingleThreshold) {
        this.complianceSingleThreshold = complianceSingleThreshold;
    }

    public double[] getComplianceMultiThreshold() {
        return complianceMultiThreshold;
    }

    public void setComplianceMultiThreshold(double[] complianceMultiThreshold) {
        this.complianceMultiThreshold = complianceMultiThreshold;
    }
    
    
}
