import java.util.*;

//Java code  for thread creation by implementing the thread class.

class MyThread extends Thread
{   public void start(){                  
		super.start(); // Over-riding run method
		System.out.println(" Start Method ");
}
	public void run()
		{ System.out.println( Thread.currentThread()+" Is Running" );
	}
}
//Main Class

public class ThreadDemo
{public static void main(String[] args)
	{ 
		MyThread ob =new MyThread();
		ob.start();
		System.out.println(" Main Method ");
	
}
}
