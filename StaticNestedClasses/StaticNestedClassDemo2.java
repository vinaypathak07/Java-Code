class StaticNestedClassDemo2{
	static class Nested{
		public static void main(String[] args){
			System.out.println("static nested class main method");
		}
	} 

	public static void main(String[] args){
		System.out.println("Outer class(StaticNestedClassDemo2) main method ");	
	}
}