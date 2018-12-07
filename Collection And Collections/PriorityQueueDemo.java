// PriorityQueue for default natural sorting order
import java.util.*;
public class PriorityQueueDemo{
	public static void main(String[] args){
		PriorityQueue pq  = new PriorityQueue(); // creates empty priority queue with default initial capacity =11
		
		System.out.println(pq.peek()); // null -----peek function return head element in PQ.If PQ is empty ,it returns null
		System.out.println(pq.element()); // RE:NSEE(NoSuchElementException) element function return head element in PQ.If PQ is empty ,it returns RE 		

		for(int i=0;i<11;i++){
			pq.offer(i); // to add element to PriorityQueue
		}

		System.out.println(pq); // [0,1,2,3,4,5.......10]
		pq.poll(); // it removes and returns head element of PQ 
		System.out.println(pq); //[1,2,3,4,5........10] // Some Operating System don't provide support for PriorityQueue

	}
} 