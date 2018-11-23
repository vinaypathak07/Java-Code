//program to illustrate the functionality of TreeSet  
import java.util.*;
class TreeSetDemo{
	public static void main(String[] args){

		TreeSet ts =new TreeSet();

		ts.add("A");
		ts.add("a");
		ts.add("C");
		ts.add("F");
		ts.add("Z");

//		ts.add(new Integer(10)); // heterogeneous object not allowed-------ClassCastException */
//     ts.add(null); // NullPointerException

		System.out.println(ts);
	}
}