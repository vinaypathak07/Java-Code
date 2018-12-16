class Student {
	String name;
	int rno;

	Student(String name,int rno){
		this.name=name;
		this.rno=rno;
	}
	public boolean equals(Object obj){
		if(obj==this){
			return true; 
		}
		if(obj instanceof Student){
			Student s =(Student)obj;
			if(name.equals(s.name) && rno==s.rno){
				return true;
			}
			else {
				return false;
			}
		}
		
		return false;
		
	}

	public static void main(String[] args){
		Student s1 = new Student("Michael",101);

		Student s2 = new Student("Steffi",102);

		Student s3 = new Student("Michael",101);  //s1 and s3 are references pointing to different content having the same value 

		Student s4 = s1;          //s1 and s4 are references pointing to the same content

		System.out.println(s1.equals(s2));   //False
		System.out.println(s1.equals(s3));	//true    
		System.out.println(s1.equals(s4));	//True
		System.out.println(s1.equals("Michael")); //false 
		System.out.println(s1.equals(null));  //false 
 	}
}