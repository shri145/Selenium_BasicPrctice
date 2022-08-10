package interviewProgram;

import java.util.Scanner;

public class ConvertDecimalToBin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n=reader.nextInt();
		decimalToBinary(n);
		

	}

	private static void decimalToBinary(int n) {
		// TODO Auto-generated method stub
		int[] dec=new int[15];
		int index=0;
		while(n>0)
		{
			dec[index++]=n%2;
			n=n/2;
		}
		for(int i=index-1;i>=0;i--)
			System.out.print(dec[i]);
	}

}
