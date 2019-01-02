//Generic concept apllicable only at compile time but not at run time
import java.util.*;
public class GenericLoopHole{
    public static void main(String[] args){
        ArrayList al = new ArrayList<String>();

        al.add("Vinay Pathak");
        al.add(160105004);
        al.add(100.0);

        System.out.println(al);
    }
}
