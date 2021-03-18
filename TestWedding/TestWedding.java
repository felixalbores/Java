/* Create a class named Person that holds the following fields: two String objects for the person’s first and
last name and a LocalDate object for the person’s birthdate. Create a class named Couple that contains
two Person objects. Create a class named Wedding for a wedding planner that includes the date of the
wedding, the names of the Couple being married, and a String for the location. Provide constructors for
each class that accept parameters for each field, and provide get methods for each of the field. Then
write a program that creates two Wedding objects and in turn passes each to a method that displays all
the details. Save the files as Person.java, Couple.java, Wedding,java, and TestWedding.java.
*/
public class TestWedding{
   public static void main(String args[]){
      Person male = new Person("Sakura","Haruno",2000,12,26);
      Person female = new Person("Felix","Albores",1998,6,21);
      Couple couple = new Couple(male,female);
      Wedding wedding  = new Wedding(male.getFirstName(),female.getFirstName(),2000,12,14,"St.Peter");
      displayAll(wedding);
           
     Person male_2 = new Person("Cardo","Dalisay",2000,1,12);
     Person female_2 = new Person("Alyana","Alyano",1998,11,26); 
     Wedding wedding_1 = new Wedding(male_2.getFirstName(),female_2.getFirstName(),1997,10,8,"St.Parish");
     displayAll(wedding_1);
      
   }
   
   public static void displayAll(Wedding wedding){
      System.out.print("\nCouple Information");
      System.out.println("\nBride: " + wedding.getBride()
                        +"\nBrideGroom: " + wedding.getBrideGroom()
                        +"\nWedding Date: " + wedding.getWeddingDate()
                        +"\nLocation: " + wedding.getLocation());
   }
}