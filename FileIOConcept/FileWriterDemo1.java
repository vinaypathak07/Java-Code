import java.io.*;
class FileWriterDemo1{
	public static void main(String[] args) throws Exception{
		FileWriter fw =new FileWriter("abc1.txt");   //  it overrides the content in the file abc1.txt
	//	FileWriter fw = new FileWriter("abc1.txt",true); // it appends the content in the file abc1.txt

		fw.write('h');  // writing single character to the file
		char[] ch ={'i','\n'};

		fw.write(ch);   // writing array of characters to the file

		fw.write("This is Vinay.\nLearning the tutorial on FileWriter\n");  //writing string to the file.

		fw.flush();
		fw.close();

		System.out.println("Written to the file abc1.txt successfully"); 
	}	
}	