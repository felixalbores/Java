public class BusinessLoan extends Loan{
   
    
      public BusinessLoan(int loanNumber,String customerLastName, int amountOfLoan,short term,double primeInterestRate){
           super(loanNumber,customerLastName,amountOfLoan,term);
           interestRate = 0.01/(primeInterestRate/100); 
      }  
}