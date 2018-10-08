// program to read all the mobile number from input_regex.txt
import java.util.regex.*;
import java.io.*;
class RegExDemo9{
	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("input_regex.txt");
		BufferedReader br = new BufferedReader(fr);

		FileWriter fw = new FileWriter("output_regex.txt");
		PrintWriter pw = new PrintWriter(fw);

		Pattern p = Pattern.compile("(0|91)?[6-9][0-9]{9}");
		String line = br.readLine();
		while(line!=null){

			Matcher m = p.matcher(line);
			System.out.println(m.find());
			if(m.group().length()==10){
				pw.println(m.group());
				pw.flush();
			}
		line = br.readLine();	
		}

		System.out.println("Numbers read from the file input_regex successfully");
		
		pw.close();
		br.close();
	}
}