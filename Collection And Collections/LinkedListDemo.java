// program to illustrate linked list in java
import java.util.LinkedList;
class LinkedListDemo{ 
	public static void main(String[] args){
		LinkedList l = new LinkedList();

		l.add("DIT");
		l.add(123);
		l.add("University");
		l.add(null);

		System.out.println(l);

		l.set(0,"Dehradun");
		l.add(0,"Institute");

		System.out.println(l);

		l.removeLast();
		l.addFirst("Technology");

		System.out.println(l);
	}
}