import java.util.*;
class CollectionsReversingList{
	public static void main(String[] args){
		ArrayList al = new ArrayList();

		al.add(15);
		al.add(0);
		al.add(20);
		al.add(10);
		al.add(5);

		System.out.println("Original List :"+al);

		Collections.reverse(al); // Reversing the elements in List

		System.out.println("Reversed List :"+al);
	}
}