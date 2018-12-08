package cw222ng_assign3.CountWords;

//import cw222ng_assign3.count_words.Word;

public interface WordSet extends Iterable {
	   public void add(Word word); // Add word if not already added
	   public boolean contains(Word word); // Return true if word contained
	   public int size(); // Return current set size
	   public String toString(); // Print contained words
	}