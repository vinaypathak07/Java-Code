// Anonymous Inner Class that is defined inside arguments

class AnonymousInnerClassInsideArguments{
	public static void main(String[] args){

		new Thread(new Runnable(){
			 public void run(){
			 	for(int i=0;i<5;i++){
			 		System.out.println("child thread");
			 	}
			 }
		}).start();	

		for(int i=0;i<5;i++){
			System.out.println("main thread");
		}
	}
}