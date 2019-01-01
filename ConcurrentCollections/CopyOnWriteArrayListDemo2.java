/*While main thread iterates CopyOnWriteArrayList ,the other threads will perform updation on the cloned copy of CopyOnWriteArrayList object and the changes will not be available to the main thread */
/*If we replace CopyOnWriteArrayList with ArrayList ,then there will get RE:ConcurrentModificationException*/
import java.util.*;
import java.util.concurrent.*;
public class CopyOnWriteArrayListDemo2 extends Thread{
    static CopyOnWriteArrayList cowal = new CopyOnWriteArrayList();
    public void run(){
        try{
            Thread.sleep(3000);
        }
        catch(Exception e){

        }
        System.out.println("Child Thread Updating CopyOnWriteArrayList");
        cowal.add("E");
    }
    public static void main(String[] args) throws InterruptedException{
        CopyOnWriteArrayListDemo2 t = new CopyOnWriteArrayListDemo2();

        cowal.add("A");
        cowal.add("B");
        cowal.add("C");
        cowal.addIfAbsent("A");
        cowal.addIfAbsent("D");
        System.out.println(cowal);

        t.start();

        Iterator itr = cowal.iterator();

        while(itr.hasNext()){
            String s = (String)itr.next();
            System.out.println("Main Thread Iterating CopyOnWriteArrayList And Current Object Is:"+s);
            Thread.sleep(2000);
        }
    }
}
