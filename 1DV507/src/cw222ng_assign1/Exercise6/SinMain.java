package cw222ng_assign1.Exercise6;

import java.util.ArrayList;
import java.util.List;

import org.knowm.xchart.*;
import org.knowm.xchart.XYSeries.XYSeriesRenderStyle;
import org.knowm.xchart.style.Styler.LegendPosition;
public class SinMain {

	public static void main(String[] args) {
	    XYChart chart = new XYChartBuilder().xAxisTitle("X").yAxisTitle("Y").width(800).height(600).build();

	    chart.getStyler().setXAxisMin((double) 0);
	    chart.getStyler().setXAxisMax((double) (2*Math.PI));
	    
	    ArrayList<Double> xData = new ArrayList();
	    ArrayList<Double> yData = new ArrayList(); 
	    for(double i=0; i< (2 *Math.PI); i=i +0.005) { // range 0 - 2*Pi
	    	xData.add(i);
	    }
	    System.out.println(xData.size());
	    for(int i=0; i< xData.size(); i++) { // putting in y = (1 + x/pi)*cos(x)*cos(40*x)
	    	yData.add(((1 + xData.get(i)/Math.PI)*Math.cos(xData.get(i))*Math.cos((40*xData.get(i)))));
	    }
	    chart.addSeries("Exercise 6 chart ", xData, yData);
	    new SwingWrapper(chart).displayChart();

	}

}
