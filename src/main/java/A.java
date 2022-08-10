

class classA {
	
	public void m1() {
		System.out.println("m1");
		
		// TODO Auto-generated method stub

	}
	
	public void m2() {
		System.out.println("m2");
		
		

	}
}

class classB extends classA
{
	public void m1() {
		System.out.println("m1 in B");
		
		// TODO Auto-generated method stub

	}
	
	public void m3() {
		System.out.println("m3");
		
		

	}
}

public class A
{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		classA obj1= new classB(); 
		obj1.m1(); 
		classA obj2=new classB(); 
		//obj2.m3();


	}

}
