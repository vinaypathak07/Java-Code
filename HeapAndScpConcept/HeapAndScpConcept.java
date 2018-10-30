class Test {
	public static void main(String[] args){
		String s1 = new String("you are the best");

		String s2 =new String(" you are the best");
		System.out.println(s1==s2);

		String s3 = "you are the best";
		System.out.println(s1==s3);

		String s4 = "you are the best";
		System.out.println(s3==s4);

		String s5 = "you are" + " the best";
		System.out.println(s3==s5);

		String s6 ="you are";

		String s7 = s6 + " the best";
		System.out.println(s3==s7);

		final String s8 = "you are";

		String s9 = s8 +" the best";
		System.out.println(s3==s9);

		System.out.println(s6==s8);
	}
}