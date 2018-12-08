package cw222ng_assign3.CountWords;

public class Word implements Comparable<Word> {
	   private String word;
	   
	   public Word(String str) { 
		  
		   word = str;
	   }
	   public String toString() { 
		   return word;
	}
	   
	   public int hashCode() {
		   int hc = 0;
		   for(int i=0; i<word.length(); i++){
			   char c = word.charAt(i);
			   hc += Character.getNumericValue(c);
		   }
		return hc; 
	   }
	   
	   public boolean equals(Object other) {
		   if(other instanceof Word){
			   Word otherWord = (Word) other;
			   return word.equalsIgnoreCase(otherWord.word);
		   }
		return false; 
	   }
	   
	   public int compareTo(Word w) {
		 return word.compareToIgnoreCase(w.word); 
	   }
	}