import java.io.*;
class PrintWriterDemo1{
	public static void main(String[] args) throws Exception{
		FileWriter fw =new FileWriter("F://xyz.txt");
		PrintWriter pw = new PrintWriter(fw);

		pw.write(87);  // 87-unicode value of W
		pw.println("orld Cup");

		pw.println(2018);
		pw.println("Russia");
		pw.println("The Game Is On");

		pw.flush();
		pw.close();

		System.out.println("Succefully written to the file");

	}
}