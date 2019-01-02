import java.util.*;
public class GenericMethod{
    public static <E> void m(E[] elements){
        for(E element : elements){
            System.out.println(element);
        }
    }
    public static void main(String[] args){
        Integer[] i ={10,20,40,60,70,80};
        m(i);

        String[] s = {"Data Structures","Core Java","Angular","Node.js"};
        m(s);
    }
}
