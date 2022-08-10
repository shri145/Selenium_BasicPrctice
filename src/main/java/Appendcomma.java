

import java.text.NumberFormat;
import java.util.Locale;


//Input : String str =""1234567"" Output: ""1,234,567"" (append comma after every 3 digits) 

public class Appendcomma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="1234567";
		
		int i=Integer.parseInt(str);
		System.out.println(NumberFormat.getInstance().format(i));
		
		System.out.println(NumberFormat.getInstance(Locale.GERMAN).format(i));
		

	}

}
