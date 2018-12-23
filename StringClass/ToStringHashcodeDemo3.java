class Test{
	int i;

	Test(int i){
		this.i = i;
	}
	public String toString(){               //overriden toString() of Object class
		return i+"";
	}
	public int hashCode(){                  //overriden hashCode() of Object class
		return i;
	}

	public static void main(String[] args){
		Test t1=new Test(10);

		Test t2=new Test(100);

		System.out.println(t1);   //Test class overriden toString() method will be called which internally further will invoke Test  class overriden hashCode method 

		System.out.println(t2);   // Test class overriden toString() method will be called which internally further will invoke Test class overriden hashCode method 
	}
}