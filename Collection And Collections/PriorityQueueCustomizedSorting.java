//program to illustrate customized sorting of priority queue
import java.util.*;
class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2){
		String s1 = (String)obj1;
		String s2 = obj2.toString();

		return s2.compareTo(s1);
	}
}
public class PriorityQueueCustomizedSorting{
	public static void main(String[] args){
		PriorityQueue pq = new PriorityQueue(15,new MyComparator());

		pq.offer("A");
		pq.offer("Z");
		pq.offer("L");
		pq.offer("B");

		System.out.println(pq); // [Z,L,B,A] // Customized Sorting Order
	}
}