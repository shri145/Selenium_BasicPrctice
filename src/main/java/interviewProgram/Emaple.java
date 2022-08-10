package interviewProgram;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Emaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "geeksforgeeks";
		
		HashMap<Character,Integer> h=new HashMap<Character, Integer>();
		
		char[] ch=s.toCharArray();
		
		for(char c:ch)
		if(h.containsKey(c))
		{
			h.put(c, (h.get(c))+1);
		}
		else
		{
			h.put(c, 1);
		}
		
		
		for(Entry<Character, Integer> entry :h.entrySet())
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
			
			
		}
		
		}


	}


