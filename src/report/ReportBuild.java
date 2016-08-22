/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package report;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import static java.lang.System.out;
import java.util.ArrayList;
import static java.util.Arrays.stream;
import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.security.x509.X500Name;

/**
 *
 * @author Ecologic
 */
public class ReportBuild {

    void appendTag(StringBuilder sb, String tag, String contents) {
        sb.append('<').append(tag).append('>');
        sb.append(contents);
        sb.append("</").append(tag).append('>');
    }

    void appendDataCell(StringBuilder sb, String contents) {
        appendTag(sb, "td", contents);
    }

    void appendHeaderCell(StringBuilder sb, String contents) {
        appendTag(sb, "th", contents);
    }

    
    public static String JS(){
    
    String js = "<script type=\"text/javascript\" charset=\"utf-8\">var TgTableSort=window.TgTableSort||function(n,t){\"use strict\";function r(n,t){for(var e=[],o=n.childNodes,i=0;i<o.length;++i){var u=o[i];if(\".\"==t.substring(0,1)){var a=t.substring(1);f(u,a)&&e.push(u)}else u.nodeName.toLowerCase()==t&&e.push(u);var c=r(u,t);e=e.concat(c)}return e}function e(n,t){var e=[],o=r(n,\"tr\");return o.forEach(function(n){var o=r(n,\"td\");t>=0&&t<o.length&&e.push(o[t])}),e}function o(n){return n.textContent||n.innerText||\"\"}function i(n){return n.innerHTML||\"\"}function u(n,t){var r=e(n,t);return r.map(o)}function a(n,t){var r=e(n,t);return r.map(i)}function c(n){var t=n.className||\"\";return t.match(/\\S+/g)||[]}function f(n,t){return-1!=c(n).indexOf(t)}function s(n,t){f(n,t)||(n.className+=\" \"+t)}function d(n,t){if(f(n,t)){var r=c(n),e=r.indexOf(t);r.splice(e,1),n.className=r.join(\" \")}}function v(n){d(n,L),d(n,E)}function l(n,t,e){r(n,\".\"+E).map(v),r(n,\".\"+L).map(v),e==T?s(t,E):s(t,L)}function g(n){return function(t,r){var e=n*t.str.localeCompare(r.str);return 0==e&&(e=t.index-r.index),e}}function h(n){return function(t,r){var e=+t.str,o=+r.str;return e==o?t.index-r.index:n*(e-o)}}function m(n,t,r){var e=u(n,t),o=e.map(function(n,t){return{str:n,index:t}}),i=e&&-1==e.map(isNaN).indexOf(!0),a=i?h(r):g(r);return o.sort(a),o.map(function(n){return n.index})}function p(n,t,r,o){for(var i=f(o,E)?N:T,u=m(n,r,i),c=0;t>c;++c){var s=e(n,c),d=a(n,c);s.forEach(function(n,t){n.innerHTML=d[u[t]]})}l(n,o,i)}function x(n,t){var r=t.length;t.forEach(function(t,e){t.addEventListener(\"click\",function(){p(n,r,e,t)}),s(t,\"tg-sort-header\")})}var T=1,N=-1,E=\"tg-sort-asc\",L=\"tg-sort-desc\";return function(t){var e=n.getElementById(t),o=r(e,\"tr\"),i=o.length>0?r(o[0],\"td\"):[];0==i.length&&(i=r(o[0],\"th\"));for(var u=1;u<o.length;++u){var a=r(o[u],\"td\");if(a.length!=i.length)return}x(e,i)}}(document);document.addEventListener(\"DOMContentLoaded\",function(n){TgTableSort(\"tg-VVA9t\")});</script>";
    
    return js.trim() ;
    
    
    
    }
    
    public static String Css()
    {
     String css = "<style type=\"text/css\">\n" +
".tg  {border-collapse:collapse;border-spacing:0;border-color:#aabcfe;margin:0px auto;}\n" +
".tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#aabcfe;color:#669;background-color:#e8edff;}\n" +
".tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#aabcfe;color:#039;background-color:#b9c9fe;}\n" +
".tg .tg-baqh{text-align:center;vertical-align:top}\n" +
".tg .tg-mb3i{background-color:#D2E4FC;text-align:right;vertical-align:top}\n" +
".tg .tg-lqy6{text-align:right;vertical-align:top}\n" +
".tg .tg-6k2t{background-color:#D2E4FC;vertical-align:top}\n" +
".tg .tg-yw4l{vertical-align:top}\n" +
"th.tg-sort-header::-moz-selection { background:transparent; }th.tg-sort-header::selection      { background:transparent; }th.tg-sort-header { cursor:pointer; }table th.tg-sort-header:after {  content:'';  float:right;  margin-top:7px;  border-width:0 4px 4px;  border-style:solid;  border-color:#404040 transparent;  visibility:hidden;  }table th.tg-sort-header:hover:after {  visibility:visible;  }table th.tg-sort-desc:after,table th.tg-sort-asc:after,table th.tg-sort-asc:hover:after {  visibility:visible;  opacity:0.4;  }table th.tg-sort-desc:after {  border-bottom:none;  border-width:4px 4px 0;  }@media screen and (max-width: 767px) {.tg {width: auto !important;}.tg col {width: auto !important;}.tg-wrap {overflow-x: auto;-webkit-overflow-scrolling: touch;margin: auto 0px;}}</style>";;
        return css;

    
        
    
    }
    
    
    
    
    
    
    
    
    
