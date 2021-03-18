//SAMpLE
/* Create a class Person with the following attributes:
-	lastname : String
-	firstname: String
-	gender: char
-  birthdate: Birthdate
Create the appropriate constructors, setters and getters
Create 3 objects of the Person class*/
import java.time.LocalDate; 
import java.time.Period;
public class Person{
   String lastName;
   String firstName;
   char gender;
   LocalDate  birthDate;

   public Person(String lastName, String firstName, char gender,int year,int month,int day){
      this.lastName = lastName;
      this.firstName = firstName;
      this.gender = gender;
      birthDate = LocalDate.of(year,month,day);
   }


 public int getAge(){
   LocalDate today = LocalDate.now();
   int age = Period.between(birthDate,today).getYears();
   return age;
 }
 /*
 public String getZodiac(){
   March 21 - April 19 - Aries -- April 19 
 
 //return the zodiac sign of a person based on his birthdate.
 //search the zodiac signs online.
 }
 */
   public static void main(String args[]){
      Person p1 = new Person("Albores","Felix",'M',2000,12,26);
      int a = p1.birthDate.getDayOfMonth();//26
      System.out.println(p1.birthDate.getMonthValue());
      System.out.println(a);
         System.out.print("Aries");
      
   }
}