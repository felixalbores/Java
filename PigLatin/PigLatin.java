import java.util.Scanner;
public class PigLatin{
         
       static String pigLatinWord = "ay";
       static char[] vowels = {'a','e','i','o','u'};
        
       static Scanner scanner = new Scanner(System.in);
      
      public static void main(String[] args){
       System.out.print("Input Word: ");
             String word = scanner.next();
             
             
          StringBuilder sb = new StringBuilder(word);
                             //f           //elix
               char letter = sb.charAt(0);                  
                           sb.deleteCharAt(0);
                        System.out.println(sb.append(letter));
                        //sb.append((sb.charAt(0)));
                         //     System.out.println(sb); 
             
//            for(int i = 0;i<sb.length();i++){
//               switch(sb.charAt(i)){
//                      case 'a': case 'i': case 'e': case 'u': case 'o':
//                        break;
//                        default:
//                           sb.deleteCharAt(0);
//                           sb.append(sb.charAt(0));    
//               }
//               
//           }       
                System.out.println("PigLatin: " + sb.append(pigLatinWord));
               
            
          
          
          
          
          
          
          
          
          //  //            StringBuilder sb = new StringBuilder(word);
//                 for(int i = 0;i<vowels.length;i++){
//                    if(vowels[i] == firstLetterOfWord){
//                      sb.append(pigLatinWord);
//                      break;
//                   }else if(i == vowels.length - 1){
//                              sb.deleteCharAt(0);
//                              sb.append(firstLetterOfWord);
//                              sb.append(pigLatinWord);        
//                        }             
//                }
//                System.out.println("Pig Latin: " + sb);
//                   
     

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
