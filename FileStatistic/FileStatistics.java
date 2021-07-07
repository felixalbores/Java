/*Create a file using any word-processing program or text editor. Write an 
application that displays the file’s name, containing folder, size, and time 
of last modification. Save the file as FileStatistics.java.*/
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.io.IOException;
import java.nio.file.Files;
public class FileStatistics
{
   public static void main(String[] args){
      Path file = Paths.get("C:\\Users\\User\\Desktop\\File.txt");
      
      System.out.println("File Name: " + file.getFileName()
                        +"\nContaining Folder: " + file);
                         
      
      try{
         BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
         System.out.println("Size: " + attr.size() + " bytes" 
                           + "\nTime of Last Modification: " + attr.lastModifiedTime());
      }catch(IOException e){
         System.out.println("Exception " + e);
      }
      
      
   }
}