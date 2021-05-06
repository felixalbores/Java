public abstract class Loan implements LoanConstants{
      
       private  int loanNumber;
       private String customerLastName;
       private int amountOfLoan;
       protected double interestRate;
       private short term;
      
       public Loan(int loanNumber,String customerLastName, int amountOfLoan,short term){
         
          this.loanNumber = loanNumber; 
          
             //amountOfLoan
               if(amountOfLoan <= MAX_AMOUNT)
                  this.amountOfLoan = amountOfLoan;
               else
                  System.out.print("Your loan amount is over $100,000!");
               
             this.customerLastName = customerLastName;
             
             //Term
              if(term == MEDIUM_TERM)
                 this.term = MEDIUM_TERM;
              else if(term == LONG_TERM)
                  this.term = LONG_TERM;
               else
                  this.term = SHORT_TERM;
      }
      
 
      public String toString(){
         return "\nLoanNumber " + loanNumber
                +"\nCustomer LastName: " + customerLastName
                +"\nAmount Of Loan " + amountOfLoan
                +"\nInterest Rate: " + interestRate * 100   //for decimal
                +"\nTotal Amount Owed: " + (amountOfLoan + (amountOfLoan * interestRate)) //
                +"\nTerm: " + term;
      }
}