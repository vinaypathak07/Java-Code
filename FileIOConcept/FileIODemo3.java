//Program to display the names of only files  present in F://java tutorial
import java.io.*;
class FileIODemo3{
	public static void main(String[] args) throws Exception{
		int count=0;	
		File f=new File("F://java tutorial");	

		String[] s = f.list();
		for(String s1:s){
			File f2 =new File("F://java tutorial",s1);

			if(f2.isFile()){
						count++;
						System.out.println(s1);
			}	
		}
		System.out.println("Total Files And Directories :"+count);
	}
}