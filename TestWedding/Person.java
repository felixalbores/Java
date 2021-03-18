import java.time.LocalDate;

public class Person{
      
      String firstName;
      String lastName;
      LocalDate birthDate;
      
      public Person(String firstName, String lastName,int year,int month, int days){
         this.firstName = firstName;
         this.lastName = lastName;
         this.birthDate = LocalDate.of(year,month,days);
      }
      
      
}