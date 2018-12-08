package cw222ng_assign3.CountWords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class WordCount1Main {

	public static void main(String[] args) {
		Word myWord;

		String filePath = "src\\cw222ng_assign3\\Assets\\words.txt";
		String text = readText(filePath); 
		String[] splittedWords = text.split(" "); 
		HashSet myHash = new HashSet();
		TreeSet myTree = new TreeSet();

		for(int i=0; i<splittedWords.length; i++){
			myWord = new Word(splittedWords[i]);
			myHash.add(myWord);
			myTree.add(myWord);
		}
		
		Iterator itr = myTree.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+ " ");
		}

		System.out.println("\n" + myHash.size());
		System.out.println(myTree.size());

		
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
