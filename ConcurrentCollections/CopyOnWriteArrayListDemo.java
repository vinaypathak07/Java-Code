// add() method of ArrayList and addAllAbsent() method of CopyOnWriteArrayList.
import java.util.*;
import java.util.concurrent.*;
public class CopyOnWriteArrayListDemo{
    public static void main(String[] args){

        ArrayList al1 = new ArrayList();
        al1.add("A");
        al1.add("B");
        System.out.println("Array List 1:"+al1); // [A,B]

        CopyOnWriteArrayList cowal = new CopyOnWriteArrayList();
        cowal.addIfAbsent("A");
        cowal.addIfAbsent("C");
        System.out.println("Copy On Write Array List Initially:"+cowal); // [A,C]

        cowal.addAllAbsent(al1);
        System.out.println("Copy On Write Array List After Adding ArrayList 1:"+cowal);

        ArrayList al2 = new ArrayList();
        al2.add("B");
        al2.add("E");
        System.out.println("Array List 2:"+al2);  // [B,E]

        cowal.addAllAbsent(al2);
        System.out.println("Copy On Write Array List After Adding ArrayList 2 :"+cowal); //[A,C,B,E]
    }
}
