import java.io.*;
// Code to create a directory named with "dit" in current working directory and create a file named with "demo.txt" in that directory. 
class FileIODemo2{
	public static void main(String[] args) throws Exception{
			File f =new File("dit");
			f.mkdir();

			File f1= new File("dit","demo.txt");
			f1.createNewFile();
			System.out.println("Task Completed");
	}
}