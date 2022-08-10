package interviewProgram;

import java.util.Scanner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


/*
 * write a program for o(n)=1+2+3..+n? 

he asked me to write the test cases for above program in testNG? 

 */
public class testNG {
	
	static int n,sum=0;
	
	@BeforeClass
	public static void getn()
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter n");
		n=reader.nextInt();
		reader.close();
	}
	
	
	@Test
	public static void sumn()
	{
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
	}
	
	@Test
	public static void negativen()
	{
		if(n<0)
			System.out.println("Entered number is negative!");
	}
	
	@Test
	public static void niszero()
	{
		if(n==0)
			System.out.println("Number is zero");
	}
	
	@AfterClass
	public static void printsum()
	{
		if(sum>0)
		System.out.println("sum:" +sum);
	}
	
	

}
