package interviewProgram;

public class ConertIntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=123;
		
		//method1
		System.out.println(String.valueOf(i));
		
		//method2
		System.out.println(Integer.toString(i));
		
		//method3 use "+" concatenation operator
		String s=123+"";
		System.out.println(s);
		
		//method4 using string builder
		String s1=new StringBuilder().append( "" ).append(i).toString();
		System.out.println(s1);
		
		

	}

}
