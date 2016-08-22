/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package report;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Ecologic
 */
public class ReportTemplate {

    public ReportTemplate() {
    }

    public String getReportFileName() {
        
       String mProjectName =  ProjectName;
       String mBuildingName =  BuildingName;
       String mSiteName   = SiteName;
       String mReportDate = ReportDate;
       
       
        ReportFileName = mProjectName+"_"+mBuildingName+"_"+mSiteName;
        return ReportFileName+".html".trim();
    }

    

    /**
     *
     */
    
    public String ReportFileName = ""; 
    
    public String ReportTitle = "Building Compilance Report";
    public String ReportPreparedBy = "Randinder";
    public String Module = "Structure Analysis ";
    public String BuildingName = "Building Name";
    public String ProjectName = "Project Name";
    public String SiteName = "Project Site Name";
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    Date date = new Date();
    public String ReportDate =  dateFormat.format(date);
    public static String ReportSeparator = "**********************************************";

    public String FootingsReportTitle = "";
    public String SlabReportTitle = "";
    public String ColumnsReportTitle = "";
    public String StairsReportTitle = "";
    public String WallReportTitle = "";
    
    
    public int NoofWallUnits = 1;
    public int NoofSlabsUnits = 1;
    public int NoofStairsUnits = 1;
    public int NoofFootingsUnits = 1;
    public int NoofColumnsUnits = 1;
    
    public int WallReference = 1;
    public int SlabReference = 1;
    public int ColumnsReference = 1;
    public int FootingsReference = 1;
    public int StairsReference = 1;

    List<ReportColumnAndValuePair> Walllist = new ArrayList<ReportColumnAndValuePair>(); 
    List<ReportColumnAndValuePair> Slablist = new ArrayList<ReportColumnAndValuePair>(); 
  
    List<ReportColumnAndValuePair> Stairlist = new ArrayList<ReportColumnAndValuePair>(); 
    
    List<ReportColumnAndValuePair> Columnslist = new ArrayList<>(); 
    List<ReportColumnAndValuePair> Footinglist = new ArrayList<>(); 

    public List<ReportColumnAndValuePair> getWalllist() {
        return Walllist;
    }

    public void setWalllist(List<ReportColumnAndValuePair> Walllist) {
        this.Walllist = Walllist;
    }

    public List<ReportColumnAndValuePair> getSlablist() {
        return Slablist;
    }

    public void setSlablist(List<ReportColumnAndValuePair> Slablist) {
        this.Slablist = Slablist;
    }

    public List<ReportColumnAndValuePair> getStairlist() {
        return Stairlist;
    }

    public void setStairlist(List<ReportColumnAndValuePair> Stairlist) {
        this.Stairlist = Stairlist;
    }

    public List<ReportColumnAndValuePair> getColumnslist() {
        return Columnslist;
    }

    public void setColumnslist(List<ReportColumnAndValuePair> Columnslist) {
        this.Columnslist = Columnslist;
    }

    public List<ReportColumnAndValuePair> getFootinglist() {
        return Footinglist;
    }

    public void setFootinglist(List<ReportColumnAndValuePair> Footinglist) {
        this.Footinglist = Footinglist;
    }
    
    
    
    
    public String getFootingsReportTitle() {
    
            
        return FootingsReportTitle;
    }

    public void setFootingsReportTitle(String FootingsReportTitle) {
        this.FootingsReportTitle = FootingsReportTitle;
    }

    public String getSlabReportTitle() {
        return SlabReportTitle;
    }

    public void setSlabReportTitle(String SlabReportTitle) {
        this.SlabReportTitle = SlabReportTitle;
    }

    public String getColumnsReportTitle() {
        return ColumnsReportTitle;
    }

    public void setColumnsReportTitle(String ColumnsReportTitle) {
        this.ColumnsReportTitle = ColumnsReportTitle;
    }

