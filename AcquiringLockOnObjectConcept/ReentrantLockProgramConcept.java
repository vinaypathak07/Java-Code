// See SynchronizedBlockDemo.java 

import java.util.concurrent.locks.*;
class Display{
ReentrantLock l =new ReentrantLock();
	public void wish(String name){
			l.lock();

			for(int i=0;i<10;i++){
				System.out.print("Good Morning :");
				
				try{
					Thread.sleep(2000);
				}
				catch(InterruptedException e){
					e.printStackTrace();
				}
				System.out.println(name);
			}

			l.unlock();
	}
}
class MyThread extends Thread {
	Display d = new Display();
	String name;	
	MyThread(Display d,String name){
			this.d=d;
			this.name =name;
}
		public void run(){
			d.wish(name);
		}

}

class ReentrantLockProgramConcept{
	public static void main(String[] args){
		Display d =new Display();
		MyThread t1=new MyThread(d,"Dhoni");
		MyThread t2=new MyThread(d,"Kholi");
		t1.start();
		t2.start();
		}
}