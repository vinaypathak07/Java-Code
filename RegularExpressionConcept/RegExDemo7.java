// program to check for the valid mobile no. entered from command prompt.
import java.util.regex.*;
class RegExDemo7{
	public static void main(String[] args){
		Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");  // Regular Expression to check for 10 digit valid mobile number
		Matcher m = p.matcher(args[0]);

	//	if(m.find()){    //Incorrect-- compile and see the result 
		if(m.find() && m.group().equals(args[0])) { // Correct---Compile and see the result	
			System.out.println(" Mobile number is valid");
		}

		else {
			System.out.println("Mobile number is invalid");
		}
	}
}