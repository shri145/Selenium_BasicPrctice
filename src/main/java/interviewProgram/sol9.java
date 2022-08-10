package interviewProgram;

public class sol9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s3 = "AABBCCC"; 
		int start = 1; 
		char end = 5; 
		System.out.println(start + end); 
		System.out.println(s3.substring(start, end)); 
		
		String x = "abc"; 
		String y = "abc"; 
		x.concat( y ); 
		String x3=x.concat( y ); 
		System.out.println(x); 
		System.out.println(x3); 
		
		String name="sangeetha";
		name=name.replaceAll("[a|e|i|o|u]*","");
		System.out.println("name:"+name);
		
		
		



	}

}
