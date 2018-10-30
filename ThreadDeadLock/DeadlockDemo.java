class A{
	public  synchronized void a_method(B b){
		System.out.println("t1 starts execution of a's method");
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}

		System.out.println("t1 calling b's last method  b.b_last()");
		
		b.last();
		}

		public synchronized void last(){
				System.out.println("Inside A- last method");
		}

}

class B{

	public synchronized void b_method(A a){

		System.out.println("t2 starts  executing b's method ");

		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e){
			e.printStackTrace();

		}

		System.out.println("t2 calling a's last method a.last()");

		a.last();
	}

	public  synchronized void last(){
				System.out.println("Inside B- last method");
	}
}

class DeadlockDemo extends Thread{
	
			A a = new A();
			B b = new B();

			public void m1(){
				this.start();			//main thread on child thread object calls run method
				a.a_method(b);			//this line executed by main thread
			}
			public void run(){
				
				b.b_method(a);            //this line executed by child thread 
			}

	

	public static void main(String[] args){


	DeadlockDemo d = new DeadlockDemo();
	d.m1();

	}
}