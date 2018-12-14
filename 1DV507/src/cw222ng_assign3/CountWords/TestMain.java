package cw222ng_assign3.CountWords;
 
//import cw222ng_assign3.count_words.Word;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Word test = new Word("aaaaa");
		Word test1 = new Word("Majskorn");
		Word test2 = new Word("Zebra");
		Word test3 = new Word("Zebra");
		HashWordSet myHash = new HashWordSet();
		TreeWordSet myTree = new TreeWordSet();
		myHash.add(test);
		myHash.add(test1);
		myHash.add(test2);
		myHash.add(test3);
		
		myTree.add(test);
		myTree.add(test1);
		myTree.add(test2);
		myTree.add(test3);
		//System.out.println("b".compareTo("a"));
		//System.out.println(myHash.size());
		//System.out.println(myHash.contains(test));
		//System.out.println("to string: " + myHash.toString());
		
		System.out.println(myTree.size());
		System.out.println("String " + myTree.toString());

	}

}
