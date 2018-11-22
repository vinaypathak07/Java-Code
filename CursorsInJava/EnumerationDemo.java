// program to illustrate the use of Enumeration cursor
import java.util.Vector;
import java.util.Enumeration;
class EnumerationDemo{
	public static void main(String[] args){

		Vector v =new Vector();

		for(int i=0;i<=10;i++){
			v.addElement(i);
		}

		Enumeration e = v.elements();      // public Enumeration elements() method present inside Vector

		while(e.hasMoreElements()){
			Integer I =(Integer)e.nextElement();

			if(I%2==0){
				System.out.println(I);
			}
		}
		System.out.println(v);

	}
}