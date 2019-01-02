//Generic concept only applicable at compile time but not at run time
import java.util.*;
public class GenericLoopHole2{
    public static void m1(ArrayList<String> al){
        //  m1(ArrayList<String> al)  will be changed to -----> m1(ArrayList al) at compile time
    }
    public static void m1(ArrayList<Integer> al){
        //  m1(ArrayList<Integer> al) will be changed to -----> m1(ArrayList al) at compile time
    }
}
