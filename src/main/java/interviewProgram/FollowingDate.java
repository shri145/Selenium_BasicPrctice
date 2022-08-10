package interviewProgram;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FollowingDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		String dt = "06/08/2016";  
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(sdf.parse(dt));
		
		c.add(Calendar.DATE, 1); 
		dt = sdf.format(c.getTime());  
		System.out.println(dt);
	}
}
