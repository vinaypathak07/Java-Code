class PopCorn{
	public void taste(){
		System.out.println("Salty");	
	// 100 methods 	
	}
}
/*
class NewPopCorn{
	public void taste(){
		System.out.println("Spicy");
	// 100 method by default available to the child class
	}
}
// Only one time required class.Therefore not recommended to go for child class implementation  
// Go for annonymous inner classes.
	*/
class AnonymousInnerClassDemo1{
	public static void main(String[] args){
		PopCorn p=new PopCorn(){
			public void taste(){                // overidden method
				System.out.println("Spicy");
			}
		};

		p.taste();
		// if you want to go for parent class taste method then create another parent object.

		PopCorn p1 = new PopCorn();
		p1.taste();    //parent class taste method will be invoked

		PopCorn p2 = new PopCorn(){
			public void taste(){
					System.out.println("Sweet");
			}
		} ;
		p2.taste();
		// 4 .class files will be generated
		//To get the corresponding .class 

		System.out.println(p.getClass().getName());			
		System.out.println(p1.getClass().getName());			
		System.out.println(p2.getClass().getName());			
	}
}