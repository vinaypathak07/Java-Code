//program to illustrate HashMap implementation
import java.util.*;
class HashMapDemo{
		public static void main(String[] args){
			HashMap m =new HashMap();

			m.put("Ronaldo",7);
			m.put("Griezmann",13);
			m.put("Messi",10);
			m.put("Mbappe",17);

			System.out.println(m);//{Key1=Value1,Key2=Value2,.....}
			System.out.println(m.put("Griezmann",011));// will return 013

			Set s =m.keySet();
			System.out.println(s);     // [Ronaldo,Griezmann,Messi,Mbappe]

			Collection c =m.values();
			System.out.println(c);     // [7,13,10,17]

			Set s1 = m.entrySet();
			System.out.println(s1); //[Key1=Value1,Key2,Value2,....]


			Iterator itr = s1.iterator();
			while(itr.hasNext()){

				Map.Entry me = (Map.Entry)itr.next();
				System.out.println(me.getKey()+"..."+me.getValue());

				if(me.getKey().equals("Mbappe")){
					me.setValue(9);
				}
			}
			System.out.println(m); 

		}
}