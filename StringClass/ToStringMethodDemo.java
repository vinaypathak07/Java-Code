class Student{
	String name;
	int rno;

	Student(String name,int rno){
		this.name= name;
		this.rno=rno;
	}
	//	To provide our own string representation we can override toString() method of object class.
	public String toString(){
		return getClass().getName()+"@"+name+"....."+rno;
	}

	public static void main(String[] args){
		Student s1 = new Student("Akshat",101);
		Student s2 = new Student("Akshit",102);

		System.out.println(s1);            // jvm internally calls toString() method
		System.out.println(s1.toString()); //Object class toString() will be called if toString() is not overriden to provide our own implemetation
										// toString() method used to get string representation of object 
		System.out.println(s2);
	}
}

