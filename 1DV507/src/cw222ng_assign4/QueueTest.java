package cw222ng_assign4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

class QueueTest {

	@Test
	final void testSize() {
		LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
		LinkedQueue<String> queue2 = new LinkedQueue<String>();
		
		for(int i=0; i<20; i++) {
			queue.enqueue(i);
		}
		for(int i=0; i<25; i++) {
			queue2.enqueue(Integer.toString(i));
		}
		assertEquals(20,queue.size());
		assertEquals(25,queue2.size());
	}

	@Test
	final void testEnqueue() {
		LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
		LinkedQueue<String> queue2 = new LinkedQueue<String>();
		
		for(int i=5; i<20; i++) {
			queue.enqueue(i);
		}
		for(int i=5; i<25; i++) {
			queue2.enqueue(Integer.toString(i));
		}
		Integer test = 5;
		assertEquals(15,queue.size());
		assertEquals(20,queue2.size());
		assertEquals(test,queue.first());
		assertEquals("5",queue2.first());
	}

	@Test
	final void testDequeue() {
		LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
		LinkedQueue<String> queue2 = new LinkedQueue<String>();
		
		for(int i=5; i<20; i++) {
			queue.enqueue(i);
		}
		for(int i=5; i<25; i++) {
			queue2.enqueue(Integer.toString(i));
		}
		Integer test = 5;
		assertEquals((Integer)5,queue.dequeue());
		assertEquals("5",queue2.dequeue());
		assertEquals(14,queue.size());
		assertEquals(19,queue2.size());
	}

	@Test
	final void testFirst() {
		LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
		LinkedQueue<String> queue2 = new LinkedQueue<String>();
		
		for(int i=5; i<20; i++) {
			queue.enqueue(i);
		}
		for(int i=5; i<25; i++) {
			queue2.enqueue(Integer.toString(i));
		}
		Integer test = 5;
		assertEquals(test,queue.first());
		assertEquals("5",queue2.first());
	}

	@Test
	final void testIsEmpty() {
		LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
		LinkedQueue<String> queue2 = new LinkedQueue<String>();
		
		for(int i=5; i<20; i++) {
			queue.enqueue(i);
			queue2.enqueue(Integer.toString(i));
		}
		for(int i=5; i<20; i++) {
			queue.dequeue();
			queue2.dequeue();
		}
		
		assertEquals(true,queue.isEmpty());
		assertEquals(true,queue2.isEmpty());
	}

	@Test
	final void testLast() {
		LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
		LinkedQueue<String> queue2 = new LinkedQueue<String>();
		
		for(int i=5; i<20; i++) {
			queue.enqueue(i);
		}
		for(int i=5; i<25; i++) {
			queue2.enqueue(Integer.toString(i));
		}
		Integer test = 19;
		assertEquals(test,queue.last());
		assertEquals("24",queue2.last());
	}

	@Test
	final void testToString() {
		LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
		LinkedQueue<String> queue2 = new LinkedQueue<String>();
		
		for(int i=1; i<4; i++) {
			queue.enqueue(i);
			queue2.enqueue(Integer.toString(i));
		}
		assertEquals("1 2 3 ",queue.toString());
		assertEquals("1 2 3 ",queue2.toString());
	}

	@Test
	final void testIterator() {
		LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
		LinkedQueue<String> queue2 = new LinkedQueue<String>();
		for(int i=0; i<4; i++) {
			queue.enqueue(i);
			queue2.enqueue(Integer.toString(i));
		}
		Integer count = 0;
		Iterator<Integer> it = queue.iterator();
		Iterator<String> it2 = queue2.iterator();
		while(it.hasNext()) {
			assertEquals(count,it.next());
			assertEquals(Integer.toString(count),it2.next().toString());
			count++;
		}
	}

}
