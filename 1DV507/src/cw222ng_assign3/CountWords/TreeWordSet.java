package cw222ng_assign3.CountWords;

import java.util.ArrayList;
import java.util.Iterator;

public class TreeWordSet implements WordSet{
	private BST root = null;
	private int currentSize = 0;
	private StringBuilder str = new StringBuilder();
	private ArrayList<Word> list = new ArrayList<>();

	@Override
	public void add(Word n) {
		if(root == null){
			root = new BST(n);
			currentSize++;
			}
		
		else if (!root.containts(n)){
			root.add(n);
			currentSize++;
		}
		
	}

	@Override
	public boolean contains(Word n) {
		return root.containts(n);
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return currentSize;
	}
	public String toString(){
		root.print();

		return str.toString();
	}
	
	private class BST{
		Word value;
		BST left = null;
		BST right = null;
		
		
		BST(Word val){
			value = val;
		}
		void add(Word n){
			if(n.toString().compareToIgnoreCase(value.toString()) <0){
				
				if(left == null)
					left = new BST(n);
				else
					left.add(n);
			}
			
			else if (n.toString().compareToIgnoreCase(value.toString()) >0){
				if(right == null)
					right = new BST(n);
				else
					right.add(n);
			}
		}
		
		boolean containts(Word n){
			if(n.toString().compareToIgnoreCase(value.toString()) <0){
				if(left == null)
					return false;
				else
					return left.containts(n);
			}
			
			else if (n.toString().compareToIgnoreCase(value.toString()) > 0){
				if(right == null)
					return false;
				else
					return right.containts(n);
			}
			return true;
		}
		
		void print (){
			if(left != null)
				left.print();
			str.append(" " + value.toString());
			list.add(value);
			if(right != null)
				right.print();
		}
	}
	
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new QueueIterator();
	}
	private class QueueIterator implements Iterator<Object>{
		boolean firstrun = true;
		int counter = 0;
		
		@Override
		public boolean hasNext() {
			while((root.left !=null || root.right != null) && counter != list.size()-1) 
				return true;
			
			return false;
		}
		@Override
		public Object next() {
			if(firstrun) {
				root.print();
				firstrun = false;
			}
			if(counter <list.size())
			counter++;
			return list.get(counter-1);
			
		}
	}

}
