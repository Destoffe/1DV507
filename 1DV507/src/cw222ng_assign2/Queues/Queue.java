package cw222ng_assign2.Queues;
/**
 * This interface is the shell of a Queue system
 * @author Christoffer Wahlman
 */
import java.util.Iterator;
 
public interface Queue {  
		/**
		 * This returns the size of the Queue.
		 * @return the size of Queue.
		 */
	   public int size();                     // current queue size 
	   /** This returns the True of the Queue is empty or False if it's not.
	    * @return true if Queue is empty.
	    */
	   public boolean isEmpty();             
	   /**
	    * This method adds an Object to the Queue.
	    * @param element Adds an object to the Queue and increases the size.
	    */
	   public void enqueue(Object element);  
	   /**
	    * This returns the first Object in the Queue and then removes it
	    * @return  Returns the first object that was enqueued and removes it.
	    */
	   public Object dequeue();               
	   /**
	    * This returns the first Object in the Queue
	    * @return Returns the first object in the queue
	    */
	   public Object first();                 
	   /**
	    * This returns the last Object in the Queue
	    * @return Returns the last object in the queue
	    */
	   public Object last();                 
	   /** 
	    * This returns all the values in the Queue as a String
	    * @return Return a string representation of the queue content
	    */
	   public String toString();             
	   /**
	    * This returns an iterator
	    * @return element iterator
	    */
	   public Iterator<Object> iterator();    
	}