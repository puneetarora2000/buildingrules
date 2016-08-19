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
public class InputParameters {
    
    private int MinimumNumberOfParameters = 1;
    private String inputParametersNames[] = {};
    private double inputParametersValues[] = {};

    public int getMinimumNumberOfParameters() {
        return MinimumNumberOfParameters;
    }

    public void setMinimumNumberOfParameters(int MinimumNumberOfParameters) {
        this.MinimumNumberOfParameters = MinimumNumberOfParameters;
    }

    public String[] getInputParametersNames() {
        return inputParametersNames;
    }

    public void setInputParametersNames(String[] inputParametersNames) {
        this.inputParametersNames = inputParametersNames;
    }

    public double[] getInputParametersValues() {
        return inputParametersValues;
    }

    public void setInputParametersValues(double[] inputParametersValues) {
        this.inputParametersValues = inputParametersValues;
    }

    

    
    
}
