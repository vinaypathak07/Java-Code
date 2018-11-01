class AnonymousInnerClassThreadApproach{
	public static void main(String[] args ){
		Thread t = new Thread(){			//unnamed class(anonymous class) extending Thread class 	
			public void run(){				//overriding run method
				for(int i =0;i<5;++i){
				System.out.println("Child Class ");
				}
			}
		};

		t.start();
		for(int i=0;i<5;i++){
			System.out.println("Main Thread");
		}
	}
}