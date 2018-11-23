// program to illustrate customized sorting in TreeSet
//To insert Integer objects into the TreeSet where the sorting order is descending order.
import java.util.*;
class MyComparator implements Comparator{
	 public int compare(Object obj1,Object obj2){
	 	Integer I1=(Integer)obj1;
	 	Integer I2=(Integer)obj2;

	 	if(I1<I2)
	 		return 1;
	 	else if(I1>I2)
	 		return -1;
	 	else 
	 		return 0;
	 }
}
class TreeSetDemo2{
	public static void main(String[] args){

		TreeSet ts = new TreeSet(new MyComparator());

			ts.add(10);
			ts.add(0);
			ts.add(15);
			ts.add(20);
			ts.add(20);
			ts.add(-32);

			System.out.println("Elements in TreeSet :"+ts);
		
	}
}