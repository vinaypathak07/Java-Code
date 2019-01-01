/* After getting iterator we are not allowed to modify CopyOnWriteArrayList .If we replace CopyOnWriteArrayList with ArrayList ,then we will get RE:ConcurrentModificationException */
import java.util.*;
import java.util.concurrent.*;
public class CopyOnWriteArrayListDemo4{
    public static void main(String[] args){
        CopyOnWriteArrayList cowal = new CopyOnWriteArrayList();

        cowal.addIfAbsent("V");
        cowal.addIfAbsent("I");
        cowal.addIfAbsent("N");
        cowal.addIfAbsent("V");
        cowal.addIfAbsent("A");

        Iterator itr = cowal.iterator();

        //After getting the iterator we are not allowed to modify CopyOnWriteArrayList.
        cowal.addIfAbsent("Y");

        while(itr.hasNext()){
            String s = (String)itr.next();
            System.out.println(s);
        }
        System.out.println(cowal);
    }
}
