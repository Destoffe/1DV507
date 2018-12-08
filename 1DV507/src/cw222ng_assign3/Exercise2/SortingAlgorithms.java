package cw222ng_assign3.Exercise2;

import java.util.Arrays;
import java.util.Comparator;

public class SortingAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]test = new int[6];
		test[5] = 99;
		test[4] = 0;
		test[3] = 1;
		test[2] = 11;
		test[1] = 8;
		test[0] = 3;
		Comparator<String> longestName = (s1,s2) -> s2.compareTo(s1); 
		String[]Stringtest = new String[6];
		Stringtest[5] = "c";
		Stringtest[4] = "h";
		Stringtest[3] = "e";
		Stringtest[2] = "bb";
		Stringtest[1] = "aa";
		Stringtest[0] = "qq";
		
		
		System.out.println(Arrays.toString(insertionSort(test)));
		System.out.println(Arrays.toString(insertionSort(Stringtest,longestName)));
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
	   public String[] mergeSort(String[] in, Comparator<String> c) {
		   
		   return null;// VG Exercise
	   }
	   public int[] mergeSort(int[] in)  {
		   // VG Exercise
		   
		return null;
	   }

}
