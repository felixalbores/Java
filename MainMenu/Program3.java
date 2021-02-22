/**
   ALBORES, Felix  BSIT-2
   Data Struct21
   3:00-5:30 MW

   A program that would accept an integer which represents an option 
   in the menu.
   Provide necessary prompts, messages, conversion and validation
   
   Main Menu
   --------------------------------------------
   1. Accept two(2) positive integers (1->10)
   2. Compute the sum of inputted integers
   3. Compute the product of inputted integers
   4. Compute the quotient of inputted integers(real)
   5. Compute the difference of inputted integers
   0. Quit
   --------------------------------------------
   Enter Option(0..5):    
*/

import java.util.Scanner;
public class Program3 {
   static Scanner scanner = new Scanner(System.in);
   static int firstInteger = 0;
   static int secondInteger = 0;
   public static void main(String[] args) {

        int option;
        try {
            while (true) {
                option = chooseAndDisplayMenu();
                if (option == 1) {
                    firstInteger = optionOne("First ");
                    secondInteger = optionOne("Second ");
                } else if (option == 2)
                    System.out.println("The sum is " + (firstInteger + secondInteger));
                else if (option == 3)
                    System.out.println("The product is " + (firstInteger * secondInteger));
                else if (option == 4)
                    System.out.println("The quotient is " + (firstInteger / secondInteger));
                else if (option == 5)
                    System.out.println("The difference is " + (firstInteger - secondInteger));
                else if (option == 0)
                    break;
            }
        }catch(Exception e){
            System.out.print("Invalid Input");
        }
    }

    public static byte chooseAndDisplayMenu(){//they go here
        System.out.println("\nMain Menu"
                + "\n--------------------------------------------"
                + "\n1. Accept two(2) positive integers (1->10)"
                + "\n2. Compute the sum of inputted integers"
                + "\n3. Compute the product of inputted integers"
                + "\n4. Compute the quotient of inputted integers(real) "
                + "\n5. Compute the difference of inputted integers"
                + "\n0. Quit");
        byte choose;
        while(true){
            System.out.print("Enter Option(0-5): ");
            choose = scanner.nextByte();
            if(choose>=0 && choose<=5)
                break;
            System.out.println("Can only be input from 0 to 5");
        }
        return choose;
    }
        public static int optionOne(String message){
            int positiveInteger;
            while(true){
                System.out.print(message + "Positive Integer(1-10): ");
                positiveInteger = scanner.nextInt();
            if(positiveInteger>=1 && positiveInteger<=10)
                break;
            System.out.println("Can only be inputted from 1 to 10! Try Again ");
        }
        return positiveInteger;
    }
}