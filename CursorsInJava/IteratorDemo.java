//program to illustrate the functionality of Iterator cursor
import java.util.*;
class IteratorDemo{
	public static void main(String[] args){

		ArrayList al = new ArrayList();

		for(int i=0;i<=10;i++){
			al.add(i);
		}

		System.out.println(al);

		Iterator itr = al.iterator();

		while(itr.hasNext()){
			Integer I = (Integer)itr.next();

			if(I%2==0)
				System.out.println(I);
			else
				itr.remove();
		}

		System.out.println(al);
	}
}