import java.util.*;
abstract class College{
   abstract public void displayName();
}
class DitUniversity extends College{
    public void displayName(){
        System.out.println("You are in Dit University");
    }
}
class IndianInstituteOfTechnology extends College{
    public void displayName(){
        System.out.println("You are in Indian Institute Of Technology");
    }
}
class NationalInstituteOfTechnology extends College{
    public void displayName(){
        System.out.println("You are in National Institute Of Technology");
    }
}
public class WildCardsInGenerics{
    public static void displayNames(List<? extends College> lists) {
        for(College c : lists){
            c.displayName();
            try{
                Thread.sleep(3000);
            }
            catch(Exception e){

            }
        }
    }
    public static void main(String[] args){
        ArrayList<College> al = new ArrayList<College>();

        al.add(new DitUniversity());
        al.add(new NationalInstituteOfTechnology());
        al.add(new IndianInstituteOfTechnology());

        displayNames(al);
    }
}
