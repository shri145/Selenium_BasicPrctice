package interviewProgram;

import java.util.Arrays;

public class CompareTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a={1,2,3};
		int []b={1,2,3};
		System.out.println(Arrays.equals(a, b));
		System.out.println(a==b);
		System.out.println(a.hashCode()==b.hashCode());
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		int n=33;
		char c=(char) n;
		
		System.out.println("The ASCII representation of " + n + " is " + c + "");
		
	}

}
