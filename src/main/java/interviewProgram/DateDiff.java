package interviewProgram;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Locale;
import static java.util.Calendar.*;


public class DateDiff {

	public static int getDiffYears(Date first, Date last) {
	    Calendar a = getCalendar(first);
	    Calendar b = getCalendar(last);
	    int diff = b.get(YEAR) - a.get(YEAR);
	    if (a.get(MONTH) > b.get(MONTH) || 
	        (a.get(MONTH) == b.get(MONTH) && a.get(DATE) > b.get(DATE))) {
	        diff--;
	    }
	    return diff;
	}

	public static Calendar getCalendar(Date date) {
			Calendar cal = Calendar.getInstance(Locale.US);
			cal.setTime(date);
			return cal;
	}
	
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Date first=new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2011");
		Date last=new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2018");
		int years=getDiffYears(first,last);
		System.out.println(years);

	}

}
