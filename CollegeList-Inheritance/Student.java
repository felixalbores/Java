import javax.swing.JOptionPane;
public class Student extends Person{
     
     private String majorField;
     private double gradePoint;
     
     public void setFields(){
         super.setFields();
         majorField = JOptionPane.showInputDialog(null,"Major Field: ");
         gradePoint = Integer.parseInt(JOptionPane.showInputDialog(null,"Grade Point: "));
     }
     
     public void display(){
         super.display();
         System.out.println("\nMajor Field: " + majorField
                           +"\nGrade Point : " + gradePoint);
     }
}