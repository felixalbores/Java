import javax.swing.JOptionPane;
//Parent Class
public class Person{

   private String firstName;
   private String lastName;
   private String streetAddress;
   private int zipCode;
   private int phoneNumber;
   
 
 
   public void setFields(){
         firstName = JOptionPane.showInputDialog(null,"First Name: ");
         lastName = JOptionPane.showInputDialog(null,"Second Name: ");
         streetAddress = JOptionPane.showInputDialog(null,"Street Address: ");
         zipCode = Integer.parseInt(JOptionPane.showInputDialog(null,"Zip Code: "));
         phoneNumber = Integer.parseInt(JOptionPane.showInputDialog(null,"Phone Number: "));
   }

      
      public void display(){
         System.out.print("\nFirst Name: " + firstName
                         +"\nLast Name: " + lastName
                         +"\nAddress: " + streetAddress
                         +"\nZip Code: " + zipCode
                         +"\nPhone Number: " + phoneNumber);
      }
}