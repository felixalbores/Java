import java.util.Scanner;
public class BankAccount{

   static double newBalance;   
   static Scanner scanner = new Scanner(System.in);
   
   public static void main(String args[]){
   
      int accountNumber = inputNumber("Account Number: ");
      char accountType = inputType("Account Type(S/s-Savings or C/c-Checking): ");
      int minimumBalance = inputNumber("Minimum Balance: ");
      int currentBalance = inputNumber("Current Balance: ");
 
      if(accountType == 'S')
        newBalance = calculateSavingsBalance(currentBalance,minimumBalance);
      else
         newBalance = calculateCheckingBalance(currentBalance,minimumBalance);
         
     displayCustomerInformation(accountNumber,accountType,currentBalance,newBalance);
   } 
   
   //Input Integers
   public static int inputNumber(String message){
      System.out.print(message);
      int value = scanner.nextInt();
      return value;
   }
   //Input Char
   public static char inputType(String message){
      char accountType;
      while(true){
         System.out.print(message);
         accountType = scanner.next().toUpperCase().charAt(0);
         if(accountType == 'C' || accountType == 'S')
            break;  
         System.out.println("Inappropriate Input");  
      }
      return accountType;
   }
   
   //Savings Account 
   public static double calculateSavingsBalance(int currentBalance,int minimumBalance){
   final int SAVINGS_CHARGE = 10;
   final double SAVINGS_INTEREST_RATE = 0.04;
      if(currentBalance<minimumBalance)
         newBalance = currentBalance - SAVINGS_CHARGE;
      else
         newBalance = currentBalance * SAVINGS_INTEREST_RATE + currentBalance;
        return newBalance;
   }  
   //Checking Account 
   public static double calculateCheckingBalance(int currentBalance,int minimumBalance){
     final int CHECKING_MAX_BALANCE = 5_000;
     final int SERVICE_CHARGE = 25;
     final double INTREREST_RATE_LOW = 0.03;
     final double INTEREST_RATE_HIGH = 0.05;
     
   if(currentBalance<minimumBalance)
      newBalance = currentBalance - SERVICE_CHARGE;
   else if(currentBalance<(minimumBalance + CHECKING_MAX_BALANCE))
      newBalance = currentBalance * INTREREST_RATE_LOW + currentBalance;   
    else
      newBalance = currentBalance * INTEREST_RATE_HIGH + currentBalance;
      
      return newBalance;   
   }
   
   public static void displayCustomerInformation(int accountNumber,
                                                 char accountType,
                                                 double currentBalance,
                                                 double newBalance){
   System.out.print("\n--------Output--------");
   System.out.print("\nAccount Number: " + accountNumber
                     +"\nAccount Type: " + accountType);
   System.out.printf("\nCurrent Balance: $%.2f",currentBalance);
   System.out.printf("\nNew Balance: $%.2f", newBalance);
   
   }
}