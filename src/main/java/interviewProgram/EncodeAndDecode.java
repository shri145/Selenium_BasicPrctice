package interviewProgram;

import java.util.Base64;

public class EncodeAndDecode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="India Team will win the Cup";
		String dc="SW5kaWEgVGVhbSB3aWxsIHdpbiB0aGUgQ3Vw";
		try {
		//byte[] dec=Base64.getDecoder().decode(s);
			//----------------------------------------
			
			
			byte[] actualByte = Base64.getDecoder()
                    .decode(dc);

String actualString = new String(actualByte);
System.out.println(actualString);
		//---------------------------------------------------
		//String n=Base64.getEncoder().encodeToString(dec);
		String BasicBase64format = Base64.getEncoder().encodeToString(s.getBytes());
		System.out.println(BasicBase64format);
		//System.out.println(n);
		}
		catch(Exception e)
		{
			
			System.out.println(e);
		}
		
		
		
	//System.out.println(n);
		
	}

}
