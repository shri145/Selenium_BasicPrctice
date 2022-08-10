import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class fibbonacci {

	public static void main(String[] args) {
		//fibanacci series
		
		//n=5----0 1 1 2 3 5
		int x11=0;
		int y1=0;
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=reader.nextInt();
		
		for(int x=0;x<n;x++)
		{
		int number=fib(x);
		System.out.println(number);
	
		}
		

	}
	public static int fib(int num) {
		if(num==0 || num==1)
		{
			return num;
		}else
		{
			return (fib(num-1)+fib(num-2));
		}
		
	}

}
