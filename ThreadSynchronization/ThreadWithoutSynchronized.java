class Display{
	
	public synchronized void set(String name){
		for(int i=1;i<5;i++){
		System.out.println(name);
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	} 
}

class MyThread extends Thread {
	Display d;
	String name;

	MyThread(String name,Display d){
 	this.name=name;
 	this.d = d;
	}
	public void run(){
		d.set(name);
	}
}

class ThreadWithoutSynchronized{
	public static void main(String[] args){

		Display d= new Display();
		
		// Two Threads Executing on the same java object Display d -----Here what object level lock comes into the picture 
		// If two threads are executing on different java object -----then class level lock comes into the picture. 
		MyThread t1 = new MyThread("Thread 1",d);
		MyThread t2 = new MyThread("Thread 2",d);

		t1.start();
		t2.start();
	}
}