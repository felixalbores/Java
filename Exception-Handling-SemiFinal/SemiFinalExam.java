/**Write a short program that would accept 5 positive integers not greater than 20,
put the data in an Array and display the smallest, largest,
median(middle value among the inputted integers), 
sum and average of the inputted values.

The program must implements necessarry exception handler,
prompts(such as what to input) and messages(output labels ex. smallest = 5)
*/

import java.util.Scanner;
public class SemiFinalExam{
   public static void main(String args[]){
     
     Scanner scanner = new Scanner(System.in);
     int[] pInt = new int[5];    
     
   //Inputting Positive Integer 
     int i = 0; 
      while(true){
             System.out.print("Input " + (i+1) + ": ");
             int number = scanner.nextInt();
           if(number<20 && number>=1){ //if integers is not greater than 20 put the data in the array
                  pInt[i] = number;
                    i++;
                  if(i == pInt.length)
                      break;
             }
            else
               System.out.println("Can't put the data in the array! It's must be positive int or is not greater than 20");
      }
  
     int median = pInt[(int)pInt.length/2];
     int smallest = pInt[0];
     int largest =  pInt[0];
     int sum = pInt[0];
    //try catch
     try{              
            for(int j = 1;j<pInt.length;j++){ //arrayIndexOutOfBounds
                   if(pInt[j]>largest)
                        largest = pInt[j];
                   else if(pInt[j] < smallest)
                     smallest = pInt[j]; 
                   sum += pInt[j];
           }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.print(e.getMessage());
        }catch(Exception e){
            System.out.print(e.getMessage()); 
       }
      double average = (double)sum/pInt.length;

  
        //Display  
         System.out.println( "\nSmallest: " + smallest
                           + "\nLargest: "+ largest
                           + "\nMedian: " + median
                           + "\nSum: "+  sum
                           + "\nAverage: "+  average);  
   }  
}
 