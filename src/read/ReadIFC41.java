package read;

import ifc4javatoolbox.ifc4.IfcAreaMeasure;
import ifc4javatoolbox.ifc4.IfcLabel;
import ifc4javatoolbox.ifc4.IfcPositiveLengthMeasure;
import ifc4javatoolbox.ifc4.IfcReinforcingBar;
import ifc4javatoolbox.ifc4.IfcWall;
import ifc4javatoolbox.ifcmodel.IfcModel;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ecologic
 */
public class ReadIFC41 {

    public static void main(String args[]) {

        IfcModel ifc = new IfcModel();

        File ifcFile = new File(Comman1.ifcFile4example);
        try {
            ifc.readStepFile(ifcFile);
            int NumberofElements = ifc.getNumberOfElements();
            System.out.println("Finished Reading the Model.....!" + NumberofElements);

            Collection<ifc4javatoolbox.ifc4.IfcWall> walls = ifc.getCollection(ifc4javatoolbox.ifc4.IfcWall.class);
            Collection<ifc4javatoolbox.ifc4.IfcSlab> slab = ifc.getCollection(ifc4javatoolbox.ifc4.IfcSlab.class);
            Collection<ifc4javatoolbox.ifc4.IfcRoof> roof = ifc.getCollection(ifc4javatoolbox.ifc4.IfcRoof.class);
            Collection<ifc4javatoolbox.ifc4.IfcSpace> space = ifc.getCollection(ifc4javatoolbox.ifc4.IfcSpace.class);

            System.out.println("The Size of Walls: " + walls.size());
            System.out.println("The Size of Slabs: " + slab.size());
            System.out.println("The Size of Space: " + space.size());
            System.out.println("The Size of Roof : " + roof.size());

            Iterator wallItr = walls.iterator();
            Iterator slabItr = slab.iterator();
            Iterator spaceItr = space.iterator();
            Iterator roofItr = roof.iterator();

            
            
            
            while (wallItr.hasNext()) {
                Object obj = wallItr.next();
                IfcWall wallObj = (IfcWall) obj;
                IfcLabel name = wallObj.getName();
                 
                System.out.println(name+"\n");
                
                
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

}
