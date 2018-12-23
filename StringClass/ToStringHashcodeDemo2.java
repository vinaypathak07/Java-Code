class Test{
	int i;

	Test(int i){
		this.i = i;
	}
	public int hashCode(){
		return i;
	}

	public static void main(String[] args){
		Test t1=new Test(10);

		Test t2=new Test(100);

		System.out.println(t1);   // Object class toString() method will be called which internally further will invoke Test  class overriden hashCode method 

		System.out.println(t2);   // Object class toString() method will be called which internally further will invoke Test class overriden hashCode method 
	}
}