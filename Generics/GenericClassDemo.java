// Passing different parameter to class (Generic Class)
import java.util.*;
class Generic<T>{
    T ob;
    Generic(T ob){
        this.ob = ob;
    }
    public void show(){
        System.out.println("The type of ob is:"+ob.getClass().getName());
    }
    public T getOb(){
        return ob;
    }
}
public class GenericClassDemo{
    public static void main(String[] args){

        Generic<String> g1 = new Generic<String>("Vinay Pathak");
        g1.show();
        System.out.println(g1.getOb());

        Generic<Integer> g2 = new Generic<Integer>(160105004);
        g2.show();
        System.out.println(g2.getOb());

        Generic<Double> g3 = new Generic<Double>(100.0);
        g3.show();
        System.out.println(g3.getOb());
    }
}
