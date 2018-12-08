package cw222ng_assign2.Queues;

import java.util.Iterator;

public class QueueMain {

	public static void main(String[] args) {
		LinkedQueue queue = new LinkedQueue();
		Object n= 1;
		Object m = 2;
		Object apa = 3;
		Object test = 4;
		Object badName = 5;
		queue.enqueue(n);
		queue.enqueue(m);
		queue.enqueue(apa);
		queue.enqueue(test);
		queue.enqueue(badName);
		Iterator<Object> it = queue.iterator();
		while(it.hasNext()) {
			Object temp = it.next();
			System.out.println(temp.toString());
		}
		System.out.println("Första: " + queue.first());
		System.out.println("Sista : " + queue.last());
		System.out.println(queue.toString());
		queue.dequeue();
		System.out.println("Första " + queue.first());
		System.out.println("Sista : " + queue.last());
		queue.dequeue();
		queue.dequeue();
		System.out.println("Första " + queue.first());
		System.out.println("Sista : " + queue.last());
		System.out.println(queue.toString());
	}

}
