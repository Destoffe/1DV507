package cw222ng_assign1.Exercise1;

public class CollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayIntStack myIntStack = new ArrayIntStack();
		ArrayIntList myIntList = new ArrayIntList();
		myIntStack.push(5);
		myIntStack.push(6);
		System.out.println(myIntStack.peek());
		myIntStack.pop();
		System.out.println(myIntStack.peek());
		myIntStack.push(10);
		myIntStack.push(11);
		System.out.println(myIntStack.peek());
		System.out.println(myIntStack.toString());
		
		myIntList.add(5);
		myIntList.add(10);
		myIntList.addAt(3,0);
		myIntList.addAt(7,1);
		myIntList.add(99);
		System.out.println("Size: " +myIntList.size);
		System.out.println(myIntList.get(0));
		System.out.println(myIntList.get(1));
		System.out.println(myIntList.get(2));
		System.out.println(myIntList.get(3));
		System.out.println(myIntList.get(4));
		myIntList.remove(0);

		System.out.println(myIntList.indexOf(5));
		System.out.println(myIntList.toString());
		
	}

}
