//program to show the object should be homogeneous and comparable
import java.util.*;
class TreeSetDemo{
	public static void main(String[] args){
		TreeSet<StringBuffer> ts =new TreeSet<StringBuffer>();

		ts.add(new StringBuffer("A"));
		ts.add(new StringBuffer("Z"));
		ts.add(new StringBuffer("L"));
		ts.add(new StringBuffer("B"));
		ts.add(new StringBuffer("O"));

		System.out.println(ts); // RunTimeException :ClassCastException
	}

}