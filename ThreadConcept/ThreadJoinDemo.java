class MyThread extends Thread{
	public void run() {
		for (int i=0;i<10 ;++i ) {
			
		 System.out.println(" Child Thread Running");
		 	try{
				Thread.sleep(2000);			
				}
			catch(InterruptedException e){
				System.out.println(e);	
			}
		}
	}	
}
class ThreadJoinDemo {
	public static void main(String[] args) throws InterruptedException{
		MyThread t =new MyThread();

		t.start();

		//t.join();

		t.join(10000);

		for(int i=0;i<5;++i){
			System.out.println("Main Thread Running");
		}
	}
}