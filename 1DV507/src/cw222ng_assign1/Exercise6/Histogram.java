package cw222ng_assign1.Exercise6;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.style.Styler.LegendPosition;

public class Histogram {
	
	public static void main(String[] args)  {
		
		File file = new File("C:\\Temp\\LiteText.txt"); // Copy pasta from my Histogram exercise from the previous course
		Scanner scan;
		PieChart chart = new PieChartBuilder().width(800).height(600).build();
		CategoryChart barChart = new CategoryChartBuilder().width(800).height(600).title("Exercise6 Bar chart").xAxisTitle("Score").yAxisTitle("Number").build();
		Color[] sliceColors = new Color[] { new Color(0, 50, 255), new Color(0, 255, 10), // Some different colors for the pie
				new Color(255, 0, 10), new Color(243, 180, 159),new Color(99,22, 66),
				new Color(150, 0, 150),new Color(87, 30, 150),new Color(150, 87, 30),
				new Color(30, 87, 150),new Color(20, 99, 82),new Color(62, 42, 2) };
		
		chart.getStyler().setSeriesColors(sliceColors);
		barChart.getStyler().setLegendPosition(LegendPosition.InsideNW);
		barChart.getStyler().setHasAnnotations(true);
		try {
			scan = new Scanner(file);

			int[] counter = new int[11];
	
			int readInt;
			int rightAmount = 0;
			int restAmount = 0;
			int temp = 0;
			System.out.println("Läser in heltal från filen: C:\\Temp\\LiteText.txt");
			while (scan.hasNextInt()) {
				readInt = scan.nextInt();
				if(readInt>=1 && readInt<=10)
					counter[0]++;
				else if(readInt>=11 &&  readInt<=20) 
					counter[1]++;
				else if(readInt>=21 &&  readInt<=30) 
					counter[2]++;
				else if(readInt>=31 &&  readInt<=40) 
					counter[3]++;
				else if(readInt>=41 &&  readInt<=50) 
					counter[4]++;
				else if(readInt>=51 &&  readInt<=60) 
					counter[5]++;
				else if(readInt>=61 &&  readInt<=70) 
					counter[6]++;
				else if(readInt>=71 &&  readInt<=80) 
					counter[7]++;
				else if(readInt>=81 &&  readInt<=90) 
					counter[8]++;
				else if(readInt>=91 &&  readInt<=100) 
					counter[9]++;
				else {
					counter[10]++;
					restAmount++;
				}
				if(readInt >=1 && readInt<=100) {
					rightAmount++;
				}
			
					
			}
			int[] yData = new int[11];
			
			for(int i=0; i<11; i++) {
				yData[i] = i;
			}
		    chart.addSeries("1-10", counter[0]);
		    chart.addSeries("11-20", counter[1]);
		    chart.addSeries("21-30", counter[2]);
		    chart.addSeries("31-40", counter[3]);
		    chart.addSeries("41-50", counter[4]);
		    chart.addSeries("51-60", counter[5]);
		    chart.addSeries("61-70", counter[6]);
		    chart.addSeries("71-80", counter[7]);
		    chart.addSeries("81-90", counter[8]);
		    chart.addSeries("91-100", counter[9]);
		    chart.addSeries("Rest", counter[10]);
		    new SwingWrapper<PieChart>(chart).displayChart();
		    barChart.addSeries("Barchart", yData, counter);
		    new SwingWrapper<CategoryChart>(barChart).displayChart();
		 
			
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		
	}


