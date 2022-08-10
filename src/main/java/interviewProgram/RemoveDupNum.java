package interviewProgram;

import java.util.Iterator;

import java.util.LinkedHashSet;


/*
Array - remove duplicate numbers from array. 
[1,0,1,1,1,0,0,1,0,1,2] 
 
o/p : [1,0,2] 
*/
public class RemoveDupNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,0,1,1,1,0,0,1,0,1,2};
		
	
		LinkedHashSet s=new LinkedHashSet();
		//	LinkedHashSet s=new LinkedHashSet();
		
		for(int i=0;i<a.length;i++)
		{
			s.add(a[i]);
		}
		
		Iterator it=s.iterator();
		int elm=0;
		while(it.hasNext())
			
		{
			elm=(Integer) it.next();
			//Removing items in a list while iterating through it 
			if(elm==0)
				//it.remove();
				System.out.println(elm);
			else
			System.out.println(elm);
		}
		

	}

}
