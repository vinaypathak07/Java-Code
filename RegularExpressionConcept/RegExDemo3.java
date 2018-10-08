// program to illustrate the use of predefined characters classes 
import java.util.regex.*;
class RegExDemo3{
	public static void main(String[] args){
//		Pattern p = Pattern.compile("\s"); // CE:Illegal Escape Character
		Pattern p = Pattern.compile(".");  // .(Dot) matches any character.Try for //s,//S,//d,//D,//w,//W,
		Matcher m = p.matcher("a7b k@9z");

		while(m.find()){

			System.out.println("Starting Index :"+m.start()+"..... Pattern Matched:"+m.group());
		}
	}
}
