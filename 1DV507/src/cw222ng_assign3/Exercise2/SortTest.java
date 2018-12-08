package cw222ng_assign3.Exercise2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Comparator;

import org.junit.jupiter.api.Test;

class SortTest {

	@Test
	void testInsertionSortIntArray() {
		int[]test = new int[6];
		test[5] = 1;
		test[4] = 0;
		test[3] = 99;
		test[2] = 11;
		test[1] = 8;
		test[0] = 3;
		int[]temp = SortingAlgorithms.insertionSort(test);
		assertEquals(temp[0] ,0);
		assertEquals(temp[5] ,99);
		
		for(int i=0; i<temp.length-1; i++) {
			assertTrue(temp[i]<= temp[i+1]);
		}
	}

	@Test
	 void testInsertionSortStringArrayComparatorOfString() {
		Comparator<String> longestName = (s1,s2) ->Integer.compare(s1.length(), s2.length()); 
		String[]Stringtest = new String[6];
		Stringtest[5] = "tja";
		Stringtest[4] = "tjabba";
		Stringtest[3] = "tjena";
		Stringtest[2] = "hallå";
		Stringtest[1] = "visägerså";
		Stringtest[0] = "hehe";
		
		String[]temp = SortingAlgorithms.insertionSort(Stringtest,longestName);
		assertEquals(temp[0],"tja");
		assertEquals(temp[5],"visägerså");
		

	}

}
