package cw222ng_assign1.Exercise1;


/*
 * Exercise 1 by Christoffer Wahlman 
 * 2018-01-25
 * Pretty much the same as ArrayIntList but without all the hard stuff
 */
public class ArrayIntStack extends AbstractIntCollection  implements IntStack  {

	@Override
	public void push(int n) { 
		values[size] = n;
		size++;
		if(size>=values.length)
			resize();
	}

	@Override
	public int pop() throws IndexOutOfBoundsException {
		int temp = values[size-1];
		if(size>0)
		size--;
		return temp;
		
	}

	@Override
	public int peek() throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return values[size-1];
	}

	


}