    //http://codereview.stackexchange.com/questions/63331/efficiently-generating-html-css-table-using-java
    public static void GenerateHTML(ReportTemplate rm) {

        StringBuilder sb = new StringBuilder();
        sb.append(Css());
        sb.append("<div class=\"tg-wrap\">");
       // sb.append("<div class=\"container\">" + "\n");
        //sb.append("<div class=\"jumbotron\">" + "\n");
        sb.append("<center><h1>Conformance Report:</h1></center>" + "\n");
        sb.append("<hr>" + "\n");
        sb.append("<p><b> Report Title:</b> ").append(rm.getReportTitle().length() > 0 ? rm.getReportTitle() : "No Data Mentioned").append("</p>" + "\n");
        sb.append("<p><b> Report Date:</b> ").append(rm.getReportDate().length() > 0 ? rm.getReportDate() : "No Data Mentioned").append("</p>" + "\n");
        sb.append("<p><b> Report Module:</b> ").append(rm.getModule().length() > 0 ? rm.getModule() : "No Data Mentioned").append("</p>" + "\n");
        sb.append("<p><b> Report ProjectName:</b> ").append(rm.getProjectName().length() > 0 ? rm.getProjectName() : "No Data Mentioned").append("</p>" + "\n");
        sb.append("<p><b> Report BuildingName:</b>").append(rm.getBuildingName().length() > 0 ? rm.getBuildingName() : "No Data Mentioned").append("</p>" + "\n");
        sb.append("</div>");
        sb.append("<p> Report Date:").append(rm.getReportDate().length() > 0 ? rm.getReportDate() : "No Data Mentioned").append("</p>" + "\n");
        sb.append("\n" + "<p> Site Name:" + ((rm.getSiteName().length() > 0 ? rm.getSiteName() : "No Data Mentioned")) + "</p>" + "\n");
        sb.append("<hr>");
        List<ReportColumnAndValuePair> StairData = rm.getStairlist();
        List<ReportColumnAndValuePair> SlabData = rm.getSlablist();
        List<ReportColumnAndValuePair> ColumnData = rm.getColumnslist();
        List<ReportColumnAndValuePair> FootingData = rm.getFootinglist();
        sb.append("\n");
        sb.append("<hr>" + "\n");
        String StairsReportStr = Components_Report(StairData, "Stair Report");
        sb.append(StairsReportStr + "\n");
        sb.append("<hr>" + "\n");
        String SlabReportStr = Components_Report(SlabData, "Slab Report");
        sb.append(SlabReportStr + "\n");
        sb.append("<hr>" + "\n");
        String ColumnsReportStr = Components_Report(ColumnData, "Columns Report");
        sb.append(ColumnsReportStr + "\n");
        sb.append("<hr>" + "\n");
        String FootingsReportStr = Components_Report(FootingData, "Footings Report");
        sb.append(FootingsReportStr).append("\n");
        sb.append("<hr>" + "\n");
        sb.append("<hr>");
        sb.append("<div class='footer'> Report Created by :<b><i>").append(rm.getReportPreparedBy()).append("</i></b></div>");
        sb.append("<hr>" + "\n");
        sb.append(JS());
        System.out.println(sb.toString());
        FileOutputStream stream = null;
        PrintStream out = null;

        try {

            stream = new FileOutputStream("D://Dropbox//RaninderBox//Reports//" + rm.getReportFileName());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ReportBuild.class.getName()).log(Level.SEVERE, null, ex);
        }

        out = new PrintStream(stream);
        out.print(sb.toString());

    }

    public static String Components_Report(List<ReportColumnAndValuePair> data, String Title) {

        if (data.size() < 0) {

            return "No Data";

        } else {

            StringBuilder sb = new StringBuilder();
            sb.append("<center>" + Title + "\n+<table id=\"tg-VVA9t\" class=\"tg\" border= '2' >");

            sb.append("<tr>");
            for (ReportColumnAndValuePair o : data) {
                sb.append("<th class=\"tg-baqh\" >");
                sb.append(o.ColumnName);
                sb.append("</th>");
            }
            sb.append("</tr>");

            // Start of Data Values 
            sb.append("<tr>");

            for (ReportColumnAndValuePair o : data) {
                sb.append("<td>");
                sb.append(o.ColumnValue);
                sb.append("</td>");
            }
            sb.append("<tr>");

            sb.append("</table></center>");

            return sb.toString();

        }

    }

    public static void main(String args[]) {

        ReportTemplate rm = new ReportTemplate();
        rm.setReportTitle("First Draft Report ");
        rm.setModule("Structure Analysis ");
        rm.setBuildingName("Yadvindra Public School");
        rm.setSiteName("Dinning Hall");
        rm.setReportPreparedBy("Randinder D");

        List<ReportColumnAndValuePair> col = new ArrayList<>();
        col.add(new ReportColumnAndValuePair("S.No:", "1"));
        col.add(new ReportColumnAndValuePair("ReferenceNo:", "#228"));
        col.add(new ReportColumnAndValuePair("RuleSetID:", "3737"));
        col.add(new ReportColumnAndValuePair("Flag:", "Yes"));
        col.add(new ReportColumnAndValuePair("Remark:", "XXXXX"));

        rm.setColumnslist(col);

        rm.setSlablist(col);
        rm.setFootinglist(col);

        rm.setStairlist(col);

        GenerateHTML(rm);
        com.rules.Common.msg("End of Report Generation ");
    }

}
