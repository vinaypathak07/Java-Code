/*CopyOnWriteArrayList cannot perform remove operation .As any updation is performed on seperate cloned copy.
.If we try to do so then we will get RE:UnsupportedOperationException.Program to illustrate.
*/
import java.util.*;
import java.util.concurrent.*;
public class CopyOnWriteArrayListDemo3{
    public static void main(String[] args){
        CopyOnWriteArrayList cowal = new CopyOnWriteArrayList();

        cowal.add("A");
        cowal.add("B");
        cowal.addIfAbsent("C");
        cowal.addIfAbsent("B");
        cowal.addIfAbsent("D");

        System.out.println(cowal); //[A,B,C,D]

        Iterator itr = cowal.iterator();

        while(itr.hasNext()){
            String s = (String)itr.next();

            if(s.equals("D")){
                itr.remove();   // RE:UnsupportedOperationException
            }
        }
        System.out.println(cowal);
    }
}
