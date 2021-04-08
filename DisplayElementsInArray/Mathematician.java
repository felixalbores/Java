/*
 Allow the user to enter numbers or elements. Create  methods to generate the following results:
 1. smallest number
 2. largest number
 3. sum of all elements
 4. display all even elements
 5. display all odd elements
 6. average of the elements
   Felix Albores
*/

import java.util.Scanner;

public class Mathematician{
 static Scanner console = new Scanner(System.in);
 
       public static int getElement(){
        return console.nextInt();
       }
       
       public static int [] getElements(int size){
           int [] list = new int[size];
           System.out.println("Enter " +size+ " elements:");
           for(int i = 0; i < list.length; i++)
           {
            System.out.print(i+1+".)");
            list[i] = getElement();
            }
            return list;
       }
       
       
       public static int getSum(int [] list){
           int sum = 0;
           for(int index:list)
            sum = sum + index;
           return sum;
       }
       
       public static double getAverage(int [] list){
        return (double)getSum(list)/list.length;
       }
       //(1)smallest Number
       public static int getSmallest(int[] list){                     
           int small = list[0];
           for(int i = 1;i<list.length;i++){
               if(small>list[i])
                  small = list[i];
           }
           return small;
       } 
       //(2)Largest Number
       public static int getLargest(int[] list){                     
           int large = list[0];
           for(int i = 1;i<list.length;i++){
               if(large<list[i])
                  large = list[i];
           }
           return large;
       } 
       //Even and Odd
       public static void displayEvenAndOdd(int[] list){
            
            String even = " ";
            String odd = " "; 
            for(int index: list){
               if(index%2 == 0)
                  even +=  index + "  "; 
               else
                  odd += index + " ";
            }
            System.out.println("Even Numbers are: " + even);
            System.out.println("Odd Numbers are: " + odd);
       }

       
 
 public static void display(int [] list){
   System.out.print("Elements are:");
      //for(int i = 0; i < list.length; i++)
      // System.out.print(list[i] + "  ");
      for(int value:list)
       System.out.print(value + " ");
      System.out.println();
 }
 public static void main(String [] args){
     System.out.print("How many elements would you like to enter:");
     int size = console.nextInt();
     int [] list = getElements(size);
     display(list);
     System.out.println("sum  = " + getSum(list));
     System.out.println("Average = " + getAverage(list));
     System.out.println("Smallest Number: " + getSmallest(list));
     System.out.println("Largest Number: " + getLargest(list));
     //Display Even and Odd Numbers
     displayEvenAndOdd(list);
 }
}