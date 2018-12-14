import java.util.*;
public class WeakHashMapDemo{
	public static void main(String[] args) throws Exception{
		//	HashMap m = new HashMap();// uncomment this line to see the change in behaviour of garbage collector
		WeakHashMap m  = new WeakHashMap();
		Temp t = new Temp();

		m.put(t,"Vinay");
		System.out.println(m);
		t=null;
		System.gc();
		Thread.sleep(5000);
		System.out.println(m);
	}
}
class Temp{
	// this method will be automatically invoked by jvm while printing the Temp class reference variable 
	public String toString(){
		return "Temp";
	}
	// this method will be invoked by garbage collector to destroy the temp object
	public void finalize(){
		System.out.println("finalize method called");
	}
}