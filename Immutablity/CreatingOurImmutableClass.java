// Imp :Creating Our Own Immutable Class.
final class Test{
	private int i=10;
 	Test(int i){
		this.i = i;
	}

	public Test modify(int i){
		if(this.i==i){
			return this;   //returns the existing object on which the modify method has been invoked.
		}
		else {
			return (new Test(i));  //returns the new Test object
		}
	} 

	public static void main(String[] args){
		Test t1 = new Test(10);

		Test t2 = t1.modify(100);  // there is change in the state of existing object(t1(i=100)).Hence new object will be created

		Test t3 = t1.modify(10);  //there is no change in the state of existing object(t1(i=10)).Hence new object won't be created,existing object(t1) will be reused.     

		System.out.println(t1==t2);
		System.out.println(t1==t3);		
	}
}