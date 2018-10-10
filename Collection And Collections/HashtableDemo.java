// program to illustrate Hashtable 
import java.util.*;
class Temp{
	int i;
	Temp(int i){
		this.i=i;
	}
	public int hashCode(){ // overriden methods of Object class  
		return i;          // insertion order is based on hashCode(Memory Representation in Copy)
		//return i%9;          //if we change the hashCode---insertion order is also changed
	}
	public String toString(){ // overriden methods of Object class
		return i+"";
	}
}
class HashtableDemo{
	public static void main(String[] args){
		//Hashtable ht  = new Hashtable(); // default initialCapacity=11
		Hashtable ht  = new Hashtable(25); //if we change the intialCapacity=25,then the insertion     order of keys and values will also get changed
		ht.put(new Temp(5),"A"); 
		ht.put(new Temp(2),"B");
		ht.put(new Temp(6),"C");
		ht.put(new Temp(15),"D");
		ht.put(new Temp(23),"E");
		ht.put(new Temp(16),"F");

		System.out.println(ht); // {6=C,16=F,5=A,15=D,2=B,23=F}
	}
}