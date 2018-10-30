//  Compiles Fine 
/*
class Test{
	static Integer I =0;

	public static void main(String[] args){
		int m = I;
		System.out.println(m);
	}
}
*/
//  RuntimeException: NullPointerException
class Test {
	static Integer I ;  //by default wrapper object has null value

	public static void main(String[] args){
		int m = I;       // after compilation ----- int m = I.intValue() -----On null value we are calling intValue() method----therefore we get NullPointerException here.                  
		System.out.println(m);
	}
}
