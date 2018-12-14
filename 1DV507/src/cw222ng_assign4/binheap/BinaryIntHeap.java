package cw222ng_assign4.binheap;
 
import java.util.Arrays;


/***
 *  Took help from this website describing solutions to a alot of the mathemetic problems https://www.geeksforgeeks.org/binary-heap/
 * @author Stoffe
 *
 */
public class BinaryIntHeap {
	private int size = 0;
	private int arr[] = new int[8];
	public BinaryIntHeap() {
		
	}
	
    public void insert( int n )
    {
        if( size == arr.length - 1 )
          resize();
       
  	  int temp = size++;
  	  while(temp>1 && n<( arr[temp/2] )){ // Percolating up and sorting after added
  		arr[ temp ] = arr[ temp / 2 ];
  		temp = temp/2;
  	  }
		arr[temp] = n; 
    }
	


  private void percolatingDown() { // percolating down thrw the heap trea
	  int index = 0;
      int child;
      int temp = arr[ 0 ];
      while (2 * index + 1 < size)
      {
          child = getChildren(index);
          if (arr[child] < temp)
        	  arr[index] = arr[child];
          else
              break;
          index = child;
      }
      arr[index] = temp;
	   }
  
 
  public int pullHighest(){ // Pull the int with highest priority
      if (isEmpty() )
          throw new RuntimeException("Empty, cant return any data");
      
      int output = arr[0];
      arr[0] = arr[size - 1];
      size--;
      percolatingDown();        
      return output;
  }
  
  private int getChildren(int index) { // Gets the children of the int
      int child = 2 * index +1 ;
      int k = 2;
      int pos = 2 * index + k;
      while ((k <= 2) && (pos < size)) 
      {
          if (arr[pos] < arr[child]) 
        	  child = pos;
          pos = 2 * index + (k+=1); 
      }    
      return child;
  }
  
  
	public int size() {
		
		return this.size;
	}
	
	public boolean isEmpty() {
		
		return size == 0;
	}
	
	private void resize() { // Simple resize funtion
		int growSize = size*2;
		arr = Arrays.copyOf(arr, growSize);
	}

}
