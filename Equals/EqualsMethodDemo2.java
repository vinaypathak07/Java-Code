class Student {
	String name;
	int rno;

	Student(String name,int rno){
		this.name=name;
		this.rno=rno;
	}
	// overriding Object class .equals method
	public boolean equals(Object obj){
		try {String name1= this.name;               // String name1=name;----this is also correct
		int rno1=this.rno;                          // int rno1=rno;-----this is also correct

		Student s=(Student)obj;	
		String name2 = s.name;
		int rno2 = s.rno;

		if(name1.equals(name2) && rno1==rno2){
			return true;
		}
		else {
			return false;
			}
		}
		catch(ClassCastException e){
			return false;
		}	
		catch(NullPointerException e){
			return false;
		}
	}

	public static void main(String[] args){
		Student s1 = new Student("Michael",101);

		Student s2 = new Student("Steffi",102);

		Student s3 = new Student("Michael",101);  //s1 and s3 are references pointing to different content having the same value 

		Student s4 = s1;          //s1 and s4 are references pointing to the same content

		System.out.println(s1.equals(s2));   //False -here .equals method is resposible for content comparison
		System.out.println(s1.equals(s3));	//True   -here .equals method is resposible for content comparison

		System.out.println(s1.equals(s4));	//True  -here .equals method is resposible for content comparison
		System.out.println(s1.equals("Michael"));  // returns ClassCastException if exception not handled
		System.out.println(s1.equals(null));
	}
}