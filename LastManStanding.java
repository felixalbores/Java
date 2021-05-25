import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.*;
public class LastManStanding extends JFrame implements ItemListener,ActionListener{

   JCheckBox box_1 = new JCheckBox();
   JCheckBox box_2 = new JCheckBox();
   JCheckBox box_3 = new JCheckBox();
   JCheckBox box_4 = new JCheckBox();
   JCheckBox box_5 = new JCheckBox();
   JCheckBox box_6 = new JCheckBox();
   JCheckBox box_7 = new JCheckBox();
   JCheckBox box_8 = new JCheckBox();
   JCheckBox box_9 = new JCheckBox();
   JCheckBox box_10 = new JCheckBox();
   
   //Button Click
   JButton button = new JButton("Click to Complete");
   
   public LastManStanding(){
      super("Last Man Standing");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      
      //add the JCheckBox in a JFrame
      add(box_1);
      add(box_2);
      add(box_3);
      add(box_4);
      add(box_5);
      add(box_6);
      add(box_7);
      add(box_8);
      add(box_9);
      add(box_10);
     
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
   public void itemStateChanged(ItemEvent event){
      System.out.print("It's work");
   }
   
   @Override
   public void actionPerformed(ActionEvent e){
      System.out.print("Action Performed");
   }
   
   public static void main(String[] args){
      LastManStanding a = new LastManStanding();
      a.setSize(300,100);
      a.setVisible(true);
   }
}