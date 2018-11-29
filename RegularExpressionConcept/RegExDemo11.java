// program to display all .txt/.java/.class/.anything files present in desktop/desktop folder/java 
import java.io.*;
import java.util.regex.*;
class RegExDemo11{
	public static void main(String[] args) throws Exception{
		File f =new File("C://Users//Vinay Pathak//Desktop//desktop folder//java");

		String[] s = f.list();
		int count = 0;

//		Pattern p = Pattern.compile("[a-zA-Z0-9_.$]+[.]txt"); // for .text files
		Pattern p = Pattern.compile("[a-zA-Z0-9_.$]+[.]java"); // for .java files
//		Pattern p = Pattern.compile("[a-zA-Z0-9_.$]+[.]class");	// for .class files 	
//		Pattern p = Pattern.compile("[a-zA-Z0-9_.$]+[.](txt|java)");// for both .txt and .java 

		for(String s1 : s){
			Matcher m = p.matcher(s1);

			if(m.find() && m.group().equals(s1)){
				System.out.println(s1);
				count++;
			}
		}
		System.out.println("Total no. of files:"+count);

	}
}