// program to illustrate externalization(saving only part of the object to the file) in java
import java.io.*;
class ExternalizableDemo implements  Externalizable{      // Externalizable extends Serializable
	String s1;
	int i;
	String s2;
	public ExternalizableDemo(){
		System.out.println("public no-argument constuctor called");
	}
	public ExternalizableDemo(String s1 ,int i ,String s2){
		this.s1 = s1;
		this.i = i;
		this.s2 = s2;
	}

	//Following are the two methods present in Externalizable interface
	public void writeExternal(ObjectOutput out) throws IOException{       
		out.writeObject(s1);
		out.writeInt(i);
	}
	public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException{
		s1 =(String)in.readObject();
		i = in.readInt();
	}

	public static void main(String[] args) throws Exception{

		ExternalizableDemo ob1 =new ExternalizableDemo("Fifa World Cup", 2018, "Russia"); 
		
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ob1);

		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ExternalizableDemo ob2  =(ExternalizableDemo)ois.readObject();

		System.out.println(ob2.s1+"......"+ob2.i+"......."+ob2.s2); 	
	}
}