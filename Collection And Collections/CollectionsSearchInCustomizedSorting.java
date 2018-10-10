//Searching in Customized Sorted List
import java.util.*;
class MyComparator implements Comparator {
	public int compare(Object obj1,Object obj2){
		Integer I1 = (Integer)obj1;
		Integer I2 = (Integer)obj2;

		return I2.compareTo(I1);
	}
}
class CollectionsSearchInCustomizedSorting{
	public static void main(String[] args){

		ArrayList al = new ArrayList();

		al.add(15);
		al.add(0);
		al.add(20);
		al.add(10);
		al.add(5);

		System.out.println("Before Sorting :"+al); //[15,0,20,10,5]

		Collections.sort(al,new MyComparator()); // customized sorting 

		System.out.println("After Sorting :"+al);//[20,15,10,5,0]

		System.out.println(Collections.binarySearch(al,10,new MyComparator())); // 2(Index)
		System.out.println(Collections.binarySearch(al,13,new MyComparator())); // -3(InsertionPoint)---13 is not present 
		System.out.println(Collections.binarySearch(al,17));// unpredictable result (because Comparator object is not passed)
       	System.out.println(Collections.binarySearch(al,17,new MyComparator()));//-2 (InsertionPoint)
	}
}