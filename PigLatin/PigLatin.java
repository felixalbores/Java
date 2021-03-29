import java.util.Scanner;
public class PigLatin{
         
       static Scanner scanner = new Scanner(System.in);
      
      public static void main(String[] args){
            
            System.out.print("Input Word: ");        
            StringBuilder sb = new StringBuilder(scanner.next());
                          
         char letter = ' '; //felix = 5
           for(int i = 0;i<sb.length();i++){
              switch(sb.charAt(i)){
                     case 'a': case 'i': case 'e': case 'u': case 'o':
                       break;
                       default:
                      letter = sb.charAt(0);
                      sb.deleteCharAt(0);
                      sb.append(letter);  
              }
              
          }       
                System.out.println("PigLatin: " + sb.append("ay"));
               
            
          
          
          
          

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
