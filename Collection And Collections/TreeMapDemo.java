import java.util.*;
public class TreeMapDemo{
	public static void main(String[] args){

		TreeMap tm = new TreeMap();
		tm.put(100,"ZZZ");
		tm.put(103,"YYY");
		tm.put(102,"XXX");
		tm.put(101,106);

	//	tm.put("FFF","XXX");// ClassCastException-----Heterogeneous objects not allowed in default natural sorting order
	//	m.put(null,"XXX");// NullPointerException

		System.out.println(tm); // {100=ZZZ,101=106,102=XXX,103=YYY}
		
	}
		
}