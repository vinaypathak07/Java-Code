// program to find the occurences of matching pattern in particular string
import java.util.regex.*;
class RegularExpressionDemo{
	public static void main(String[] args){
		Pattern p =Pattern.compile("ab");
		Matcher m =p.matcher("abbabbba");

		int count = 0;
		while(m.find()){
				count++;
				System.out.println("Starting Index : "+m.start()+".... Ending Index(end index +1):"+m.end()+"..... Matched Pattern:"+m.group());
		}

		System.out.println("No. of Occurences Of The Matching Pattern:"+count);
	}
}