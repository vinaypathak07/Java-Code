import java.util.*;
public class GenericInMap{
    public static void main(String[] args){
        HashMap<Integer,String> hm = new HashMap<Integer,String>();

        hm.put(160105001,"Akshit Kala");
        hm.put(160105002,"Akshat Gupta");
        hm.put(160105003,"Shivank Singhal");
        hm.put(160105005,"Mohit Khatri");
        hm.put(160105006,"Anadi Singh");
        hm.put(160105004,"Vinay Pathak");

        System.out.println(hm);

        Set<Map.Entry<Integer,String>> set = hm.entrySet();
        Iterator<Map.Entry<Integer,String>> itr = set.iterator();

        while(itr.hasNext()){
            Map.Entry e = (Map.Entry)itr.next();
            System.out.println(e.getKey()+"::::"+e.getValue());
        }
    }
}
