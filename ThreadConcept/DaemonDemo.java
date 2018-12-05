
class DaemonDemo  extends Thread{ 

	 public static void main(String[] args){

	 	System.out.println(Thread.currentThread().isDaemon());

	 	// Thread.currentThread().setDaemon(true);  // impossible to change the daemon nature of main thread .this line will rise an exception saying IllegalThreadStateException
	 	DaemonDemo d = new DaemonDemo();  // Child Thread 
	 	System.out.println(d.isDaemon()); // Daemon nature is inherited from parent to child

	 	d.setDaemon(true);

	 	System.out.println(d.isDaemon());

	 }
}