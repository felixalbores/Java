import java.time.LocalDate;

public class Person{
      
      String firstName;
      String lastName;
      LocalDate birthDate;
      
      public Person(String firstName, String lastName,int year,int month, int days){
         this.firstName = firstName;
         this.lastName = lastName;
         birthDate = LocalDate.of(year,month,days);
      }
      public String getFirstName(){return firstName;}
      public String getLastName(){return lastName;}
      public LocalDate  getBirthDate(){return birthDate;}
      
}