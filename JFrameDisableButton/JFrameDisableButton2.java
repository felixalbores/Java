/*
  a.Write an application that instantiates a JFrame that contains a 
   JButton. Disable the JButton after the user clicks it. Save the file as 
   JFrameDisableButton.java.
   
 b.Modify the JFrameDisableButton program so that the JButton is 
   not disabled until the user has clicked at least eight times. At that 
   point, display a JLabel that indicates “That’s enough!” Save the file as 
   JFrameDisableButton2.java. 

*/

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrameDisableButton2 implements ActionListener{
   
   JFrame frame = new JFrame("Disable Frame");
   JLabel label = new JLabel();
   JButton button = new JButton("This is a button");
   final byte MAX = 8; 
   byte count = 1;
  
 
   public JFrameDisableButton2(){
      
      frame.setSize(300,100);
      frame.setLayout(new FlowLayout());
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      frame.add(button);
      button.addActionListener(this);
      
      frame.add(label);
      
   }
   
   
   @Override
   public void actionPerformed(ActionEvent e){
       
     System.out.print(count); //8 times
      if(count++ == MAX){
         button.setEnabled(false);
         label.setText("That's Enough");
      }
      
   }
   
   public static void main(String[] args){
      JFrameDisableButton2 disableButton = new JFrameDisableButton2();
     
   }
}