// Sorting in primitive type arrays and object type arrays
import java.util.*;
class MyComparator implements Comparator {
	public int compare(Object obj1,Object obj2){
		String s1 = obj1.toString();
		String s2 = obj2.toString();

		return s2.compareTo(s1);
	}
}
class ArraysSortingDemo{
	public static void main(String[] args){
		//:::::::::::::::::::: Primitive Arrays Sorting:::::::::::::::::::::://
		int a[] = {10,5,20,11,6};
		System.out.print("Primitive Array Before Sorting :");

		for(int a1:a){
			System.out.print(a1+"|");
		}
		System.out.println();
		Arrays.sort(a); // Sorting primitive array according to default natural sorting order
		System.out.print("Primitive Array After Sorting :");
		for(int a1:a){
			System.out.print(a1+"|");
		}
		System.out.println();
		//::::::::::::::::::::: Object Arrays Sorting::::::::::::::::::::::://
		String s[] = {"A","Z","D","B"}; 
		System.out.print("Object Arrays Before Sorting :");

		for(String s1:s){
			System.out.print(s1+"|");
		}
		System.out.println();

		Arrays.sort(s); // Sorting object array according to default natural sorting order
		System.out.print("Object Array After Sorting :");

		for(String s1:s){
			System.out.print(s1+"|");
		}
		System.out.println();
		// :::::::::::::::::::Object Arrays Customized Sorting::::::::::::::::::::::::://
		Arrays.sort(s,new MyComparator()); // Sorting object array according to customized sorting
		System.out.print("Object Array After Customized Sorting :");

		for(String s1:s){
			System.out.print(s1+"|");
		} 
	}
}