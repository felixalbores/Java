import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.Random;

public class LastManStanding extends JFrame implements ActionListener{
   int countPick = 0;
   final int MAX_PICK = 2;
   int i = 0;

   Object[] instances = new Object[10];
   JCheckBox[] box = new JCheckBox[10];
   JButton button = new JButton("Click to Complete");
   
   public LastManStanding(){
         super("Last Man Standing");
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         setLayout(new FlowLayout());
         
         //CheckBox
         for(int i = 0;i<box.length;i++){
            box[i] = new JCheckBox();
            add(box[i]);
            box[i].addActionListener(this);
         }
         
         //For the button 
         add(button); 
         button.addActionListener(this);
     
      }
   

   @Override
   public void actionPerformed(ActionEvent event){
         Object source = event.getSource();
       
         instances[i++] = source; //6,7,8 (naay sud) --first mani sya
             
       if(source instanceof JCheckBox)  
             ((JCheckBox)source).setEnabled(false);
     
     if(countPick++ == MAX_PICK) //enabled false all
       for(int i = 0; i<10;i++)
            box[i].setEnabled(false); 
     
      if(source instanceof JButton){
        for(int i = 0;i<10;i++)
           if(instances[i] == null)
               box[i].setEnabled(true);
      }
      
   }
   
   public static void main(String[] args){
      LastManStanding a = new LastManStanding();
      a.setSize(300,100);
      a.setVisible(true);
   }
}