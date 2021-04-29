import javax.swing.JOptionPane;
public class CollegeEmployee extends Person {
      
      private String socialSecurityNumber;
      private double annualSalary;
      private String departmentName;
      
      
      public void setFields(){
         super.setFields();
         socialSecurityNumber =  JOptionPane.showInputDialog(null,"Social Security Number: ");
         annualSalary = Integer.parseInt(JOptionPane.showInputDialog(null, "Annual Salary: "));
         departmentName =  JOptionPane.showInputDialog(null, "Department Name: ");
      }
      
      public void display(){
         super.display();
         System.out.print("\nSocial Security Number: " + socialSecurityNumber
                         +"\nAnnual Salary: " + annualSalary
                         +"\nDepartment Name: " + departmentName);
      }
}