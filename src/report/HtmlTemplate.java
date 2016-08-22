/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package report;

import static java.lang.System.out;

/**
 *
 * @author Ecologic
 */
public class HtmlTemplate {
    
 public void generate(ReportTemplate rd) {
   
    out.println("<html>");
    out.println("<head>");
    out.println("<title>"+rd.getReportTitle()+"</title>");
    out.println("<body>");
 
    // banners :
    
    out.println("<>");
    out.println("<>"); 
    

    out.println("<hr>");

    // body 
    out.println("<>"); 
    out.println("<>"); 
     
    out.println("<hr>");
    
    out.println("</body>");
    out.println("</html>");
  }
    
 
    
 
 
 
    
}
