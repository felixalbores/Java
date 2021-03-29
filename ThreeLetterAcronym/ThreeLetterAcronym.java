/*
Three-letter acronyms are common in the business world. For example, in Java you use the IDE (Integrated Development Environment) in the JDK (Java Development Kit) 
to write programs used by the JVM (Java Virtual Machine) that you might send over a LAN (local area network). 
Programmers even use the acronym TLA to stand for three-letter acronym. 
Write a program that allows a user to enter three words, and display the appropriate three-letter acronym in all uppercase letters. 
If the user enters more than three words, ignore the extra words. Save the file as ThreeeLetterAcronym.java

Felix Albores 
*/
import java.util.Scanner;
public class ThreeLetterAcronym{
   
   static  char letter = ' '; 
   static String acronym =" ";
   
   static Scanner scanner = new Scanner(System.in);
   
      public static void main(String args[]){
          
              System.out.print("Enter three Words: ");
              String str = scanner.nextLine();
          
           String[] splitWord = str.split(" ");
           for(int i = 0;i<splitWord.length;i++){
              letter = splitWord[i].toUpperCase().charAt(0);
              acronym += letter;
              if(i == 2)
                 break;
           }
           System.out.println("Three Letter Acroynm: " + acronym);
         
      }
}