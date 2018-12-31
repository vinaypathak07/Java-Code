// program to illustrate  RE:ConcurrentModificationException--------Need Of Concurrent Collections
import java.util.*;
class NeedOfConcurrentCollections extends Thread{
	static ArrayList al = new ArrayList();  

	public void run(){
		try{
			Thread.sleep(2000);
		}catch(Exception e){

		}
		System.out.println("Child Thread Modifying Collection(ArrayList) object");
		al.add("A");
	}
	public static void main(String[] args) throws InterruptedException{
		NeedOfConcurrentCollections ob = new NeedOfConcurrentCollections();
		ob.start(); // child thread starts executing

		al.add("Z");
		al.add("B");
		al.add("K");

		Iterator itr = al.iterator();
		while(itr.hasNext()){
			String s = (String)itr.next();
			System.out.println("Main Thread Iterating ArrayList And Current Object Is :"+s);
			Thread.sleep(3000);
		}
	}
}