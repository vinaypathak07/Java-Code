class BooleanWrapperClass{
	public static void main(String[] args){
		Boolean b1 = new Boolean("yes"); //false 
		Boolean b2 = new Boolean("no");  //false 

		System.out.println(b1.equals(b2)); //true 

		// Imporatant Loop Hole:

		Boolean b3 =new Boolean("true"); //true 
		System.out.println(b3);
		
		Boolean b4 =new Boolean("True"); //true
		System.out.println(b4);
		
		Boolean b5 =new Boolean("TRUE"); //true
		System.out.println(b5);
		
		Boolean b6 =new Boolean("Dhoni"); //false
		System.out.println(b6);

		Boolean b7 =new Boolean("Kohli"); //false
		System.out.println(b7);

		Boolean b8 =new Boolean("Raina"); //false
		System.out.println(b8);

	}
}