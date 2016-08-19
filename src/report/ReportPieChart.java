/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package report;

import java.awt.Color;
import java.awt.Dimension;
import java.text.DecimalFormat;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.PieSectionLabelGenerator;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Ecologic :http://stackoverflow.com/questions/17501750/jfreechart-customize-piechart-to-show-absolute-values-and-percentages
 */
public class ReportPieChart {

    private static final String KEY1 = "Conformance ";
    public static final String KEY2 = "Non-Conformance";

    public static void main(String[] args) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue(KEY1, 40);
        dataset.setValue(KEY2, 77);

        JFreeChart someChart = ChartFactory.createPieChart(
            "Conformance vs Non-Conformance of Rules \n Total Rule 100 \n Project Name \n BuildingName \n SiteName ", dataset, true, true, false);
        PiePlot plot = (PiePlot) someChart.getPlot();
        plot.setSectionPaint(KEY1, Color.darkGray);
        plot.setSectionPaint(KEY2, Color.red);
        plot.setExplodePercent(KEY1, 0.10);
        plot.setSimpleLabels(true);
        

        PieSectionLabelGenerator gen = new StandardPieSectionLabelGenerator(
            "{0}: {1} ({2})", new DecimalFormat("0"), new DecimalFormat("0%"));
        plot.setLabelGenerator(gen);

        JFrame f = new JFrame("Rule Based Conformance Report Visualization");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new ChartPanel(someChart) {
            private static final long serialVersionUID = 1L;
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(400, 300);
            }
        });
        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);

    }
}