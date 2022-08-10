import java.util.Scanner;

public class palindomenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//given 12321
		//op:yes
		//branh changes
		int xx=0;
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter number");
		int number=reader.nextInt();
		//reverse no and check
		int given=number;
		int rev=0;
		while(number!=0)
		{
			int r=number%10;
			rev=(rev*10)+r;
			number=number/10;
		}

		System.out.println("Reverse:"+rev);
		if(rev==given)
		{
			System.out.println("Palindrome");
		}else
		{
			System.out.println("Not Palindrome");
		}
	}

}
