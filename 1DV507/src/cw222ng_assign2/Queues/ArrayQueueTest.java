package cw222ng_assign2.Queues;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

 class ArrayQueueTest {

	@Test
	public void testSize() {
		//ArrayQueue test = new ArrayQueue(1);
		LinkedQueue test = new LinkedQueue();
		Object testObject = 5;
		test.enqueue(testObject);
		int size = test.size();
		assertEquals(1,size);
	}

	@Test
	public void testIsEmpty() {
		//ArrayQueue test = new ArrayQueue(1);
		LinkedQueue test = new LinkedQueue();
		Object testObject = 5;
		test.enqueue(testObject);
		boolean notEmpty = test.isEmpty();
		assertEquals(false,notEmpty);
		
	}

	@Test
	public void testEnqueue() {
		//ArrayQueue test = new ArrayQueue(1);
		LinkedQueue test = new LinkedQueue();
		Object testObject = 5;
		Object testObject2 = "HelloGuys";
		test.enqueue(testObject);
		assertEquals(testObject,test.first());
	}

	@Test
	public void testDequeue() {
		//ArrayQueue test = new ArrayQueue(2);
		LinkedQueue test = new LinkedQueue();
		Object testObject = 5;
		Object output;
		test.enqueue(testObject);
		output = test.dequeue();
		assertEquals("5",output.toString());
	}

	@Test
	public void testFirst() {
		//ArrayQueue test = new ArrayQueue(1);
		LinkedQueue test = new LinkedQueue();
		Object testObject = 5;
		Object firstObject = "iAmFirst";
		test.enqueue(firstObject);
		test.enqueue(testObject);
		assertEquals("iAmFirst",test.first());
	}

	@Test
	public void testLast() {
		//ArrayQueue test = new ArrayQueue(1);
		LinkedQueue test = new LinkedQueue();
		Object firstObject = "iAmFirst";
		Object testObject = 5;
		test.enqueue(firstObject);
		test.enqueue(testObject);
		assertEquals(5,test.last());
	}

	@Test
	public void testIterator() {
		//ArrayQueue test = new ArrayQueue(1);
		LinkedQueue test = new LinkedQueue();
		Object firstObject = "iAmFirst";
		Object testObject = 5;
		test.enqueue(firstObject);

		
		Iterator<Object> it = test.iterator();
		assertEquals(true,it.hasNext());
	}

}

