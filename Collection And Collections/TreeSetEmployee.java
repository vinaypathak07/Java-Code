//program to insert our own user defined Employee object into the TreeSet by implementing Comparable and Comparator interface
import java.util.*;
class Employee implements Comparable{

	String name;
	int eid;

	Employee(String name,int eid){
		this.name =name;
		this.eid = eid;
	}

	public String toString(){
		return name+"--"+eid;
	}

	public int compareTo(Object obj){
		int eid1 = this.eid;
		Employee e = (Employee)obj;
		int eid2 = e.eid;

		if(eid1>eid2)
			return 1;
		else if(eid1<eid2)
			return -1;
		else 
			return 0;		
	}
}
class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2){

		Employee e1 = (Employee)obj1;
		Employee e2 = (Employee)obj2;

		String name1 = e1.name;
		String name2 = e2.name;

		//sorting will be performed based on String class compareTo()( which implements Comparable interface ) but not our implemented compareTo() method 
		return name1.compareTo(name2);
	}
}

class TreeSetEmployee{
	public static void main(String[] args){
		
		//Default Natural Sorting Order who has written Employee class
		// By implemeting Comparable interface  
		Employee e1 = new Employee("Dhoni",7);
		Employee e2 = new Employee("Kholi",10);
		Employee e3 = new Employee("Ashwin",15);
		Employee e4 = new Employee("KL Rahul",3);

		TreeSet ts = new TreeSet();
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);

		System.out.println("Employee Details (Default Natural Sorting Order):"+ts);

//		If the user wants his own sorting order based on the name of the employee than he can 
//		do so by passing the MyComparator(which implements Comparator interface) class object in TreeSet			

		TreeSet ts1 = new TreeSet(new MyComparator());
		ts1.add(e1);
		ts1.add(e2);
		ts1.add(e3);
		ts1.add(e4);

		System.out.println("Employee Details (Customized Sorting):"+ts1);

	}
}
