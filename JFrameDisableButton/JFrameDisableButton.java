import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JFrameDisableButton implements ActionListener{
   
   JFrame frame = new JFrame("Disable Frame");
   JButton button = new JButton("This is a button");
      
 
   public JFrameDisableButton(){
      
      frame.setSize(300,100);
      frame.setLayout(new FlowLayout());
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      frame.add(button);
      button.addActionListener(this);
      
   }
   
   
   @Override
   public void actionPerformed(ActionEvent e){
      button.setEnabled(false);
      
   }
   
   public static void main(String[] args){
      JFrameDisableButton disableButton = new JFrameDisableButton();
     
   }
}