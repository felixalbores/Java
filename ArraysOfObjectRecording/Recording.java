public class Recording {
  
   private String title;
   private String artist;
   private String second;
   
   //setters
   public void setTitle(String title){this.title = title.toLowerCase();}
   public void setArtist(String artist){this.artist = artist.toLowerCase();}
   public void setSecond(int second){this.second = Integer.toString(second);}
   
   //getters
   public String getTitle(){return title;}
   public String getArtist(){return artist;}
   public String getSecond(){return second;}
      
}