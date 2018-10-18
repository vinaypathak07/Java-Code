// Program to illustrate customized serialization of more than one transient variable
import java.io.*;
class Account implements Serializable{
	String username = "admin";
	transient String pwd = "abc";
	transient int pin = 1234;

	// Performing customized serialization using the below two methods:
	// this method is executed by jvm when writeObject() on Account object in main method is executed. 
	private void writeObject(ObjectOutputStream oos) throws Exception{
		oos.defaultWriteObject();
		String epwd = "123"+pwd;
		oos.writeObject(epwd);
		int epin = 1111+pin;
		oos.writeInt(epin);
	}
	// this method is executed by jvm when readObject() on Account object in main method is executed. 
	private void readObject(ObjectInputStream ois)throws Exception{
		ois.defaultReadObject();
		String epwd = (String)ois.readObject();
		pwd = epwd.substring(3);    // string starting from 3 index till the end
		int epin =ois.readInt();
		pin = epin - 1111;
	}
}
class CustomizedSerializationDemo2{
	public static void main(String[] args) throws Exception{
		Account a1 = new Account();

		System.out.println(a1.username+"......."+a1.pwd+"........"+a1.pin);

		FileOutputStream fos = new FileOutputStream("ddd.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);

		FileInputStream fis = new FileInputStream("ddd.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a2 = (Account)ois.readObject();

		System.out.println(a2.username+"......."+a2.pwd+"......."+a2.pin);

	}
}
