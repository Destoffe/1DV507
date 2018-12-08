package cw222ng_assign2.Graphics;

public class SumMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(3,5));

	}
	// 1 to N/2 added with the sum of the integers from N/2+1 to N.
	public static int sum (int n, int m){
		if( n==m)
			return m;
		
		else{
			int h = (n+m)/2;
			return sum(n,h) + sum(h+1 , m);
		}
}
	
}
