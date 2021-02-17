/**
   <Felix Albores>   
   BSIT-2
   data struct 21

   A program that would accept 10 integers, that ranges from 1 to 100,
   Be able to count how numbers are in the range 1-25, 26-50,51-75,76-100.
   Thereafter, display the result.
*/
import java.util.Scanner;
public class Program1{
   
   public static void main(String args[])
   {
      Scanner scanner = new Scanner(System.in);
      
      int rangeOneToTwentyFive = 0;
      int rangeTwentySixtToFiFty = 0;
      int rangeFiftyOneToSeventyFive = 0;
      int SeventySixToOneHundred = 0;
      
      
      try{
      int number;
      for(int i = 0;i<10;i++){
       while(true){
         System.out.print("Input " + (i+1) + ": ");
         number = scanner.nextInt();
         if(number>=1 && number<=100)
            break;
         System.out.println("You need to input 1 to 100 only");
       }
         if(number>=1 && number<=25)
            rangeOneToTwentyFive =   rangeOneToTwentyFive + 1 ;
         else if(number>=26 && number<=50)
                rangeTwentySixtToFiFty = rangeTwentySixtToFiFty + 1;
         else if(number>=51 && number<=75)
               rangeFiftyOneToSeventyFive = rangeFiftyOneToSeventyFive + 1;
         else if(number>=76 && number<=100)
            SeventySixToOneHundred = SeventySixToOneHundred + 1;       
      }
     }catch(Exception e){
      System.out.println("Input Error");
     }
     
      System.out.print("\nRange to 1 to 25: " + rangeOneToTwentyFive);
      System.out.print("\nRange to 26 to 50: " + rangeTwentySixtToFiFty);
      System.out.print("\nRange to 51 to 75: " + rangeFiftyOneToSeventyFive);
      System.out.print("\nRange to 76 to 100: " + SeventySixToOneHundred);

   }   
   ///
}//end of class
