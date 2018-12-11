class StaticNestedClasses{
	static class Nested{
		public void m1(){
				System.out.println("Static Nested class method");
		}
	}

	public static void main(String[] args){
		Nested n = new Nested();                 //static nested do not have strong association with outer class object
		n.m1();
	}
}	

