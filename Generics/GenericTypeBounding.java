import java.util.*;
import java.util.concurrent.*;
/* T can only be the child classes of Number class i.e it can be Byte ,Short ,Integer,Long Float,Double .If we pass any other type parameter we will get compile time error.
 */
class Test<T extends Number>{
    T ob;
    Test(T ob){
        this.ob = ob;
    }
    public void show(){
        System.out.println(ob);
    }
}
public class GenericTypeBounding{
    public static void main(String[] args){

        Test<Integer> t1 = new Test<Integer>(10);
        t1.show();

       // Uncomment this to get the compile time error
       // Test<String> t2 = new Test<String>("10");
       // t2.show();
    }
}
