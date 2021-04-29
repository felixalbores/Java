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
        
         System.out.println("C -CollegeEmployee \t F-Faculty \t S-Student");
         char choose = ' ';
         while(choose != 'Q'){
             
              System.out.print("Type of Person Data:(C,F,S) or  Q for Quit: ");
              choose = scanner.next().toUpperCase().charAt(0);  
                
                   switch(choose){
                        case 'C':
                           if(countEmployee<collegeEmployee.length){
                              collegeEmployee[countEmployee] = new CollegeEmployee();
                              collegeEmployee[countEmployee].setFields();
                              countEmployee++;
                            }else{System.out.println("Array CollegeEmployee is Full!");}
                              break;   
                        case 'F' :
                            if(countFaculty<faculty.length){
                               faculty[countFaculty] = new Faculty();
                               faculty[countFaculty].setFields();
                               countFaculty++;
                            }else{System.out.println("Array Faculty is Full");}
                           break;
                        case 'S':
                            if(countStudent<student.length){
                               student[countStudent]= new Student();
                               student[countStudent].setFields();
                               countStudent++;
                             }else{System.out.println("Array Student is Full: ");}
                            break;
                         case 'Q':
                              System.out.println("Quit");
                              break;
                         default:
                           System.out.println("Invalid Input");  
                 }
           }
           
             
             //Display CollegeEmployee
             for(int i = 0;i< countEmployee;i++){
                  System.out.println("\nCollege Employee Information: " + (i+1));
                  collegeEmployee[i].display();
             }
             
            //Display Faculty
            for(int i = 0;i< countFaculty;i++){
                  System.out.println("\nFaculty Information: " + (i+1));
                  faculty[i].display();
             } 
             
            //Display Student
            for(int i = 0;i<countStudent;i++){
                  System.out.println("\nStudent Information: " + (i+1));
                  student[i].display();
             }   
                   
    }
}
