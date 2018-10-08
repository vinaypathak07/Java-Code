// program to illustrate use of split() according to .(Dot) character
import java.util.regex.*;
class RegExDemo6{
	public static void main(String[] args){

//		Pattern p = Pattern.compile(".");  // no output (as .(Dot) matches any character and except any character nothing is left)

//      To solve the above problem 
		Pattern p = Pattern.compile("\\.");

		String[] s = p.split("www.geeksforgeeks.com");

		for(String s1 : s){
			System.out.println(s1);
		}
	}
}