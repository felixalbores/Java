/* 
   Write an application that accepts a word from a user and converts it to Pig Latin.
   If a word starts with a consonant, the Pig Latin version removes all consonants from the beginning of the word and places them at the end, followed by ay.
   For example, cricket becomes icketcray.If a word starts with a vowel,the Pig Latin version is the original word with ay added to the end. For example, apple becomes appleay. If y is the  first letter in a word, it is treated as a consonant; otherwise, it is treated as a vowel. For example, young becomes oungyay, but system becomes ystemsay. For this program, assume that the user will enter only a single word consisting of all lowercase letters. Save the file as PigLatin.java.
*/
//Felix Albores
import java.util.Scanner;
public class PigLatin{
         
       static Scanner scanner = new Scanner(System.in);
      
      public static void main(String[] args){
            
            System.out.print("Input Word: ");        
            StringBuilder sb = new StringBuilder(scanner.next());
              
         char letter =' '; 
                for(int i = 0;i<sb.length();i++){         
                    letter = sb.charAt(0);
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