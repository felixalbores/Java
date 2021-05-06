public class PersonaLoan extends Loan{
      
      
      
      public PersonaLoan(int loanNumber,String customerLastName, int amountOfLoan,short term,double primeInterestRate){
           super(loanNumber,customerLastName,amountOfLoan,term);
            interestRate =  0.02/(primeInterestRate/100); 
      } 
      
}