package interviewProgram;

import java.util.HashSet;
import java.util.Iterator;

public class StringFix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prime={2,4,5,23,21,7,3,7,25,3};
		HashSet h=new HashSet();
		for(int i=0;i<prime.length;i++)
		{
			h.add(prime[i]);
		}
		
		boolean p=true;
		int elm;
		Iterator it=h.iterator();
		while(it.hasNext())
		{
			p=true;
			elm=(Integer) it.next();
		for(int i=2;i<=elm/2;i++)
		{
			if(elm%i==0)
			{
				p=false;
			}
		}
		if(p)
			System.out.println(elm);
			
		}
			

	}

}
