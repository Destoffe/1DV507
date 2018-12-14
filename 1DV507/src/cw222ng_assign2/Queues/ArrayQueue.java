package cw222ng_assign2.Queues;
 
import java.util.Iterator;

public class ArrayQueue implements Queue{
	int maxSize;
	Object [] arr;
	int head = -1;
	int tail = -1;
	int size = 0;

	public ArrayQueue(int size) {
		maxSize = size;
		arr = new Object[size];
	}
	public int size() {
		// TODO Auto-generated method stub
		return maxSize;
	}

	public boolean isEmpty() {
		
		if(head < 0 && tail < 0)
			return true;
					
		return false;
	}
	private boolean isFull() {
		if((tail+1)%maxSize == head) {
			return true;
		}
		
		return false;
	}
	private void resize() {
		Object[]temp = new Object[2*maxSize];
		System.arraycopy(arr, 0, temp, 0, maxSize);
		maxSize = maxSize*2;
		arr=temp;
	}

	@Override
	public void enqueue(Object n) {
		if(isFull()) {
			resize();
		}
		
		if(isEmpty()) {
			head = tail = 0;
		}else {
			tail = (tail +1)%maxSize;
		}
		arr[tail] = n;
		size++;
		
	}

	@Override
	public Object dequeue() {
		Object temp;
		
		if(isEmpty()) {
			throw new IndexOutOfBoundsException();
		}
		
		if(head == tail) {
			temp = arr[head];
			head = -1;
			tail = -1;
		}else {
			temp = arr[head];
			head = (head +1) %maxSize;
		}
		size--;	
		return temp;
		
	}

	
	public Object first() {
		if(!isEmpty())
		return arr[head];
		
		return null;
	}

	public Object last() {
		if(!isEmpty())
		return arr[tail];
		
		return null;
	}

	@Override
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private class ArrayIterator implements Iterator<Object>{
		private int count = 0;
		
		public boolean hasNext() {
			
			if( count < arr.length && arr[count] !=null) {
				return true;
			}
			return false;
		}
		
		public Object next() {
			Object test = arr[count++];
			return test;
		}
	}

}
