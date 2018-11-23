// program to insert StringBuffer objects into the TreeSet
import java.util.*;
class MyComparator implements Comparator {
	public int compare(Object obj1,Object obj2){

		String s1= obj1.toString();

		String s2 = obj2.toString();

		return s1.compareTo(s2);// {Ascending Order}
		//return s2.compareTo(s1);// {Descending Order}
	}
} 
class TreeSetDemo5{
	public static void main(String[] args){

	//	TreeSet ts =new TreeSet(); // RE:ClassCastException
		TreeSet ts = new TreeSet(new MyComparator());  

		ts.add("A");
		ts.add("Z");
		ts.add("K");
		ts.add("L");

		System.out.println(ts);
	}
}