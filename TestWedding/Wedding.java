import java.time.LocalDate;  
public class Wedding{
   String bride;
   String brideGroom;
   LocalDate weddingDate;
   String location;
   
   public Wedding(String bride, String brideGroom,int year,int month, int days,String location){
    this.bride = bride;
    this.brideGroom = brideGroom;
    weddingDate = LocalDate.of(year,month,days);
    this.location = location;
   }
   
   public String getBride(){return bride;}
   public String getBrideGroom(){return brideGroom;}
   public LocalDate getWeddingDate(){return weddingDate;}
   public String getLocation(){return location;}
   
}