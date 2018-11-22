//program to illustrate the capacity in Vector
import java.util.Vector;
class VectorDemo{
	public static void main(String[] args){

		//Vector v =new Vector();
		//Vector v =new Vector(25);
	    Vector v =new Vector(10,5);

		System.out.println(v);
		System.out.println(v.capacity());

		for(int i=1;i<=10;++i){
			v.addElement(i);      // internally Autoboxing will be performed(primitive will be converted to object)
		}
		System.out.println(v);
 		System.out.println(v.capacity());

		v.addElement("A");

		System.out.println(v);
		System.out.println(v.capacity());
	}
}