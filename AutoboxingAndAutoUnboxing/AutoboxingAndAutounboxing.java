class AutoboxingAndAutounboxing{
	static Integer I =10 ; // Autoboxing

	public static void main(String[] args){

		int i = I; // Autounboxing
		m1(i);
	}

	public static void m1(Integer K) {  // Autounboxing

		int i =K;
		System.out.println(i);
	}
}