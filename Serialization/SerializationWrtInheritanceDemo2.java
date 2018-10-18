// Serialization wrt Inheritance If Parent Class Not Serializable.
import java.io.*;	
class Animal {
	int i =10;
	Animal(){
		System.out.println("Animal Class No Argument Constructor");
	}
}
class Dog extends Animal implements Serializable{
	int j = 20;
	Dog(){
		System.out.println()
	}
}
class SerializationWrtInheritance{
	public static void main(String[] args) throws Exception{
		Dog d1 = new Dog();

		System.out.println(d1.i+"......"+d1.j);
		FileOutputStream fos = new FileOutputStream("ddd.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);

		FileInputStream fis = new FileInputStream("ddd.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog d2 = (Dog)ois.readObject();

		System.out.println(d2.i+"......"+d2.j);

	}
}