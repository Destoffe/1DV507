package cw222ng_assign4.time;
 
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Exercise3 {
	
	static long oneSecond = 1000000000;
	static int tempSum=0;
	public static void main(String[] args) {
		
		int[] arr = new  int[10];
		String[] stringArr = new String[10];
		
		
		for(int i=0; i<5; i++)
			System.out.println(intTimeTest(arr));
		
		System.out.println("Average amount of int sorts: " + (tempSum /5));
		tempSum =0;
		
		for(int i=0; i<5; i++) 
			System.out.println(stringTimeTest(stringArr));
		System.out.println("Average amount of String sorts: " + (tempSum /5));
	}
	
	public static String stringTimeTest(String[] test) {
		long before = System.nanoTime();
		long after;
		long estimatedTime =0;
		int counter = 0;
		Comparator<String> alphabetic = (s1,s2) -> s2.compareTo(s1); 
		
		for(int i=0; i<test.length; i++ ) {
			test[i] = randomString();
		}
		while(estimatedTime< oneSecond) {
			insertionSort(test,alphabetic);
			counter++;
			after =System.nanoTime();
			estimatedTime = after-before;
			for(int i=0; i<test.length; i++ ) {
				test[i] = randomString();
			}
		}
		tempSum += counter;
		return "Amount of sorts done : " + counter;
	}
	
	public static String intTimeTest(int[] test) {
		long before = System.nanoTime();
		long after;
		long estimatedTime =0;
		int counter = 0;
		Random rand = new Random();
		
		for(int i=0; i<test.length; i++ ) {
			test[i] = rand.nextInt(100);
		}
		
		while(estimatedTime< oneSecond) {
			insertionSort(test);
			counter++;
			after =System.nanoTime();
			estimatedTime = after-before;
			for(int y=0; y<test.length; y++ ) {
				test[y] = rand.nextInt(100);
			}
		}
		tempSum += counter;
		return "Amount of sorts done : " + counter;
		
	}
	
	public static int[] insertionSort(int[] in)  {
		  int[]arr = in;
		  
		  for(int i=0; i<arr.length-1; i++){
			  int j = i;
			  int temp = arr[i+1];
			  int hold = arr[i];
			  
			  while(j>=0 && arr[j]>temp){
				  arr[j+1] = arr[j]; 
				  j--;
			  }
			  arr[j+1] = temp;
		  }
		 
		 return arr;
	 }
	
	public static String[] insertionSort(String[] in, Comparator<String> c)  {
		   String arr[] = in;
		   for (int j = 1; j < arr.length; j++) {
			    String temp = arr[j];
			    int i = j - 1;
			    	while (i >= 0) {
			    		if (c.compare(temp,arr[i]) >0 ) {
			    			break;
			      }
			      arr[i + 1] = arr[i];
			      i--;
			    }
			    arr[i + 1] = temp;
		   }
		   return arr;
		   
	   }


	public static String randomString() {
		char[] letters = { 'a','b','c','d','e','f',
				'g','h','i','j','k','l','m','n','o',
				'p','q','r','s','t','u','v','w','x','y','z'
		};
		StringBuilder sb = new StringBuilder();
		Random rand = new Random();
		for(int i=0; i<10; i++) {
			sb.append(letters[rand.nextInt(24)]);
		}
		return sb.toString();
				
		}
	}

