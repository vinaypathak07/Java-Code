import java.util.*;
import static java.util.Arrays.*;
class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2){
		String s1 = obj1.toString();
		String s2 = obj2.toString();

		return s2.compareTo(s1);
	}
}
class ArraysSearchDemo{
	public static void main(String[] args){

		//::::::::::::::::Searching in Primitive Arrays:::::::::::::::::://
		int a[] = {10,5,20,11,6};
		//For Searching the arrays need to be sorted
		Arrays.sort(a); // Sort by Default Natural Sorting Order
		System.out.print("Primitive Arrays After Sorting :");
		for(int a1:a){
			System.out.print(a1+"|"); 
		}
		System.out.println();
		System.out.println("6 is present at index :"+Arrays.binarySearch(a,6)); //1
		System.out.println("14 insertion point :"+Arrays.binarySearch(a,14)); // -5

		//::::::::::::::::Searching In Object Arrays::::::::::::::::::::://
		String s[] = {"Akshit","Mohit","Akshat","Vinay","Shivank"};

		Arrays.sort(s);
		System.out.print("Default Natural Sorting Of Arrays:");
		for(String s1:s){
			System.out.print(s1+"|");   // Arrays After Sorting 
		} 
		System.out.println();
		System.out.println(binarySearch(s,"Mohit")); //2  (binarySearch is static method and can be called directly because of static import Of Arrays)
		System.out.println(binarySearch(s,"Anadi")); //-3 (binarySearch is static method and can be called directly because of static import Of Arrays)

		Arrays.sort(s,new MyComparator()); // Customized Sorting Of Arrays
		System.out.print("Customized Sorting Of Object Array:");
		for(String s1:s){
			System.out.print(s1+"|");
		}
		System.out.println();

		System.out.println(binarySearch(s,"Akshit",new MyComparator()));
		System.out.println(binarySearch(s,"Jayant",new MyComparator()));

	}
}