/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package report;

/**
 *
 * @author Ecologic
 */
public class ReportColumnAndValuePair {

    public String getColumnName() {
        return ColumnName;
    }

    public void setColumnName(String ColumnName) {
        this.ColumnName = ColumnName;
    }

    public String getColumnValue() {
        return ColumnValue;
    }

    public void setColumnValue(String ColumnValue) {
        this.ColumnValue = ColumnValue;
    }
 
  public String ColumnName;
   public String ColumnValue;
  //accessors

    public ReportColumnAndValuePair(String ColumnName, String  ColumnValue) {
        this.ColumnValue = ColumnValue;
        this.ColumnName = ColumnName;
    }
}