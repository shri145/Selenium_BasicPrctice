package interviewProgram;

public class InnerClass {

	private class InnerClass1
	{
		public void display()
		{
		System.out.println("Hello");
		}
	}
	
	void diplay_inner()
	{
		InnerClass1 ic=new InnerClass1();
		ic.display();
	}
	
	
	
	public static void main(String[] args) {
		InnerClass s=new InnerClass();
		s.diplay_inner();
		// TODO Auto-generated method stub
	}
	
}



