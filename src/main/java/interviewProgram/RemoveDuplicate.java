package interviewProgram;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter String");
		Scanner reader=new Scanner(System.in);
		
		String str=reader.nextLine();
		TreeSet ls=new TreeSet();
		
		
		for(int i=0;i<str.length();i++)
		{
			ls.add(str.charAt(i));
		}
		
		Iterator it=ls.iterator();
		String s = "";
		while(it.hasNext())
		{
			s=s+it.next();
			
		}
		
		System.out.print(s);
	}
}
