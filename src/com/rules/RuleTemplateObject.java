/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.rules;

import java.io.Serializable;

/**
 *
 * @author Ecologic
 */
public class RuleTemplateObject implements Serializable {
    private static long serialVersionUID = 1L;

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }
    
    private String RuleInputsVariableID;
    private String ruleset_id;
    private String RuleID;
    private String FORMULA;
    private String StructureElementID;
    private String DataType;
    private String Ifc_Structure_Attribute;
    private String IS456_Structure_Attribute_Name;
    private String InputsVariableDocumentation;
    private String OutputVariable;
    private String Operator;
    private String ruleConstant;
    private String created_at;
    private String updated_at;
    private String ApplyOnProjectNameID;
    private String ruleThresholds;
    private String freezedFormula;
    private String RuleName;
    private String RuleSetName;
    private String StructureAttributesName;
    private String StructureElementName = "";

    /**
     * @return the RuleInputsVariableID
     */
    public String getRuleInputsVariableID() {
        return RuleInputsVariableID;
    }

    /**
     * @param RuleInputsVariableID the RuleInputsVariableID to set
     */
    public void setRuleInputsVariableID(String RuleInputsVariableID) {
        this.RuleInputsVariableID = RuleInputsVariableID;
    }

    /**
     * @return the ruleset_id
     */
    public String getRuleset_id() {
        return ruleset_id;
    }

    /**
     * @param ruleset_id the ruleset_id to set
     */
    public void setRuleset_id(String ruleset_id) {
        this.ruleset_id = ruleset_id;
    }

    /**
     * @return the RuleID
     */
    public String getRuleID() {
        return RuleID;
    }

    /**
     * @param RuleID the RuleID to set
     */
    public void setRuleID(String RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * @return the FORMULA
     */
    public String getFORMULA() {
        return FORMULA;
    }

    /**
     * @param FORMULA the FORMULA to set
     */
    public void setFORMULA(String FORMULA) {
        this.FORMULA = FORMULA;
    }

    /**
     * @return the StructureElementID
     */
    public String getStructureElementID() {
        return StructureElementID;
    }

    /**
     * @param StructureElementID the StructureElementID to set
     */
    public void setStructureElementID(String StructureElementID) {
        this.StructureElementID = StructureElementID;
    }

    /**
     * @return the DataType
     */
    public String getDataType() {
        return DataType;
    }

    /**
     * @param DataType the DataType to set
     */
    public void setDataType(String DataType) {
        this.DataType = DataType;
    }

    /**
     * @return the Ifc_Structure_Attribute
     */
    public String getIfc_Structure_Attribute() {
        return Ifc_Structure_Attribute;
    }

    /**
     * @param Ifc_Structure_Attribute the Ifc_Structure_Attribute to set
     */
    public void setIfc_Structure_Attribute(String Ifc_Structure_Attribute) {
        this.Ifc_Structure_Attribute = Ifc_Structure_Attribute;
    }

    /**
     * @return the IS456_Structure_Attribute_Name
     */
    public String getIS456_Structure_Attribute_Name() {
        return IS456_Structure_Attribute_Name;
    }

    /**
     * @param IS456_Structure_Attribute_Name the IS456_Structure_Attribute_Name to set
     */
    public void setIS456_Structure_Attribute_Name(String IS456_Structure_Attribute_Name) {
        this.IS456_Structure_Attribute_Name = IS456_Structure_Attribute_Name;
    }

    /**
     * @return the InputsVariableDocumentation
     */
    public String getInputsVariableDocumentation() {
        return InputsVariableDocumentation;
    }

    /**
     * @param InputsVariableDocumentation the InputsVariableDocumentation to set
     */
    public void setInputsVariableDocumentation(String InputsVariableDocumentation) {
        this.InputsVariableDocumentation = InputsVariableDocumentation;
    }

    /**
     * @return the OutputVariable
     */
    public String getOutputVariable() {
        return OutputVariable;
    }

    /**
     * @param OutputVariable the OutputVariable to set
     */
    public void setOutputVariable(String OutputVariable) {
        this.OutputVariable = OutputVariable;
    }

    /**
     * @return the Operator
     */
    public String getOperator() {
        return Operator;
    }

    /**
     * @param Operator the Operator to set
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * @return the ruleConstant
     */
    public String getRuleConstant() {
        return ruleConstant;
    }

    /**
     * @param ruleConstant the ruleConstant to set
     */
    public void setRuleConstant(String ruleConstant) {
        this.ruleConstant = ruleConstant;
    }

    /**
     * @return the created_at
     */
    public String getCreated_at() {
        return created_at;
    }

    /**
     * @param created_at the created_at to set
     */
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    /**
     * @return the updated_at
     */
    public String getUpdated_at() {
        return updated_at;
    }

    /**
     * @param updated_at the updated_at to set
     */
    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    /**
     * @return the ApplyOnProjectNameID
     */
    public String getApplyOnProjectNameID() {
        return ApplyOnProjectNameID;
    }

    /**
     * @param ApplyOnProjectNameID the ApplyOnProjectNameID to set
     */
    public void setApplyOnProjectNameID(String ApplyOnProjectNameID) {
        this.ApplyOnProjectNameID = ApplyOnProjectNameID;
    }

    /**
     * @return the ruleThresholds
     */
    public String getRuleThresholds() {
        return ruleThresholds;
    }

    /**
     * @param ruleThresholds the ruleThresholds to set
     */
    public void setRuleThresholds(String ruleThresholds) {
        this.ruleThresholds = ruleThresholds;
    }

    /**
     * @return the freezedFormula
     */
    public String getFreezedFormula() {
        return freezedFormula;
    }

    /**
     * @param freezedFormula the freezedFormula to set
     */
    public void setFreezedFormula(String freezedFormula) {
        this.freezedFormula = freezedFormula;
    }

    /**
     * @return the RuleName
     */
    public String getRuleName() {
        return RuleName;
    }

    /**
     * @param RuleName the RuleName to set
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * @return the RuleSetName
     */
    public String getRuleSetName() {
        return RuleSetName;
    }

    /**
     * @param RuleSetName the RuleSetName to set
     */
    public void setRuleSetName(String RuleSetName) {
        this.RuleSetName = RuleSetName;
    }

    /**
     * @return the StructureAttributesName
     */
    public String getStructureAttributesName() {
        return StructureAttributesName;
    }

    /**
     * @param StructureAttributesName the StructureAttributesName to set
     */
    public void setStructureAttributesName(String StructureAttributesName) {
        this.StructureAttributesName = StructureAttributesName;
    }

    /**
     * @return the StructureElementName
     */
    public String getStructureElementName() {
        return StructureElementName;
    }

    /**
     * @param StructureElementName the StructureElementName to set
     */
    public void setStructureElementName(String StructureElementName) {
        this.StructureElementName = StructureElementName;
    }
    
    @Override
     public String toString() {
        return "Student[name = " + StructureElementName + ", age = " + StructureElementName + ", hobby = " + StructureElementName + "]";
    }
    
    
    
}
