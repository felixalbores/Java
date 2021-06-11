/*
a. Write an application that displays a JFrame containing the opening sentence 
or two from your favorite book. Save the file as JBookQuote.java.

b. Add a button to the frame in the JBookQuote program. When the user clicks 
the button, display the title of the book that contains the quote. Save the file 
as JBookQuote2.java
*/


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.*;

public class JBookQuote2 extends JFrame implements ActionListener {
      
      JButton button = new JButton("Click Here");
      JLabel label = new JLabel();
      String bookQuote = "Keep on asking, and it will be given you; keep on seeking, and you will find; keep on knocking, and it will be opened to you.Dont give up until you find answers that you can trust. - Bible";
         
      public JBookQuote2(){
            super("Favorite Book");
            setLayout(new FlowLayout());
            setSize(300,100);
            
            add(button);
            button.addActionListener(this);

            
            add(label);
            
            setDefaultCloseOperation(EXIT_ON_CLOSE);

            
      }
      
    @Override
    public  void actionPerformed(ActionEvent e){
//    remove(button);
//       validate();
  
      label.setText("Zzzz");
          repaint();
   }    
    
   public static void main(String[] args){
          JBookQuote2 frame = new JBookQuote2();
          frame.setVisible(true);
       
   }
}