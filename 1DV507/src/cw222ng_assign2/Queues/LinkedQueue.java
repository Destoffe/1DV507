package cw222ng_assign2.Queues;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class implements a LinkedQueue using the Head and Tail method.
 * @author Christoffer Wahlmman 
 *
 */
public class LinkedQueue implements Queue {
	private int size = 0;
	private Node head = null;
	private Node tail = null;
	

	public LinkedQueue() {
		
	}
	/**
	 * This returns the size of the Queue.
	 * @return the size of Queue.
	 */
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	   /** This returns the True of the Queue is empty or False if it's not.
	    * @return true if Queue is empty.
	    */
	public boolean isEmpty() {
		if(size ==0)
			return true;
		
		return false;
	}

	   /**
	    * This method adds an Object to the Queue.
	    * @param n element Adds an object to the Queue and increases the size.
	    */
	public void enqueue(Object n) {
		if(head == null)
			head = new Node(n);
		else {
			Node node = head;
			tail = new Node(n);
			while(node.next!= null) {
				node= node.next;
			}
			node.next = new Node(n);
		}
		size++;
	}

	   /**
	    * This returns the first Object in the Queue and then removes it
	    * @return  Returns the first object that was enqueued and removes it.
	    */
	public Object dequeue() {
		Object temp = head.value;
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

	   /**
	    * This returns the first Object in the Queue
	    * @return Returns the first object in the queue
	    */
	public Object first() {
	
		return head.value;
	}

	   /**
	    * This returns the last Object in the Queue
	    * @return Returns the last object in the queue
	    */
	public Object last() {
		return tail.value;
	}
	   /** 
	    * This returns all the values in the Queue as a String
	    * @return Return a string representation of the queue content
	    */
	public String toString() {
		Node node = head;
		String output="";
		while(node!= null) {
			output = output + node.value.toString() + " ";
			node= node.next;
		}
		return "Following objects are in the Linked Qeueue : " + output;
	}

	   /**
	    * This returns an iterator
	    * @return element iterator
	    */
	public Iterator<Object> iterator() {
		// TODO Auto-generated method stub
		return new QueueIterator();
	}

	private class Node{
		Object value;
		Node next = null;
		Node(Object v ){ value = v;}
	}
	private class QueueIterator implements Iterator<Object>{
		private Node node = head;
		public boolean hasNext() {return node != null;}

		public Object next() {
			Object val = node.value;
			node=node.next;
			return val;
		}
		
	}

}
