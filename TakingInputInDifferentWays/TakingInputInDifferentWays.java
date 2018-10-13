import java.util.Scanner;
import java.io.*;
public class TakingInputInDifferentWays{
    public static void main(String[] args) throws Exception{

        /*
        // ::::::::::::::::Reading character by character from standard input(keyboard):::::::::::::::://
        InputStreamReader isr = new InputStreamReader(System.in);

        // reads the next byte(8 bits ----converted to decimal and is returned) available from System.in(keyboard)
        int i = isr.read();

        while(i!=-1){
            System.out.print((char)i);
            i = isr.read();
        }
        */

        //:::::::::::::::::::Reading through Buffer through Standard Input (Keyboard):::::::::::::::::::://

        /*
        System.out.print("Enter To Get The Result :");
        InputStreamReader isr =new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String s =br.readLine();
        System.out.println(s);
        */
        //::::::::::::::::::::Reading from Console Directly, Through Console Class Introduced in 1.6 Varsion::::::::::::::::://


        /*
        Console c = System.console();                // System.console() returns object of type Console
        String username = c.readLine("Username :");
        char arr[]= c.readPassword("Password :");

        //String password = arr.toString();          // Try This And Analyse The Difference For Better Concept Knowledge Gain
        String password = new String(arr);

        if(username.equals(password)){
            System.out.printf("User %s Is Valid User",username);
        }
        else{
            System.out.printf("User %s Is Not A Valid User",username);
        }
        */


        //::::::::::::::::::::::::::::::::Reading Through Scanner Class::::::::::::::::::::::::::::::::::://
        Scanner sc1 =new Scanner(System.in);          // Taking Input From Standard Input (Keyboard) Through Scanner Class
        System.out.print("Enter To Continue:");
        String s1 = sc1.nextLine();
        System.out.println("Output :"+s1+"\n");


        //:::::::::::::::::::::Scanning from File abc.txt Present In The Current Working Directory::::::::::::::::::::::::://
        Scanner sc2 = new Scanner(new File("abc.txt")); // Taking Input From File(abc.txt) Through Scanner Class
        while(sc2.hasNextLine()){
            String s2 = sc2.nextLine();
            System.out.println(s2);
         }
    }
}
