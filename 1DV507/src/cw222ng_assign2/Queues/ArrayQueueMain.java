package cw222ng_assign2.Queues;
 
public class ArrayQueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayQueue queue = new ArrayQueue(2);
		Object Test1 =1;
		Object Test2 =2;
		Object Test3 =3;
		Object Test4 =4;
		Object Test5 =5;
		Object Test6 =5;
		
		queue.enqueue(Test1);
		queue.enqueue(Test2);
		queue.enqueue(Test3);
		queue.enqueue(Test4);
		queue.enqueue(Test5);
		System.out.println(queue.first().toString());
		System.out.println(queue.last().toString());
		System.out.println(queue.dequeue().toString());
		System.out.println(queue.first().toString());

	

	}

}
