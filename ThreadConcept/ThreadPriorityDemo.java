class MyThread extends Thread{
	public void run(){
		System.out.println(" Child Thread :"+Thread.currentThread().getName() +" Priority :"+Thread.currentThread().getPriority());
	}
}
public class ThreadPriorityDemo{
	public static void main(String[] args){
		MyThread t1= new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();

		//getting name And priority Of thread 
		System.out.println("t1 thread name :"+t1.getName()+ "t1 thread priority :"+t1.getPriority());
		System.out.println("t2 thread name :"+t2.getName()+ "t2 thread priority :"+t2.getPriority());
		System.out.println("t3 thread name :"+t3.getName()+ "t3 thread priority :"+t3.getPriority());

		//setting name And priority of thread
		t1.setPriority(6);		
		t2.setPriority(4);			
		t3.setPriority(7);

		t1.setName(" thread 1");
		t2.setName(" thread 2");
		t3.setName(" thread 3");

		System.out.println("t1 thread name :"+t1.getName()+ "t1 thread priority :"+t1.getPriority());
		System.out.println("t2 thread name :"+t2.getName()+ "t2 thread priority :"+t2.getPriority());
		System.out.println("t3 thread name :"+t3.getName()+ "t3 thread priority :"+t3.getPriority());

		t1.start();
		t2.start();
		t3.start();

		for(int i=0;i<5;++i){
		System.out.println("Currently Executing Thread :"+Thread.currentThread().getName() +" Currently Executing Thread Priority :"+Thread.currentThread().getPriority());
		}
	}
}