import java.util.Scanner;

public class palindromestr {

	public static void main(String[] args) {
	 
		//palindrome---string
		//Given:malayalam
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter your string");
		String str=reader.next();
		
		//reverse string and check
		
		char[] c=str.toCharArray();
		int size=c.length;
		
		for(int i=size-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
			
		}
		
		
		

	}

}
