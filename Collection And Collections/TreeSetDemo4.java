// program to insert String objects into the TreeSet in the reverse alphabetical order.
import java.util.*;
class MyComparator implements Comparator {
	public int compare(Object obj1,Object obj2){

		String s1 = (String)obj1;

		String s2 = obj2.toString();

		return s2.compareTo(s1);
	}
} 

class TreeSetDemo4 {
	public static void main(String[] args){

		TreeSet ts =new TreeSet(new MyComparator());

		ts.add("Messi");
		ts.add("Ronaldo");
		ts.add("Ramos");
		ts.add("Neymar");
		ts.add("Antony Griezmann");
		ts.add("Diego Costa");

		System.out.println(ts);
	} 
}