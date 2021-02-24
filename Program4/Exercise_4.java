/*
Prelim - Programming Exercise No. 4

Write a program that prompts the user to input and then
outputs both the individual digits of the number and the sum of the digits.
For example, the program should output the individual digits of 3456 as 3 4 5 6 and the sum as 18, 
output the individual digits of 8030 as 8 0 3 0 and the sum as 11, 
output the individual digits of  2345526 as 2 3 4 5 5 2 6 and the sum as 27, 
output the individual digits of 4000 as 4 0 0 0 and the sum as 4, 
and output the individual digits of -2345 as 2 3 4 5 and the sum as 14.

*/

import java.util.Scanner;
public class Exercise_4{
   public static void main(String args[])
   {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Number: ");
      String stringNumber = scanner.next();
     
     //For separation of digits
      System.out.print("Individual Digits: ");
      for(int i = 0;i<stringNumber.length();i++)
         System.out.print(stringNumber.charAt(i)+ " ");
      
      //For Adding Digits
       final int TENS = 10;
       int number = Integer.parseInt(stringNumber); 
       int sum = 0;
       while(number != 0){
       int digit = number%10;
       sum +=digit;
       number /=10;
       }
       System.out.print("\nSum of Digits: " + sum);
       
       
   }
}