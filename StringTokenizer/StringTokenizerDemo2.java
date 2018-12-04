// program to tokenize according to your own pattern
import java.util.*;
class StringTokenizerDemo2{
	public static void main(String[] args){
		StringTokenizer st =new StringTokenizer("03-07-1998","-"); // to tokenize according to "-"

		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}