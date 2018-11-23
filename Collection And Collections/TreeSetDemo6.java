//program to insert String and StringBuffer objects into the TreeSet where sorting order is increasing length order.If two objects having same length then consider their alphabetical order.
import java.util.*;
class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2){

		String s1 = obj1.toString();
		String s2 = obj2.toString();

		if(s1.length()>s2.length())
			return 1;
		else if(s1.length()<s2.length())
			return -1;
		else
			return  s1.compareTo(s2);

	}
}
class TreeSetDemo6{
	public static void main(String[] args){

		TreeSet ts = new TreeSet(new MyComparator());

		ts.add("A");

		// ts.add("ABC");

		ts.add(new StringBuffer("ABC"));

		ts.add(new StringBuffer("AA"));

		ts.add("XX");

		ts.add("ABCD");

		ts.add("A");
		System.out.println(ts);
	}
}