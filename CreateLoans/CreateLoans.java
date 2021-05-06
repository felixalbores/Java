import java.util.Scanner;
public class CreateLoans{
     public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Loan[] loan = new Loan[5]; 
         
       System.out.print("Current Prime Interest Rate: ");
       double interestRate = scanner.nextDouble();
         
        
         for(int i = 0;i<loan.length;i++){
         
                char choose; 
                while(true){
                   System.out.println("\nLoan Type:["+(i+1)+"] B-BusinessLoan P-PersonalLoan  " );   
                   System.out.print("Choose: ");
                   choose = scanner.next().charAt(0);
                   if(choose == 'B' || choose == 'P')
                        break;
                 }

                System.out.print("Loan Number: ");
                int loanNumber = scanner.nextInt();
                
                System.out.print("Customer LastName: ");
                String customerLastName = scanner.next();
                
                System.out.print("AmountOfLoan: ");
                int amountOfLoan = scanner.nextInt();
                
                System.out.print("Term: ");
                byte term = scanner.nextByte();
               
               if(choose == 'B')
                     loan[i] = new BusinessLoan(loanNumber,customerLastName, amountOfLoan,term,interestRate);
               else
                    loan[i] =  new PersonaLoan(loanNumber,customerLastName,amountOfLoan,term,interestRate);
              
         }
        
         //Display
           for(int i = 0;i<loan.length;i++){
             System.out.println("\nLoan Information ["+ (i+1) +"]");
                System.out.println(loan[i]);
           }
    }
}