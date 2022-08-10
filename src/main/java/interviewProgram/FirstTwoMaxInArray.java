package interviewProgram;

import java.util.Scanner;

public class FirstTwoMaxInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter size");
		int n=reader.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
			a[i]=reader.nextInt();
		firsttwomax(a);

	}

	private static void firsttwomax(int[] a) {
		// TODO Auto-generated method stub
		int max1=0;
		int max2=0;
		for(int n:a)
		{
			if(n>max1)
			{
				max2=max1;
				max1=n;
			}
			else if(n>max2)
				max2=n;
		}
		
		System.out.println("first two maximum numbers in array ");
		System.out.println(max1);
		System.out.println(max2);
		}
		
		
	}


