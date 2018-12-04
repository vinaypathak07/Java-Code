// program to illustrate the use of StringTokenizer present in java.util package
import java.util.*;
class StringTokenizerDemo1{
	public static void main(String[] args){
		StringTokenizer st =new StringTokenizer("Fifa World Cup 2018");  // by default it tokenizes according to space	
		// to tokenize according to particular pattern ----see StringTokenizerDemo2.java  			
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}