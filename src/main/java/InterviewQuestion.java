import java.util.HashMap;
import java.util.Map.Entry;

public class InterviewQuestion {

	public static void main(String[] args) {

String s="shrilatha";
//count occurence of char in a string
char[] ch=s.toCharArray();
HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
for(char c:ch)
{

if(hm.containsKey(c))
{

 hm.put(c,(hm.get(c))+1);
}else{

 hm.put(c,1);

}

}
for(Entry<Character,Integer> hs: hm.entrySet())
{
	System.out.println(hs.getKey()+""+ "Occurence" +hs.getValue());
}


}

}


