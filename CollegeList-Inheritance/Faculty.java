import javax.swing.JOptionPane;
public class Faculty extends CollegeEmployee{
   
    private boolean tenured;
   
      public void setFields(){
         super.setFields();
         tenured = Boolean.valueOf(JOptionPane.showInputDialog(null,"Is the Faculty tenured: "));
      }
     
      
      public void display(){
         super.display();
           System.out.println("\nFaculty Tenured: " + tenured);

      }
}