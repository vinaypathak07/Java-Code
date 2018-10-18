// If we don't know the order of serialization.Then this is how we can deserialize the object.
import java.io.*;
class Dog implements Serializable{
	Cat c = new Cat();
	
}
class Cat implements  Serializable{
	Rat r =new Rat();
	//Perform cat related functionality
}
class Rat implements Serializable{
	int j=10;
	// Perform rat related functionality 
}
class OrderOfSerializationDemo2{
	public static void main(String[] args){
			Dog d1 =new Dog();
			FileOutputStream fos =new FileOutputStream("ccc.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(d1);

			FileInputStream fis = new FileInputStream("ccc.ser");
			ObjectInputStream ois =new ObjectInputStream(fis);
			Object o = ois.readObject();


			// THIS IS HOW YOU CAN DO .NOT COMPLETE CODE 
			if(o instanceof Dog){
				Dog d2 =(Dog)o;
				//Perform dog related functionality
			}
			else if(o instanceof Cat){
				Cat c2 =(Cat)o;			
			}
			else if(o instanceof Rat){
				Rat r2 = (Rat)o;
			}

			System.out.println();

	}
}