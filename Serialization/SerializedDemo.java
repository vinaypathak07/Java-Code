// Program to implement  serialization and deserialization concept.
import java.io.*; 
class Dog implements Serializable{         // making the dog object Serializable by implementing Serializable interface(no methods ---marker interface ) 
	int i = 10;
	transient int j = 20;
}
class SerializedDemo {
	public static void main(String[] args) throws Exception{

			Dog d1 = new Dog();   // d1----i=10,j=20

			// Serialization 
			FileOutputStream fos  = new FileOutputStream("aaa.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);  //  
			oos.writeObject(d1);

			//Deserialization
			FileInputStream fis = new FileInputStream("aaa.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Dog d2 = (Dog)ois.readObject();          // readObject() method returns object of Object type 

			System.out.println(d2.i+"......."+d2.j);

	}
}