import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner reader=new Scanner(System.in);
System.out.println("Enter number");
int number=reader.nextInt();
int rev=0;
while(number!=0)
{
	int r=number%10;
	rev=(rev*10)+r;
	number=number/10;
}
System.out.println("Reverse a number");
System.out.println(rev);
	}

}
