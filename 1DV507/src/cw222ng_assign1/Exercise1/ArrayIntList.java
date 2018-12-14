package cw222ng_assign1.Exercise1;

/*
 * Exercise 1 by Christoffer Wahlman 
 * 2018-01-25
 */

public class ArrayIntList extends AbstractIntCollection implements IntList {

	public void add(int n) { // Adding a number to the array, if the array is "full" i will add more space
		values[size] = n;
		size++;
		if(size>=values.length)
			resize();
	}

	public void addAt(int n, int index) throws IndexOutOfBoundsException {
		
		if(index>size-1 || index<0) { // Index bigger than the size or negative? Throw exception!
			throw new IndexOutOfBoundsException();
		}								// Else, add and push the old number at that spot one step to the right
		size++;
		int temp = values[index];
		int secondTemp;
		int tempCounter=index+1;
		values[index] = n;
		
		for(int i=tempCounter; i<size; i++) {
			secondTemp = values[tempCounter];
			values[tempCounter] = temp;
			temp = secondTemp;
			tempCounter++;	
		}
	}


	public void remove(int index) throws IndexOutOfBoundsException {

		if(isEmpty() || index>=size || index <0) { // Want to remove if it's empty or entering a invalid number? Throw exception!
			throw new IndexOutOfBoundsException();
		}
		
		int[] arr = new int[size]; // Temporary int so i can can remove the empty spot if its in the middle of the array.
		
		for(int i=0; i<size; i++) {
			if(i>=index) {
			arr[i] = values[i+1];
			}
			else {
				arr[i] = values[i];
			}
		}
		for(int i=0; i<size-1; i++) {
			values[i] = arr[i];
		}
		size--;
	}
		



	public int get(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		if(index>size-1 || index <0) { // Same as above
			throw new IndexOutOfBoundsException();
		}
			
		return values[index];
	
	}


	public int indexOf(int n) {
		
		for(int i=0; i<size; i++) {
			if(values[i] == n) {
				return i;
			}
		}
		return -1;
	}

}
