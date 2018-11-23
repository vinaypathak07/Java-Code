// various other implementation of compare method 
import java.util.*;
class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2){

		Integer I1 = (Integer)obj1;
		Integer I2 = (Integer)obj2;

	//	return I1.compareTo(I2);   // {Ascending Order}[0,5,10,15,20]

	//	return -I1.compareTo(I2);  // {Descending Order}[20,15,10,5,0]

		return I2.compareTo(I1);   // {Descending Order}[20,15,10,5,0]

	//	return -I2.compareTo(I1);  // {Ascending Order}[0,5,10,15,20]

	//	return +1;               // {Insertion Order}  [10,0,5,15,20,20]

	//	return -1;              // {Reverse Of Insertion Order} [20,20,15,5,0,10] 

	//	return 0;               // {Only 1st element will be inserted and remaining are duplicates}[10]
	}
}
class TreeSetDemo3{
	public static void main(String[] args){

		TreeSet ts =new TreeSet(new MyComparator());

		ts.add(10);
		ts.add(0);
		ts.add(5);
		ts.add(15);
		ts.add(20);
		ts.add(20);

		System.out.println(ts);
	}
}