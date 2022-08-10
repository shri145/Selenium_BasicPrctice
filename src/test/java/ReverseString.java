import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

//IP:shrilatha
		//OP:ahtalirhs
		
		//using string buffer
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter your string");
		String str=reader.nextLine();
		String[] ms=new String[15]; 
		//StringBuffer sb=new StringBuffer(str);
		//System.out.println(sb.reverse().toString());
		char[] ch=str.toCharArray();
		int lenght=ch.length;
		System.out.println(lenght);
		
		for(int i=lenght-1;i>=0;i--)
		{
			char x=ch[i];
			System.out.print(x);
		}
	}

}
