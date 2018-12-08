package cw222ng_assign3.CountWords;

import java.util.Iterator;

import com.sun.corba.se.impl.orbutil.graph.Node;


public class HashWordSet implements WordSet {

	private Node[] buckets = new Node[8];
	private int currentSize;
	
	public HashWordSet(){
		
	}
	
	public String toString(){
		StringBuilder str = new StringBuilder();
		String temp = "";
		
		for(int i=0; i<buckets.length; i++){
			if(buckets[i] != null){
				temp =  buckets[i].toString();
				str.append(temp + " ");
			}
		}
		
		return str.toString();
	}

	@Override
	public void add(Word word) {
		int pos = getBucketNumber(word);
		Node node = buckets[pos];
		while(node !=null){
			if(node.value.equals(word)){
				return;
			}
			else {
				node = node.next;
				}
		}
		node = new Node(word);
		node.next = buckets[pos];
		buckets[pos] = node;
		currentSize++;
		if (currentSize == buckets.length) rehash ();
	}

	private void rehash(){
			Node[] temp = buckets;
			buckets = new Node[2 * temp.length];
			currentSize = 0;
			for(Node n: temp){
				if( n == null)continue;
				while(n!= null){
					add(n.value);
					n = n.next;
				}
			}
	}

	@Override
	public boolean contains(Word word) {
		int pos = getBucketNumber(word);
		Node node = buckets[pos];
		while(node !=null){
			if(node.value.equals(word)){
				return true;
			}
			else
				node = node.next;
		}
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return currentSize;
	}
	
	private int getBucketNumber(Word word ){
		int hc = word.hashCode();
		if(hc<0) 
			hc = -hc;
		
		return hc%buckets.length;
	}
	
	private class Node{
		Word value;
		Node next = null;
		public Node(Word str){
			value = str;
		}
		public String toString(){
			return value.toString();
		}
	}
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new QueueIterator();
	}
	
	private class QueueIterator implements Iterator<Object>{
		private Node[] node = buckets;
		int count = 0;
		public boolean hasNext() {return node != null;}

		public Object next() {
			Object val = node[count].value;
			node[count]=node[count].next;
			count++;
			return val;
		}
	}

}
