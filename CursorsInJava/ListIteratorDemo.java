//program to illustrate the use of ListIterator cursor
import java.util.*;
class ListIteratorDemo{
	public static void main(String[] args){

		LinkedList l =new LinkedList();
		l.add("Ronaldo");
		l.add("Griezmann");
		l.add("Messi");
		l.add("Diego");

		System.out.println(l); // [Ronaldo,Griezmann,Messi,Diego]

		ListIterator ltr = l.listIterator();

		while(ltr.hasNext()){

			String s = (String)ltr.next();

			if(s.equals("Griezmann"))
				ltr.add("Neymar");			//[Ronaldo,Griezmann,Neymar,Messi,Diego]
			else if(s.equals("Diego"))
				ltr.set("Ramos");			//[Ronaldo,Griezmann,Neymar,Messi,Ramos]
			else if(s.equals("Messi"))
				ltr.remove();                //[Ronaldo,Griezmann,Neymar,Ramos]
			System.out.println(l);
		}

		System.out.println(l);        //[Ronaldo,Griezmann,Neymar,Ramos]
	}
}