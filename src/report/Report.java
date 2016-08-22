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

import java.io.File;
import java.sql.Connection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.data.JRCsvDataSource;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXhtmlExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.export.oasis.JROdsExporter;
import net.sf.jasperreports.engine.export.oasis.JROdtExporter;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.engine.export.ooxml.JRPptxExporter;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.engine.util.AbstractSampleApp;
import net.sf.jasperreports.engine.util.JRLoader;

public class Report {
    
    
    public static void fill() throws JRException
  {
    long start = System.currentTimeMillis();
    //Preparing parameters
    Map parameters = new HashMap();
    parameters.put("ReportTitle", "Address Report");
    parameters.put("DataFile", "CsvDataSource.txt - CSV data source");
    Set states = new HashSet();
    states.add("Active");
    states.add("Trial");
    parameters.put("IncludedStates", states);

    JasperFillManager.fillReportToFile("build/reports/CsvDataSourceReport.jasper", parameters, getDataSource());
    System.err.println("Filling time : " + (System.currentTimeMillis() - start));
  }

   private static JRCsvDataSource getDataSource() throws JRException
  {
    String[] columnNames = new String[]{"city", "id", "name", "address", "state"};
    JRCsvDataSource ds = new JRCsvDataSource(JRLoader.getLocationInputStream("data/CsvDataSource.txt"));
    ds.setRecordDelimiter("\r\n");
    ds.setColumnNames(columnNames);
    return ds;
  }
    
    public static void main(String args[]){
        try {
            fill();
        } catch (JRException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
}
