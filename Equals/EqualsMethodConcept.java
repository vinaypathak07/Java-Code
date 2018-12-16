class Test {
	public static void main(String[] args){
	
	String s1 = new String("India");
	String s2 = new String("India");

	StringBuffer sb1 = new StringBuffer("India");
	StringBuffer sb2 = new StringBuffer("India");

	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	System.out.println(sb1==sb2);
	System.out.println(sb1.equals(sb2));
	// System.out.println(s1==sb2);            // CE : Incomparable types: String and StringBuffer 	
	System.out.println(s1.equals(sb1));
	}
}	
