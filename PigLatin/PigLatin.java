/*
   Felix Albores
*/
import java.util.Scanner;
public class PigLatin{
         
       static Scanner scanner = new Scanner(System.in);
      
      public static void main(String[] args){
            
            System.out.print("Input Word: ");        
            StringBuilder sb = new StringBuilder(scanner.next());
              
         char letter =' '; 
                for(int i = 0;i<sb.length();i++){         
                    letter = sb.charAt(0);//s
                     if(letter == 'a' || letter == 'i' || letter  == 'e' || letter == 'u' || letter == 'o')
                       break;
                     else if(i != 0 && letter == 'y')     
                           break;
                     else{
                      sb.deleteCharAt(0);
                      sb.append(letter);
               }
              }   
                System.out.println("PigLatin: " + sb.append("ay"));
   }

}