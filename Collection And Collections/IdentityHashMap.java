import java.util.*;
public class IdentityHashMapDemo{
	public static void main(String[] args){
		//HashMap m =new HashMap();
		IdentityHashMap m = new IdentityHashMap(); // Uncomment this line and see the difference

		Integer I1 = new Integer(10);
		Integer I2 = new Integer(10);

		m.put(I1,"Messi");
		m.put(I2,"Ronaldo");

		System.out.println(m); 
	}
}