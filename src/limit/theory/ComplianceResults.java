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
public class ComplianceResults {

    private String NameOfRule = "Rule";
    private String InputParamterNames[]; 
    private String results[] =  {"0"};

    public String[] getInputParamterNames() {
        return InputParamterNames;
    }

    public void setInputParamterNames(String[] InputParamterNames) {
        this.InputParamterNames = InputParamterNames;
    }
    private int NumberOfElementsInResults = 0;
    

    public String[] getResults() {
        return results;
    }

    public void setResults(String[] results) {
        this.results = results;
    }

    public String getNameOfRule() {
        return NameOfRule;
    }

    public void setNameOfRule(String NameOfRule) {
        this.NameOfRule = NameOfRule;
    }

    public int getNumberOfElementsInResults() {
        return NumberOfElementsInResults;
    }

    public void setNumberOfElementsInResults(int NumberOfElementsInResults) {
        this.NumberOfElementsInResults = NumberOfElementsInResults;
    }

}
