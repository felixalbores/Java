/**
   <Felix Albores>
   BSIT-2
   data struct 21

   Input letter grade and display the corresponding remarks
   Letter      Remarks
     A         "Excellent"
     B         "Very Good"
     C         "Satisfactory"
     D         "Needs Improvement"
     E         "Failed"
*/
import java.util.Scanner;
public class Program2{
   
   public static void main(String args[]){
     
    Scanner scanner = new Scanner(System.in); 
   
   char letterGrade = ' ';   
   try{
     while(true){
     System.out.print("Input Letter Grade: ");
      letterGrade = scanner.next().charAt(0);
     if(letterGrade =='A' || letterGrade =='B' || letterGrade =='C' || letterGrade == 'D'  || letterGrade == 'E')
      break;   
      System.out.println("You need to input the specified given");
     }
   }catch(Exception e){
      System.out.println("Can't Input String");
   }
     
     
     if(letterGrade == 'A')
       System.out.println("Excellent");
     else if (letterGrade == 'B')
       System.out.println("Very Good");
     else if(letterGrade == 'C')
       System.out.println("Satisfactory");
      else if(letterGrade == 'D')
         System.out.println("Needs Improvement");
      else if (letterGrade == 'E')
         System.out.println("Failed");
   
   ////
   }//end of class
}