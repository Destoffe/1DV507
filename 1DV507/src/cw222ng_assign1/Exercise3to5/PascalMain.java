package cw222ng_assign1.Exercise3to5;

/*
 * Exercise 3by Christoffer Wahlman
 * 2018-01-25
 */
import java.util.Arrays;
import java.util.Scanner;

public class PascalMain {

    public static void main (String[] args) {

        System.out.print("What row in pascals triangel to you want to print? ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] pascalN = pascalRow(n);
        System.out.println(Arrays.toString(pascalN));
    }

    public static int[] pascalRow(int n)
    {
        int[] row = new int[n+1];
        if(n == 0) {
        	row[0]+=1;
            return row;
        }
        int[] pValue = pascalRow(n-1);
        row[0] = 1;
        row[n] = 1;
        int myLength =  pValue.length;
        for(int i = 1; i < myLength; i++) {
        	row[i] = pValue[i-1] + pValue[i];
        }
        return row;
    }

}