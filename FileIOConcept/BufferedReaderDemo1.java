import java.io.*;
class BufferedReaderDemo1{
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("F://abc.txt");
		BufferedReader br =new BufferedReader(fr);     // br communicates with file reader object fr which communicates with the file.
		
		String s=br.readLine();  // br.readLine returns String

		while(s!=null){
			System.out.println(s);
			s= br.readLine();
		}

		br.close(); // automatically fr object gets closed
	}
}