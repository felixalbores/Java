import java.util.Scanner;
public class CollegeList{
   
   public static void main(String[] args){
       
       Scanner scanner = new Scanner(System.in);
       
         Person[]  collegeEmployee = new CollegeEmployee[4];
         Person[]  faculty = new Faculty[3];
         Person[]  student = new Student[7]; 
        
        int countEmployee = 0;
        int countFaculty = 0;
        int countStudent = 0; 
        
        System.out.print("C for College Employee\t F for Faculty \t S for Student\nChoose: ");
        char choose = scanner.next().toUpperCase().charAt(0);
         
          switch(choose){
               case 'C':
                  collegeEmployee[countEmployee++] = new College   
          }
    }
}
