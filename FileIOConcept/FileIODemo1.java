import java.io.*;
class FileIODemo1{
	public static void main(String[] args) throws Exception{
		File f =new File("abc1.txt");
		System.out.println(f.exists());

		f.createNewFile();
		System.out.println(f.exists());

		// Crating new directory 

		File f2 =new File("directory1");
		System.out.println(f2.exists());

		f2.mkdir();
		System.out.println(f2.exists());		
	}
}