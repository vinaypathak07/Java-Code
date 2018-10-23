class MethodLocalInnerDemo{
	public void m1(){
		int x=10; 
		class Inner{
			public void m2(){
				System.out.println(x);  //compile error in java 1.5 version but not in 1.8 version
			}
		}
		Inner i=new Inner();
		i.m2();
	}
	public static void main(String[] args){
		MethodLocalInnerDemo m=new MethodLocalInnerDemo();
		m.m1();
	}
}