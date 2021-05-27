import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.Random;
public class LastManStanding extends JFrame implements ActionListener{
   int countPick = 0;
   final int MAX_PICK = 2;
   //boxes-10
   JCheckBox[] checkBox = new JCheckBox[10];
   //Button Click
   JButton button = new JButton("Click to Complete");
   
   public LastManStanding(){
      super("Last Man Standing");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      
      //add the JCheckBox in a JFrame
      for(int i = 0;i<checkBox.length;i++)
         add(checkBox[i]);
     
      //For the button 
      add(button); 
      button.addActionListener(this);
      
      //addItemListener() 
      box_1.addActionListener(this);
      box_2.addActionListener(this);
      box_3.addActionListener(this);
      box_4.addActionListener(this);
      box_5.addActionListener(this);
      box_6.addActionListener(this);
      box_7.addActionListener(this);
      box_8.addActionListener(this);
      box_9.addActionListener(this);
      box_10.addActionListener(this);
   }
   

   @Override
   public void actionPerformed(ActionEvent event){
         Object source = event.getSource();
         if(source instanceof JCheckBox){
            ((JCheckBox) source).setEnabled(false);  
            
          }
                 
            
          }
         else
            if(source instanceof JButton){
            Random random = new Random();
              int randomNumber;
              for(int i = 0;i<10;i++){
                randomNumber = random.nextInt(10)+1;
                  System.out.println(randomNumber);
               }
               box_10.setSelected(true);   
               box_10.setEnabled(false);
            }
              //((JButton) source).setEnabled(false);  

   }
   
   public static void main(String[] args){
      LastManStanding a = new LastManStanding();
      a.setSize(300,100);
      a.setVisible(true);
   }
}