/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rules;

/**
 *
 * @author Ecologic
 */
import ifc4javatoolbox.ifc4.ClassInterface;
import ifc4javatoolbox.ifc4.File_Description;
import ifc4javatoolbox.ifc4.File_Name;
import ifc4javatoolbox.ifc4.File_Schema;
import ifc4javatoolbox.ifc4.IfcBeam;
import ifc4javatoolbox.ifc4.IfcColumn;
import ifc4javatoolbox.ifc4.IfcFooting;
import ifc4javatoolbox.ifc4.IfcLabel;
import ifc4javatoolbox.ifc4.IfcProductRepresentation;
import ifc4javatoolbox.ifc4.IfcProject;
import ifc4javatoolbox.ifc4.IfcRepresentation;
import ifc4javatoolbox.ifc4.IfcSlab;
import ifc4javatoolbox.ifc4.IfcStair;
import ifc4javatoolbox.ifc4.IfcWall;
import ifc4javatoolbox.ifc4.LIST;
import ifc4javatoolbox.ifc4.STRING;
import ifc4javatoolbox.ifcmodel.IfcModel;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;

public class MyIfcParser {

    /**
          Common.msg("+++++++++++++++++++++");
     */
    
    private static void print(Collection c) {
    for (Object o : c) {
        System.out.println(o);
    }
}
    
    
    private static void printIfcCollectionObjectNames(Collection c) {
        Iterator i = c.iterator();
        while (i.hasNext()) {
            Object o = i.next();
            
     
            if (o instanceof IfcWall){
            
             try{
            
             System.out.println("Checking rules of Wall at:"+o.toString().split(" ")[0]+","+o.toString().split(" ")[1]);
             System.out.println();
                
             IfcWall ifcWall = (IfcWall) o;
             IfcProductRepresentation representation = ifcWall.getRepresentation();
             LIST<IfcRepresentation> representations = representation.getRepresentations();  
             print(representations);
            
             
             }catch(Exception e){
                 System.out.println(e.getMessage());
             }
             
             
            
            
            }
        
            if (o instanceof IfcStair){
             System.out.println("Checking rules of Stair at:"+o.toString().split(" ")[0]+","+o.toString().split(" ")[1]);
              
             try{
            
          
                
             IfcStair ifcStair = (IfcStair) o;
             IfcProductRepresentation representation = ifcStair.getRepresentation();
             LIST<IfcRepresentation> representations = representation.getRepresentations();  
             print(representations);
            
             
             }catch(Exception e){
                 System.out.println(e.getMessage());
             }
             
             
            }
            
            if (o instanceof IfcFooting){
             System.out.println("Checking rules of Footing at:"+o.toString().split(" ")[0]+","+o.toString().split(" ")[1]);
              
             try{
            
             
                
             IfcFooting ifcFooting = (IfcFooting) o;
             IfcProductRepresentation representation = ifcFooting.getRepresentation();
             LIST<IfcRepresentation> representations = representation.getRepresentations();  
             print(representations);
            
             
             }catch(Exception e){
                 System.out.println(e.getMessage());
             }
            }
            
            if (o instanceof IfcBeam){
             System.out.println("Checking rules of Beam at:"+o.toString().split(" ")[0]+","+o.toString().split(" ")[1]);
             
             try{
            
          
             IfcBeam ifcBeam = (IfcBeam) o;
             IfcProductRepresentation representation = ifcBeam.getRepresentation();
             LIST<IfcRepresentation> representations = representation.getRepresentations();  
             print(representations);
                 
                 
                 System.out.println("Beam Description :"+"");
            
             
             }catch(Exception e){
                 System.out.println(e.getMessage());
             }
            }
            
            
            if (o instanceof IfcColumn){
             System.out.println("Checking rules of Column at:"+o.toString().split(" ")[0]+","+o.toString().split(" ")[1]);
              try{
             IfcColumn ifcColumn = (IfcColumn) o;
             IfcProductRepresentation representation = ifcColumn.getRepresentation();
             LIST<IfcRepresentation> representations = representation.getRepresentations();  
             print(representations);
            
             
             }catch(Exception e){
                 System.out.println(e.getMessage());
             }
            }
            
        }
    }

    public String getProjectName(String FilePath) {

        String ProjectName = "";

        IfcModel ifcModel = new IfcModel();
        /*
        To to done later on for report ing 
        **/
        
       
      
        try {

            File stepFile = new File(FilePath);
            ifcModel.readStepFile(stepFile);
            
             File_Description description = ifcModel.getFile_Description();
        File_Name fileName = ifcModel.getFile_Name();
        STRING authorization = fileName.getauthorization();
        STRING names = fileName.getname();
        File_Schema schema = ifcModel.getFile_Schema();

            IfcProject ifcProject = ifcModel.getIfcProject();
            
            if(ifcProject.getName()!=null){
                IfcLabel name = ifcProject.getName();
                String n = name.getDecodedValue();
                System.out.println("Name of the Project is :"+n+"   ," +name.toString());
            }
            
            
            Collection<ClassInterface> ifcObjects = ifcModel.getIfcObjects();

            Collection<IfcWall> ifcWalls = ifcModel.getCollection(IfcWall.class) ;
            Collection<IfcStair> ifcStairs = ifcModel.getCollection(IfcStair.class) ;
            Collection<IfcSlab> ifcIfcSlabs = ifcModel.getCollection(IfcSlab.class) ;
            Collection<IfcBeam> ifcBeams = ifcModel.getCollection(IfcBeam.class) ;
            Collection<IfcFooting > ifcFootings = ifcModel.getCollection(IfcFooting.class) ;
            Collection<IfcColumn> ifcColumns = ifcModel.getCollection(IfcColumn.class) ;
            
            Common.msg("Walls");
            printIfcCollectionObjectNames(ifcWalls);
            Common.msg("+++++++++++++++++++++");
            Common.msg("Stairs");
            printIfcCollectionObjectNames(ifcStairs);
            Common.msg("+++++++++++++++++++++");
            Common.msg("Beams");
            printIfcCollectionObjectNames(ifcBeams);
            Common.msg("+++++++++++++++++++++");
            Common.msg("Footings");
            printIfcCollectionObjectNames(ifcFootings);
            Common.msg("+++++++++++++++++++++");
            Common.msg("Columns");
            printIfcCollectionObjectNames(ifcColumns);
            Common.msg("+++++++++++++++++++++");
            
            
            
            
            
            
            //ProjectName =  (ProjectObject.getLongName().toString().length()>0 ? ProjectObject.getLongName().toString() : "No ProjectName") ;
            //  ProjectName = ProjectObject.getDescription().toString();
        } catch (Exception e) {

            System.out.println(e.getMessage());

        }

        return ProjectName;

    }

}
