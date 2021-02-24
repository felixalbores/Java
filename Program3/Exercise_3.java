/*
Prelim - Programming ExerciseNo3

In a right triangle, 
the square of the length of one side is equal to the sum of the squares of the lengths of the other two sides. 
Write a program that prompts the user to enter the lengths of three sides of a triangle 
and then outputs a message indicating whether the triangle is a right triangle.

*/

import java.util.Scanner;
public class Exercise_3{

   public static void main(String args[]){      
      double sideA = readSide("A: ");
      double sideB = readSide("B: ");
      double sideC = readSide("C: ");
     
       if((sideA+sideB) == sideC)
         System.out.print("It's a Right Triangle.");
     else
         System.out.print("It's not a Right Triangle.");
   }
   public static double readSide(String message){
      Scanner scanner = new Scanner(System.in);
      System.out.print("Lenght of Side " + message);
      double side = Math.pow(scanner.nextInt(),2);
      return side;  
   }
}