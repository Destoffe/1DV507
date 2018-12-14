package cw222ng_assign4.binheap;
 
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryIntHeapTest {

	@Test
	final void testInsert() {
		BinaryIntHeap bh = new BinaryIntHeap();
		
		bh.insert(5);
		bh.insert(1);
		bh.insert(9);
		bh.insert(4);
		bh.insert(3);
		bh.insert(11);
		bh.insert(99);
		bh.insert(2);
		bh.insert(32);
		assertEquals(bh.pullHighest(),5);
		assertEquals(bh.pullHighest(),1);
		assertEquals(bh.pullHighest(),2);
		assertEquals(bh.pullHighest(),3);
	}

	@Test
	final void testPullHighest() {
		BinaryIntHeap bh = new BinaryIntHeap();
		bh.insert(5);
		bh.insert(1);
		bh.insert(9);
		bh.insert(4);
		bh.insert(3);
		bh.insert(11);
		bh.insert(99);
		bh.insert(2);
		bh.insert(32);
		assertEquals(bh.pullHighest(),5);
		assertEquals(bh.pullHighest(),1);
		assertEquals(bh.pullHighest(),2);
		assertEquals(bh.pullHighest(),3);
	}

	@Test
	final void testSize() {
		BinaryIntHeap bh = new BinaryIntHeap();
		for(int i=0; i<100; i++) {
			bh.insert(i);
		}
		assertEquals(bh.size(),100);
		for(int i=0; i<100; i++) {
			bh.pullHighest();
		}
		assertEquals(bh.size(),0);
	}

	@Test
	final void testIsEmpty() {
		BinaryIntHeap bh = new BinaryIntHeap();
		for(int i=0; i<100; i++) {
			bh.insert(i);
		}
		assertEquals(bh.size(),100);
		for(int i=0; i<100; i++) {
			bh.pullHighest();
		}
		assertEquals(bh.isEmpty(),true);
	}

}
