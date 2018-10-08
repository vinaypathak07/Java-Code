// program to check for the valid mail id entered from command prompt.
import java.util.regex.*;
class RegExDemo8{
	public static void main(String[] args){
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z]+[.][a-zA-Z0-9]+");  // Regular Expression to check for 10 digit valid mobile number
		Matcher m = p.matcher(args[0]);

	//	if(m.find()){    //Incorrect-- compile and see the result 
		if(m.find() && m.group().equals(args[0])){  // Correct---Compile and see the result	
			System.out.println(" Mail id is valid");
		}
		else {
			System.out.println("Mail id is invalid");
		}
	}
}