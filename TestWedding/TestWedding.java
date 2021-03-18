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