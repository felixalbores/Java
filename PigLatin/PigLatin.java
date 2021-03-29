import java.util.Scanner;
public class PigLatin{
         
       static String pigLatinWord = "ay";
       static char[] vowels = {'a','e','i','o','u'};
        
       static Scanner scanner = new Scanner(System.in);
      
      public static void main(String[] args){
             
             System.out.print("Input Word: ");
             String word = scanner.next();
             
             
          char letter = word.toLowerCase().charAt(0);
          StringBuilder sb = new StringBuilder(word);
              switch(letter){
                     case 'a': case 'i': case 'e': case 'u': case 'o':
                       sb.append(pigLatinWord);
                       break;
                       default:
                          sb.deleteCharAt(0);
                          sb.append(letter);
                          sb.append(pigLatinWord);    
              }       
          System.out.println("PigLatin: " + sb);
          
          
          
 
   }

}

/*
      if a words start with a constant the first letter word will be removed and place them at the end
      of the word followed by ay       
         system--> ystem say
                                  [a,i,e,o,u]
         if a words starts with a vowel then the original word are same and the last letter of the word would be
         added ay
         apple+ay
         
   */
