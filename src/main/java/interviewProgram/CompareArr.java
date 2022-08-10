package interviewProgram;

import java.util.Arrays;

/*
 *  if you two arrays with same values say A1= (1,2,3) and A2=(1,2,3) .
 *   what will be output of if(A1==A2) 
 */
public class CompareArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={1,2,3};
		int[] b={1,3,2};
		
		
		System.out.println(a==b);
		
		System.out.println(Arrays.equals(a,b));
		
	}

}
