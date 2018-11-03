//Imporatant Concept

class Test{
	public static void main(String[] args){
		//Case 1
		String s =new String("Vinay");
		s.concat("Pathak");           
		System.out.println(s);  // Vinay (There will be no change in the existing object.Hence String objects are immutable)
		
		StringBuffer sb = new StringBuffer("Vinay");
		sb.append(" Pathak");
		System.out.println(sb); //Vinay Pathak(There will change in the existing object.Hence StringBuffer are mutable)

		//Case 2
		String s1 = new String("Dhoni");
		String s2 =new String("Dhoni");

		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));    // .equals method is overriden in String class which is meant for content comparison.

		StringBuffer sb1= new StringBuffer("Kohli");
		StringBuffer sb2=new StringBuffer("Kohli");

		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));   // there is no overriden .equals method in StringBuffer class
	}
}