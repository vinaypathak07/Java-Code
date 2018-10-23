class MethodLocalInnerClass{
	public void m1(){
		class Inner{
			public void sum(int x,int y){
				System.out.println("Sum :"+(x+y));
			}
		}	

			Inner i =new Inner();
			i.sum(10,20);
			//10k lines of code 
			i.sum(100,200);
			//10k lines of code
			i.sum(1000,2000);
		}
	
	public static void main(String[] args){
		MethodLocalInnerClass m =new MethodLocalInnerClass();
		m.m1();
	}

}
