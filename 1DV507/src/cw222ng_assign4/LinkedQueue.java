package cw222ng_assign4;

import java.util.Iterator;


public class LinkedQueue<T> implements Queue<T> {

	private int size = 0;
	private Node head = null;
	private Node tail = null;
	
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}

	
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}


	public void enqueue(T item) {
		if(head == null)
			head = new Node(item);
		else {
			Node node = head;
			tail = new Node(item);
			while(node.next!= null) {
				node= node.next;
			}
			node.next = new Node(item);
		}
		size++;
		
	}


	public T dequeue() {
		// TODO Auto-generated method stub
		T temp = head.value;
		if(!isEmpty()) {
			Node node = head;
			head = head.next;
			while(node.next!= null) {
				node= node.next;
			}
			size--;
		}else  throw new IndexOutOfBoundsException();
			
		return temp;
	}


	public T first() {
		// TODO Auto-generated method stub
		return head.value;
	}


	public T last() {
		// TODO Auto-generated method stub
		return tail.value;
	}
	public String toString() {
		Node node = head;
		String output="";
		while(node!= null) {
			output = output + node.value.toString() + " ";
			node= node.next;
		}
		return output;
	}

	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new QueueIterator();
	}
	
	private class Node{
		T value;
		Node next = null;
		Node(T v ){ value = v;}
	}
	
	private class QueueIterator implements Iterator<T>{
		private Node node = head;
		public boolean hasNext() {return node != null;}

		public T next() {
			T val = node.value;
			node=node.next;
			return val;
		}
		
	}

}
