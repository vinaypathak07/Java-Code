import java.util.concurrent.locks.*;
class MyThread extends Thread {
	MyThread(String name){
		super(name);
	}

	static ReentrantLock l=new ReentrantLock();
	public void run(){
		
		if(l.tryLock()){
			System.out.println(Thread.currentThread().getName() + " got lock and performing safe operations");
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
			l.unlock();
		}

		else {
			System.out.println(Thread.currentThread().getName() + " unable to get lock hence performing alternate operations");
		}
			
	}
}
class TryLockDemo{
	public static void main(String[] args){

		MyThread t1=new MyThread("First Thread");
		MyThread t2=new MyThread("Second Thread");

		t1.start();
		t2.start();
	}
}