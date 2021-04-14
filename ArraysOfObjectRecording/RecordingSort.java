import java.util.Scanner;
 
 public class RecordingSort{
         
        
        static Scanner scanner = new Scanner(System.in);
        static Recording[] records = new Recording[3];
       
          //Prompt the User Method
          public static Recording promptUser(){
   
              Recording record = new Recording();
             
              System.out.print("Song Title: ");     
              record.setTitle(scanner.nextLine());
            
              System.out.print("Artist: ");
              record.setArtist(scanner.nextLine());
            
              System.out.print("Playing Time in Second: ");
              record.setSecond(scanner.nextInt());
      
             return record;
      }
   
        //Sorting Method
      public static void sorting(int choose){
                     
                //Sorting For SongTitle
                if(choose == 1){
               	int comparisonToMake = records.length - 1;
      				for (int i = 0; i < comparisonToMake; i++) {
      					for (int j = 0; j < comparisonToMake; j++) {
      						int k  = j + 1;
      							if (records[j].getTitle().compareTo(records[k].getTitle()) > 0) {
      								Recording temp = records[j];
      								records[j] = records[k];
      								records[k] = temp;
      							}	        
                     }     
                  }
              }//Sorting for Artist
              else if(choose == 2){
                 int comparisonToMake = records.length - 1;
      				for (int i = 0; i < comparisonToMake; i++) {
      					for (int j = 0; j < comparisonToMake; j++) {
      						int k  = j + 1;
      							if (records[j].getArtist().compareTo(records[k].getArtist()) > 0) {
      								Recording temp = records[j];
      								records[j] = records[k];
      								records[k] = temp;
      							}	        
                     }     
                  }
              }//Sorting for Playing Time in a Second
              else if (choose == 3){
                int comparisonToMake = records.length - 1;
      				for (int i = 0; i < comparisonToMake; i++) {
      					for (int j = 0; j < comparisonToMake; j++) {
      						int k  = j + 1;
      							if (records[j].getSecond().compareTo(records[k].getSecond()) > 0) {
      								Recording temp = records[j];
      								records[j] = records[k];
      								records[k] = temp;
      							}	        
                     }     
                  }
              }
              
 }  
          //display Method
           public static void display(){
                           
               for(int i = 0;i<records.length;i++){
                    System.out.print("Song Title: " + records[i].getTitle() + "\t\tArtist: " + records[i].getArtist() + "\t\t\tSeconds: " + records[i].getSecond());
                    System.out.println();
                }
          }
   
       public static void main(String args[]){
            
         for(int i = 0;i<records.length;i++){
                  System.out.println("Recording " + (i+1) + " :");
                     records[i] = promptUser();
                     scanner.nextLine();
                    System.out.println();
            }
      
      //Choosing  Field which being be sorted  
       System.out.print("\nEnter which Field The Recording be Sorted: \n1.Song Title 2.Artist 3.Playing Time in Second\nChoose: " );
          int choose;
            while(true){
             choose = scanner.nextInt();                
              if(choose>=1 && choose<=3)
               break;
               System.out.print("Choose 1,2 and 3 only: ");
           }
         sorting(choose);
         display();      
      }
 }

