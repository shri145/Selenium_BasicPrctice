

import java.util.ArrayList;

public class AddTwoInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=-10;
		int b=-20;
		int sum=add(a,b);
		System.out.println(sum);
		
	}

	private static int add(int a, int b) {
		// TODO Auto-generated method stub
		
		while (b != 0){
            int carry = (a & b) ; //CARRY is AND of two bits
           // System.out.println(carry);
            a = a ^b; //SUM of two bits is A XOR B
           // System.out.println(a);
            b = carry << 1; //shifts carry to 1 bit to calculate sum
          //  System.out.println(b);
        }
        return a;
	}
}
