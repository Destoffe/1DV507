package cw222ng_assign3;
 
import java.util.Scanner;

public class EuclideanMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input1;
		int input2;
		System.out.println("Write two numbers, the greates common divisor will be printed.");
		input1 = scan.nextInt();
		input2 = scan.nextInt();
		System.out.println("Greatest common divisor is: " + Euclidean(input1,input2));
		scan.close();
	}

		public static int Euclidean(int a, int b){
			while( b!= 0){
				int c = b;
				b = a%b;
				a = c;
			}
			return a;
		}
}
