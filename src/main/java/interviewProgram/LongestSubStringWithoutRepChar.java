package interviewProgram;
import java.util.HashSet;
import java.util.Scanner;

/* write a java program longest substring without repeating character.*/

public class LongestSubStringWithoutRepChar {

	public static String subString(String input){

		HashSet<Character> set = new HashSet<Character>();

		String longestOverAll = "";
		String longestTillNow = "";

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);

			if (set.contains(c)) {
				longestTillNow = "";
				set.clear();
			}
			longestTillNow += c;
			set.add(c);
			if (longestTillNow.length() > longestOverAll.length()) {
				longestOverAll = longestTillNow;
			}
		}

		return longestOverAll;
	}

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		
		System.out.println("Enter String");
		String input = reader.nextLine();
		
		System.out.println(subString(input));
	}
}