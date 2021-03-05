/*
OOProg21 - Object-Oriented Programming 
Midterm - Programming Exercise1

Problem:

Write a program that uses while loops to perform the following steps:
1.	Prompt the user to input two integers: firstNum and secondNum. (firstNum must be less than secondNum).
2.	Output all the odd numbers between firstNum and secondNum inclusive.
3.	Output the sum of all the even numbers between firstNum and secondNum inclusive
4.	Output the sum of the squares of all the even numbers between firstNum and secondNum inclusive
5.	Output the sum of the squares of all the odd numbers between firstNum and secondNum inclusive.

*/




import java.util.Scanner;
public class MidtermExer_1{
       
         static String oddNumber = " ";
         static int sumOfEvenNumber = 0;
         static int sumSquareOfEvenNumber = 0;
         static int  sumSquareOfOddNumber = 0;
         static final int SQUARE = 2;
             
    public static void main(String args[]) {
    
            int firstInteger = inputInteger("First");
            int secondInteger = inputInteger("Second Integer: ");            
                 
            if(firstInteger<secondInteger){
                  performWhileLoops(firstInteger,secondInteger);
                  displayAll();
            }else
               System.out.print("\nSecond Integer must be greater than First Integer");
                         
       
           
     }
     public static int inputInteger(String message){
            Scanner scanner = new Scanner(System.in);
            System.out.print(message + "Integer: ");
            int integer = scanner.nextInt();
            return integer;
     }
     public static void performWhileLoops(int firstInteger,int secondInteger){
         
         while(firstInteger<=secondInteger){
                        int number = firstInteger;
                        if(number%2 == 0){
                             sumOfEvenNumber += number;
                             sumSquareOfEvenNumber += Math.pow(number,SQUARE);
                         }
                        else{
                           oddNumber += number + " "; 
                           sumSquareOfOddNumber += Math.pow(number,SQUARE);
                         }
                             firstInteger++;
                     }
          }
        public static void displayAll(){
            System.out.println("\nOutput all odd numbers between firstNum and secondNum: " + oddNumber 
                   + "\nOutput the sum of all the even numbers between firstNum and secondNum inclusive: " + sumOfEvenNumber
                   +"\nOutput the sum of the squares of all the even numbers between firstNum and secondNum inclusive: " + sumSquareOfEvenNumber
                   +"\nOutput the sum of the squares of all the odd numbers between firstNum and secondNum inclusive: " + sumSquareOfOddNumber);   
          
       }
}