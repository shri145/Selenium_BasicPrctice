package interviewProgram;

public class MathOperation {

	static int number2=getValue();
	
	static int number1=10;
	 static int getValue() {
			// TODO Auto-generated method stub
			return number1;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(doSum());
		System.out.println(doMinus());

	}
	private static int doMinus() {
		// TODO Auto-generated method stub
		return number1-number2;
	}
	private static int doSum() {
		// TODO Auto-generated method stub
		return number1+number2;
	}
	

}
