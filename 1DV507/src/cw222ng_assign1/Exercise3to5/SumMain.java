package cw222ng_assign1.Exercise3to5;
  
public class SumMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 0;
		System.out.println(sum(1,5));

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
	
	public static int sum2(int n, int m) {
		if(n ==m)
			return m;
		
		else {
			int h = (n+m)/2;
			return sum(n,h) + sum(h+1,m);
		}
		
	}
	
	static int fabbo(int n) {
		
		if(n ==0)
			return 0;
		else if(n == 1)
			return 1;
		
		int first = 0;
		int second = 1;
		int sum=0;
		
		for(int i=2; i<=n; i++) {
		sum = first + second;
		first = second;
		second = sum;
			
			
		}
		return sum;
	}
	
}
