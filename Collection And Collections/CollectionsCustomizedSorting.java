//Program to illustrate Customized Sorting Collection object
import java.util.*;
class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2){
		String s1 = obj1.toString();
		String s2 = obj2.toString();

		return s2.compareTo(s1);       // sorting in descending order 
	}
}
class CollectionsCustomizedSorting{
	public static void main(String[] args){

		ArrayList al =  new ArrayList();

		al.add("Z");
		al.add("K");
		al.add("A");
		al.add("N");

		System.out.println("Before Sorting :"+al); // [Z,K,A,N]

		Collections.sort(al,new MyComparator());

		System.out.println("After Sorting :"+al); // [Z,N,K,A]
	}
}