import java.util.*;
class NavigableMapDemo{
	public static void main(String[] args){

		TreeMap<String,String> tm  = new TreeMap<String,String>();

		tm.put("b","banana");
		tm.put("c","cocunut");
		tm.put("a","apple");
		tm.put("d","dog");
		tm.put("g","grapes");

		System.out.println(tm);     //{a=apple,b=banana,c=cocunut,d=dog,g=grapes}-----default natural sorting order---ascending order

		System.out.println(tm.ceilingKey("c"));//c --highest element >=c
		System.out.println(tm.higherKey("e"));  //g-- highest element >e
		System.out.println(tm.floorKey("e"));	//d-- lowest element <=e
		System.out.println(tm.lowerKey("e"));  //d-- lowest element < e
		System.out.println(tm.pollFirstEntry());	//a=apple--remove and return the first element
		System.out.println(tm.pollLastEntry());   //g=grapes-- remove and return the last element 
		System.out.println(tm.descendingMap()); //{d=dog,c=cocunut,b=banana}-- NavigableSet in reverse Order

		System.out.println(tm); // {b=banana,c=cocunut,d=dog}

	}
}