import java.util.*;
import java.util.concurrent.*;
public class ConcurrentHashMapDemo extends Thread{
    static ConcurrentHashMap chm = new ConcurrentHashMap();
    public void run(){
        try{
            Thread.sleep(3000);
        }
        catch(Exception e){

        }
        chm.put(2019,"Hope this is the beautiful one.");
        System.out.println("Child Thread Performing Updation On The Collection Object");
    }
    public static void main(String[] args) throws InterruptedException{

        ConcurrentHashMapDemo t = new ConcurrentHashMapDemo();

        chm.put(2018,"Bye 2018");
        chm.put(2019,"Welcome 2019");
        chm.put(2018,"Bye 2018.Thank You");
        chm.put(2019,"I will give my best.");
        System.out.println(chm);

        t.start();

        Set s = chm.keySet();
        Iterator itr = s.iterator();
        while(itr.hasNext()){
            Integer i = (Integer)itr.next();
            System.out.println("Main Thread Iterating Collection Object:"+i);
            Thread.sleep(2000);
        }
    }
}
