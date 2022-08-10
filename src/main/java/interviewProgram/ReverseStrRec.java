package interviewProgram;

import java.util.Scanner;

public class ReverseStrRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter string");
		String str=reader.nextLine();
		String rev=reverseSringRecursion(str);
		System.out.println(rev);
	}

	private static String reverseSringRecursion(String str) {
		// TODO Auto-generated method stub
		
		if(str.length()==1)
			return str;
		else
			
		return str.charAt(str.length()-1)+reverseSringRecursion(str.substring(0,str.length()-1));
	}

}