    public String getStairsReportTitle() {
        return StairsReportTitle;
    }

    public void setStairsReportTitle(String StairsReportTitle) {
        this.StairsReportTitle = StairsReportTitle;
    }

    public String getWallReportTitle() {
        return WallReportTitle;
    }

    public void setWallReportTitle(String WallReportTitle) {
        this.WallReportTitle = WallReportTitle;
    }

    public int getNoofWallUnits() {
        return NoofWallUnits;
    }

    public void setNoofWallUnits(int NoofWallUnits) {
        this.NoofWallUnits = NoofWallUnits;
    }

    public int getNoofSlabsUnits() {
        return NoofSlabsUnits;
    }

    public void setNoofSlabsUnits(int NoofSlabsUnits) {
        this.NoofSlabsUnits = NoofSlabsUnits;
    }

    public int getNoofStairsUnits() {
        return NoofStairsUnits;
    }

    public void setNoofStairsUnits(int NoofStairsUnits) {
        this.NoofStairsUnits = NoofStairsUnits;
    }

    public int getNoofFootingsUnits() {
        return NoofFootingsUnits;
    }

    public void setNoofFootingsUnits(int NoofFootingsUnits) {
        this.NoofFootingsUnits = NoofFootingsUnits;
    }

    public int getNoofColumnsUnits() {
        return NoofColumnsUnits;
    }

    public void setNoofColumnsUnits(int NoofColumnsUnits) {
        this.NoofColumnsUnits = NoofColumnsUnits;
    }

    public int getWallReference() {
        return WallReference;
    }

    public void setWallReference(int WallReference) {
        this.WallReference = WallReference;
    }

    public int getSlabReference() {
        return SlabReference;
    }

    public void setSlabReference(int SlabReference) {
        this.SlabReference = SlabReference;
    }

    public int getColumnsReference() {
        return ColumnsReference;
    }

    public void setColumnsReference(int ColumnsReference) {
        this.ColumnsReference = ColumnsReference;
    }

    public int getFootingsReference() {
        return FootingsReference;
    }

    public void setFootingsReference(int FootingsReference) {
        this.FootingsReference = FootingsReference;
    }

    public int getStairsReference() {
        return StairsReference;
    }

    public void setStairsReference(int StairsReference) {
        this.StairsReference = StairsReference;
    }
    
    
    
    
    
    public static String getReportSeparator() {
        return ReportSeparator;
    }

    public static void setReportSeparator(String ReportSeparator) {
        ReportTemplate.ReportSeparator = ReportSeparator;
    }
    
    
    
    
    
    public String getReportDate() {
        return ReportDate;
    }

    public void setReportDate(String ReportDate) {
        this.ReportDate = ReportDate;
    }
    

    

    public String getReportPreparedBy() {
        return ReportPreparedBy;
    }

    public void setReportPreparedBy(String ReportPreparedBy) {
        this.ReportPreparedBy = ReportPreparedBy;
    }

    public String getModule() {
        return Module;
    }

    public void setModule(String Module) {
        this.Module = Module;
    }

    public String getBuildingName() {
        return BuildingName;
    }

    public void setBuildingName(String BuildingName) {
        this.BuildingName = BuildingName;
    }

    public String getProjectName() {
        return ProjectName;
    }

    public void setProjectName(String ProjectName) {
        this.ProjectName = ProjectName;
    }

    public String getSiteName() {
        return SiteName;
    }

    public void setSiteName(String SiteName) {
        this.SiteName = SiteName;
    }
    
    
 
        
        

    /**
     * Get the value of ReportTitle
     *
     * @return the value of ReportTitle
     */
    public String getReportTitle() {
        return ReportTitle;
    }

    /**
     * Set the value of ReportTitle
     *
     * @param ReportTitle new value of ReportTitle
     */
    public void setReportTitle(String ReportTitle) {
        this.ReportTitle = ReportTitle;
    }

    
  
    
    
    
}
