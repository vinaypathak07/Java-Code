class StringClassDemo2{
	public static void main(String[] args){
		String s1 = new String("hello");

		String s2 = s1.toUpperCase();       // a new object will be created in heap area.
		String s3 = s1.toLowerCase();		// new object won't  be created in heap area because there is no change in the state(case) of object.
		String s4 = s2.toLowerCase();		// a new object will be created in heap area.
		String s5 = s4.toUpperCase();		// a new object will be created in heap area 

		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s1==s5);

	}
}