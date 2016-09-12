/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rules;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Ecologic
 */
class RuleModel extends AbstractTableModel {

    private static final long serialVersionUID = 1L;
    //private final String[] columnNames = {"RuleInputsVariableID","ruleset_id","RuleID","FORMULA","StructureElementID,DataType,Ifc_Structure_Attribute,IS456_Structure_Attribute_Name,InputsVariableDocumentation,OutputVariable,Operator,ruleConstant,created_at,updated_at,ApplyOnProjectNameID","ruleThresholds","freezedFormula","RuleName","RuleSetName","StructureAttributesName","StructureElementName"};
    
    private final String[] columnNames = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};
    
    private ArrayList<String[]> Data = new ArrayList<>();

    public void AddCSVData(ArrayList<String[]> DataIn) {
        this.Data = DataIn;
        this.fireTableDataChanged();
    }

    @Override
    public int getColumnCount() {
        //System.out.println("ColumnsLenght:"+columnNames.length);
        return columnNames.length;// length;
    }

    @Override
    public int getRowCount() {
          //System.out.println("Rows:"+Data.size());
        return Data.size();
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public Object getValueAt(int row, int col) {
        
       
        return Data.get(row)[col];
    }
}
