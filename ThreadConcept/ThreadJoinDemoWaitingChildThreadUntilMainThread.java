
//Waiting of child thread until completing main thread 
class MyThread extends Thread{
	static Thread mt;
	public void run(){
			try{
				// waiting to join after main thread completes 
				mt.join();
			}
			catch(InterruptedException e){
				System.out.println(e);
			}

			for(int i = 0;i<5;++i){
				System.out.println("Child Thread Running");
			}
	}
}

class ThreadJoinDemo2 {
	public static void main(String[] args){
		
		// creation of main thread object
		MyThread.mt=Thread.currentThread(); 

		MyThread t =new MyThread();

		t.start();

		for(int i=0;i<5;i++){
			System.out.println("Main Thread Running");

			Thread.sleep(2000);	
		}
	}

}