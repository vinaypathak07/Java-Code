// program to illustrate the use of quantifiers
import java.util.regex.*;
class RegExDemo4{
	public static void main(String[] args){
		Pattern p =Pattern.compile("a+"); // quantifiers (to match no. of occurences) try for a,a*,a?
		Matcher m = p.matcher("abaabaaab");

		while(m.find()){
			System.out.println("Starting Index:"+m.start()+"...... Pattern Matched:"+m.group());
		}
	}
}