import java.util.*;
class Test{
	public String toString(){
		return "Test class object";
	}

	public static void main(String[] args){
		String s = new String("This is me");
		System.out.println(s);           // String class overriden toString() method is called 

		Integer i =new Integer(10);      
		System.out.println(i);			// Integer class overriden toString() method is called

		ArrayList al = new ArrayList();   
		al.add("A");
		al.add("B");
		System.out.println(al);         // ArrayList class overriden toString() method is called

		Test t =new Test();
		System.out.println(t);           //Test class overriden toString() method is called

	}
}