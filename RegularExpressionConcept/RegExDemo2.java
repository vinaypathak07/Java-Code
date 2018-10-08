import java.util.regex.*;
class RegExDemo2{
	public static void main(String[] args){
		Pattern p =Pattern.compile("[^a-zA-Z0-9]");  // Pattern can be : [abc],[^abc],[a-z],[A-Z],[a-zA-Z],[0-9],[0-9a-zA-Z],[^0-9a-zA-Z]
		Matcher m = p.matcher("a3bF#k@9z");

		while(m.find()){
			System.out.println("Starting Index :"+m.start()+"...... Matched Pattern:"+m.group());
		}

	}
}