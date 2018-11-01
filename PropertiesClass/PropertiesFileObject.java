import java.util.*; // Properties object present in  java.util package
import java.io.*;
class PropertiesFileObject{
	public static void main(String[] args) throws Exception{
		Properties p  = new Properties(); // present in java.util package
		FileInputStream fis   = new FileInputStream("abc.properties"); // InputStream to read from properties file
		p.load(fis);       // load from properties file through FileInputStream into Properties object	
        System.out.println(p); // view all the properties stored in properties object
        
		String s = p.getProperty("username");
		System.out.println(s);  // to view the propertyValue belonging to propertyName username

		FileOutputStream fos = new FileOutputStream("abc.properties");
		//Imp Concept --- we need not re-compile in cmd to set new Property 
		p.setProperty("branch","computer science"); // to add new propertyName and propertyValue to Properties File
		p.store(fos,"Updated by Vinay");  // to write from Properties Object to Properties File through FileOuputStream 
	}
}