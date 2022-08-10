package interviewProgram;

/*
 * write a program for i/p - 1,3,5,2 and o/p - 30,10,6,15 
 */
public class MulElmArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a={1,3,5,2};
		int mul=1;
		
		for(int i=0;i<a.length;i++)
			mul=mul*a[i];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(mul/a[i]);
		}
	}

}
