package interviewProgram;

import java.util.Scanner;

public class RecursiveFib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=reader.nextInt();
		
		for(int i=0;i<=n;i++)
		{
			System.out.println(fib(i));
		}

	}

	private static int fib(int n) {
		// TODO Auto-generated method stub
		if(n==0 || n==1)
		return n;
		else
			return (fib(n-1)+fib(n-2));
	}

}
