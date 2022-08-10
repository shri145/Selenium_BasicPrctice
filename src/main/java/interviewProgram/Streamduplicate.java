package interviewProgram;
import java.util.*;
import java.util.stream.*;

public class Streamduplicate {

	
	
	    public static void main(String args[]) {
	            List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
	            Set<Integer> set = new HashSet<Integer>();
	            myList.stream().filter(i -> !set.add(i)).forEach(System.out::println);
	                 
	                 
	    }
	}


