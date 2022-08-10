package interviewProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * compare and return true or false accpordingly if the content is similar? 
list <string> str = {str1, str10,str11};  
string css = ""str10"",""str1"", ""str1""; 
after gving solution he asked one more his real time bug realted to the same script . 
bug was if one more string added in list  
list <string> str = {str1, str10,str11,str17};  
string css = ""str10"",""str1"", ""str1""; 

List<String> input 1 = {""str1"", ""str2"",""Str3""} 
String input 2 = {""Str3,str1,Str2""} 
Write a method where you compare both and if it is matching get true else function returns false? 

 */
public class CompareArrAndList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list =new ArrayList<String>();
		list.add("str1");
		list.add("str10");
		list.add("str11");
		//list.add("s2");
		
		
		String[] str={"str1", "str10","str11"};
		
		Boolean comp=compareStingList(list,str);
		System.out.println(comp);
	}

	private static Boolean compareStingList(ArrayList<String> list, String[] str) {
		
		Arrays.sort(str);
		Collections.sort(list);
		Boolean comp=true;
		Iterator<String> it=list.iterator();
		int i=0;
		while(it.hasNext() && i<str.length)
		{
			if(!it.next().equals(str[i]))
			{
				comp=false;
			}
			i++;
		}
		return comp;
	}

}
