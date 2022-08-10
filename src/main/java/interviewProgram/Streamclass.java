
package interviewProgram;
  
import java.util.*;  
public class Streamclass  
{  
public static void main(String args[])   
{  
String str= "Communication";  

List<Integer> lst=Arrays.asList(4,4,6,3,8,3);
HashSet<Integer> hs=new HashSet<>();

//lst.stream().filter(k-> !hs.add(k)).forEach(System.out::println);
//lst.stream().findFirst().ifPresent(System.out::println);
/*int count=(int) lst.stream().count();
System.out.println(count);*/

/*int max=lst.stream().max(Integer::compare).get();//max element in list
System.out.println(max);*/

lst.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
//System.out.println(lst);

}  
}  