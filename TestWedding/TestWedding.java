public class TestWedding{
   public static void main(String args[]){
      Person p1 = new Person("Felix","Albores",2020,12,26);
      System.out.print(p1.birthDate);
   }
} 

/* Create a class named Person that holds the following fields: two String objects for the person’s first and
last name and a LocalDate object for the person’s birthdate. Create a class named Couple that contains
two Person objects. Create a class named Wedding for a wedding planner that includes the date of the
wedding, the names of the Couple being married, and a String for the location. Provide constructors for
each class that accept parameters for each field, and provide get methods for each of the field. Then
write a program that creates two Wedding objects and in turn passes each to a method that displays all
the details. Save the files as Person.java, Couple.java, Wedding,java, and TestWedding.java.
*/