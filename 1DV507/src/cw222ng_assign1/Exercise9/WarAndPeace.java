package cw222ng_assign1.Exercise9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class WarAndPeace {

	public static void main(String[] args) {
		
		String filePath = "C:\\Temp\\WarAndPeace.txt";
		String text = readText(filePath);   // My own method
		String[] words = text.split(" ");  // Simple split, will be cleaned up later on
		System.out.println("Initial word count: "+words.length);   // We found 577091
				
		Stream stream = Arrays.stream(words);
		long counter = stream.map(w -> cleanUp(w)).distinct().count(); // remove all dublicates
		System.out.println(counter);
		
	}
	
	public static String cleanUp(Object n) {
		return n.toString().toLowerCase().replaceAll("[^A-Za-z]",""); // Remove all signs and numbers
	}
	
	public static String readText(String n) { // 
		String tempString;
		StringBuilder sBuild = new StringBuilder();
		try {
			BufferedReader bReader = new BufferedReader(new FileReader(n));
			while((tempString = bReader.readLine()) != null) {
				sBuild.append(tempString);
				sBuild.append(" ");
			}
			bReader.close();
			}
			 catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		return sBuild.toString();
	}
}