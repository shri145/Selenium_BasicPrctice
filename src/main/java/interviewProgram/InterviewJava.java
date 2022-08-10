package interviewProgram;

public class InterviewJava {

	public static int Solution(int a, int b) 
		{
			String s1,s2;
			
			s1=String.valueOf(a);
			s2=String.valueOf(b);
			
			if(s1.contains(s2))
			{
			return s1.indexOf(s2);
			}
			else
			{	
			return -1;
			}
			
		}
		
		public static void main(String args[])
		{
			int a=195378678;
			int b=8;
			
			int pos=Solution(a,b);
			System.out.println(pos);
			
		}

}
