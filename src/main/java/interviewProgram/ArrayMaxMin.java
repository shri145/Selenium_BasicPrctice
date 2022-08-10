package interviewProgram;

import java.util.Arrays;

public class ArrayMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={10,30,40,20,50};
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int e:a)
		System.out.print(e+" ");
		int[] b=new int[5];
		
		//int[] b={50,10,40,20,30};
		
		int j=0;
		
		int i=0,k=a.length-1;
		while(j<5)
		{
			b[j++]=a[i];
			i=i+1;
			
			if(j==5)
		      break;
			
			b[j++]=a[k];
			k=k-1;
		}
		System.out.println("");
		for(int e:b)
			System.out.print(e+" ");

	}

	
}
