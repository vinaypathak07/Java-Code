class OuterDemo3 {
	class Inner {
		public void m1(){
			System.out.println("Inner class method");
		}

	}
	public void m2(){
		Inner i =new Inner();
		i.m1();
	}
	public static void main(String[] args){
		OuterDemo3 o=new OuterDemo3();
		o.m2();
	}
}

