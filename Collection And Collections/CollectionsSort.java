// program to illustrate default natural sorting of Collection object
import java.util.*;
class CollectionsSort{
	public static void main(String[] args){

		ArrayList al  = new ArrayList();

		al.add("Z");
		al.add("K");
		al.add("A");
		al.add("N");

		System.out.println("Before Sorting :"+al); // [Z,K,A,N]

		Collections.sort(al);  // sorting is performed on the same ArrayList object

		System.out.println("After Sorting :"+al); // [A,K,N,Z]
	}
}