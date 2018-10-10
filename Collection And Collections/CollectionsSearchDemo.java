//Searching in Default Natural Sorted List
import java.util.*;
class CollectionsSearchDemo{
	public static void main(String[] args){

		ArrayList al  = new ArrayList();

		al.add("Z");
		al.add("A");
		al.add("L");
		al.add("K");
		al.add("a");

		System.out.println("Before Sorting :"+al); // [Z,A,L,K,a]

		Collections.sort(al);   // default natural sorting order

		System.out.println("After Sorting :"+al); // [A,K,L,Z,a]

		System.out.println(Collections.binarySearch(al,"Z")); //searching in default  natural sorting order
		System.out.println(Collections.binarySearch(al,"J")); // searching in default natural sorting order
	}
}