package cw222ng_assign4.time;

public class Exercise2 {
	
	static int tempSum[] = new int[2];
	static long oneSecond = 1000000000;	//One second in nanoSeconds
	
	public static void main(String[] args) {
		
		for(int i=0; i<5; i++)
		System.out.println("StringBuilder test, long String " + longTimeTestStringBuilder());
		
		System.out.println("Average repeats : " + tempSum[0] /5 + " Average String length : " + tempSum[1] /5);
		tempSum[0] =0;tempSum[1] = 0;
		
		for(int i=0; i<5; i++)
		System.out.println("String test, short String " + shortTimeTestString());
		
		System.out.println("Average repeats : " + tempSum[0] /5 + " Average String length : " + tempSum[1] /5);
		tempSum[0] =0;tempSum[1] = 0;
		
		for(int i=0; i<5; i++)
		System.out.println("StringBuilder test, short String " + shortTimeTestStringBuilder());
		
		System.out.println("Average repeats : " + tempSum[0] /5 + " Average String length : " + tempSum[1] /5);
		tempSum[0] =0;tempSum[1] = 0;
		
		for(int i=0; i<5; i++)
		System.out.println("String test, long String " + longTimeTestString());
		
		System.out.println("Average repeats : " + tempSum[0] /5 + " Average String length : " + tempSum[1] /5);
		tempSum[0] =0;tempSum[1] = 0;
		
		
		
	}
	public static String longTimeTestStringBuilder () {
		long before = System.nanoTime();
		long after;
		long estimatedTime =0;
		int counter = 0;
		StringBuilder temp = new StringBuilder();
	
		while(estimatedTime< oneSecond) {
			temp.append("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula.");
			after =System.nanoTime();
			estimatedTime = after-before;
			counter++;
		}
		tempSum[0]+= counter;
		tempSum[1]+= temp.length();
		return "Amount of concatentations : " + counter + " Length of the String : " + Integer.toString(temp.length());
	}
	
	public static String longTimeTestString () {
		long before = System.nanoTime();
		long after;
		long estimatedTime =0;
		String temp = "";
		int counter = 0;
		
		while(estimatedTime< oneSecond) {
			temp = temp + "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula.";
			after =System.nanoTime();
			estimatedTime = after-before;
			counter++;
		}
		tempSum[0]+= counter;
		tempSum[1]+= temp.length();
		return "Amount of concatentations : " + counter + " Length of the String : " + Integer.toString(temp.length());
	}
	
	public static String shortTimeTestString () {
		long before = System.nanoTime();
		long after;
		long estimatedTime =0;
		String temp = "";
		int counter = 0;
		
		while(estimatedTime< oneSecond) {
			temp = temp + 'a';
			after =System.nanoTime();
			estimatedTime = after-before;
			counter++;
		}
		tempSum[0]+= counter;
		tempSum[1]+= temp.length();
		return "Amount of concatentations : " + counter + " Length of the String : " + Integer.toString(temp.length());
	}
	
	public static String shortTimeTestStringBuilder () {
		long before = System.nanoTime();
		long after;
		long estimatedTime =0;
		int counter = 0;
		StringBuilder temp = new StringBuilder();
		
		while(estimatedTime< oneSecond) {
			temp.append("a");
			after =System.nanoTime();
			estimatedTime = after-before;
			counter++;
		}
		tempSum[0]+= counter;
		tempSum[1]+= temp.length();
		return "Amount of concatentations : " + counter + " Length of the String : " + Integer.toString(temp.length());
	}

}
