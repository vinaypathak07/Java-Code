 /* All wrapper class objects are immutable i.e once we create wrapper class 
 object we can't perform any changes in that object.If we are trying to perform any changes
 with those changes a new object will be created.*/
class WrapperObjectsImmutablity{
	public static void main(String[] args){
		Integer X= 10;

		Integer Y=X;
		X++;
		System.out.println(X);
		System.out.println(Y);
		System.out.println(X==Y);
	}
}