public class Couple{
   Person male;
   Person female;
   
               
   public Couple(Person male,Person female){
      this.male = male;
      this.female = female;
   }
   public Person getMale(){return male;}
   public Person getFemale(){return female;}
}