import java.util.concurrent.locks.*;
import java.util.concurrent.*;

class MyThread extends Thread{
	MyThread(String name){
		super(name);
	}
	static ReentrantLock l =new ReentrantLock(); 
	public void run() {
			do{
				try{
				if(l.tryLock(3000,TimeUnit.MILLISECONDS))
					{
					System.out.println(Thread.currentThread().getName() + " got lock and performing safe operations");
					
					try {
						Thread.sleep(30000);
					}				
					catch(InterruptedException e){
						e.printStackTrace();
					}

					System.out.println(Thread.currentThread().getName()+ " releasing the lock");

					l.unlock();

					break;
					}
					else {
						System.out.println(Thread.currentThread().getName() + " unable to get the lock and performing alternate operations");
					}
				}
				catch(InterruptedException e){
						e.printStackTrace();
					}

			}while(true);
		}

	}
class TryLockDemo2{
	public static void main(String[] args){
		MyThread t1=new MyThread("First Thread");
		MyThread t2=new MyThread("Second Thread");
		MyThread t3=new MyThread("Third Thread");
		
		t1.start();
		t2.start();
		t3.start();
	}
}

