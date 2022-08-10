package interviewProgram;

import java.util.Scanner;

public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader=new Scanner(System.in);
		System.out.println("enter a number");
		long n=reader.nextLong();
		double upperlimit=Math.sqrt(n);
		int cnt=0;
		for(int i=1;i<=upperlimit;i++)
		{
			cnt++;
			if(n%i==0)
			{
				System.out.println(i);
				if(i!=n/i)
				{
					System.out.println(n/i);
				}
			}
		}
		System.out.println("Count:" +cnt);
	}

}
