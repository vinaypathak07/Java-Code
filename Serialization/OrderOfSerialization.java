// Serializing Multiple Objects to the same file
import java.io.*; 
class Dog implements Serializable{
	int a=10;
	transient int b =20;
}
class Cat implements Serializable{
	transient int c =30;
	int d = 40; 
}
class Rat implements Serializable{
	transient int e =50;
	transient static int f= 60;
}

class  OrderOfSerialization{
	public static void main(String[] args) throws Exception{
			
			Dog d1 = new Dog();
			Cat c1 = new Cat();
			Rat r1 = new Rat();

			FileOutputStream fos = new FileOutputStream("bbb.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(d1);
			oos.writeObjct(c1);
			oos.writeObject(r1);

			FileInputStream fis = new FileInputStream("bbb.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			// In which order we serialized in the very same order we have to de-serialize.
			Dog d2 = (Dog)ois.readObject();
			Cat c2 = (Cat)ois.readObject();
			Rat r2 = (Rat)ois.readObject();

			System.out.println(d2.a+"......."+d2.b);
			System.out.println(c2.c+"......."+c2.d);
			System.out.println(r2.e+"......."+r2.f);
	}
}