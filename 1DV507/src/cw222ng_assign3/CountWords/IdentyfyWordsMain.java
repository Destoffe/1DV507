package cw222ng_assign3.CountWords;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class IdentyfyWordsMain {
	
	public static void main(String[] args){
		String filePath = "src\\cw222ng_assign3\\Assets\\HistoryOfProgramming.txt";
		String text = readText(filePath); 
		StringBuilder sBuild = new StringBuilder();
		
		for(int i=0; i<text.length(); i++){
			if(Character.isLetter(text.charAt(i)) || Character.isWhitespace(text.charAt(i))){
				sBuild.append(text.charAt(i));
			}
		}
		
		try {
			PrintWriter out = new PrintWriter("src\\\\cw222ng_assign3\\\\Assets\\\\words.txt");
			out.println(sBuild);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static String readText(String n) {  
		String tempString;
		StringBuilder sBuild = new StringBuilder();
		try {
			BufferedReader bReader = new BufferedReader(new FileReader(n));
			while((tempString = bReader.readLine()) != null) {
				sBuild.append(tempString);
				if(!tempString.equals(" ")){
				sBuild.append(" ");
				}
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
