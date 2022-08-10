

//i/p:abcd123d5;o/p:11 

public class AddOnlyIntInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abcd123d5";
		int sum=0;
		char[] ch=s.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isDigit(ch[i]))
			{
				sum=sum+Integer.parseInt(String.valueOf(ch[i]));
			}
		}
		
		System.out.println("Sum= "+sum);
		
		

	}

}
