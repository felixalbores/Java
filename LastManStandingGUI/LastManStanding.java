import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class LastManStanding extends JFrame implements ItemListener,ActionListener {
 
 int a,b,count;
 boolean computersTurn = false;
  
 JCheckBox[] box = new JCheckBox[10];
 JButton button = new JButton("Done");
 boolean[] isClick = new boolean[10];
 
 
 public LastManStanding()
 {
    super("LastManStanding");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
   
  
    for(a = 0; a < box.length; ++a)
    {
       box[a] = new JCheckBox();
       add(box[a]);
       box[a].addItemListener(this);
    }
    
    add(button);
    button.addActionListener(this);
 }
 

//this method run when JCheck click
 @Override
 public void itemStateChanged(ItemEvent check) {
    if(!computersTurn) {
     Object source = check.getItem();
       for(a= 0; a < box.length; ++a){
           if(source == box[a]) {
              box[a].setSelected(true);
                if(count < 3) { 
                    isClick[a] = true;
                       ++count;
               }
               else
                  box[a].setSelected(false);
                  a = 10;
            }
         }
     }
 }
 
 
 //this method run when the JButon Click
 @Override
 public void actionPerformed(ActionEvent e) {
    if(isCheckAll()) { 
       String winner = "You Wins";
       printWinner(winner);
    }else {
       computersTurn = true;
       int random = ((int)(Math.random() * 100) % 3);
        for(a = 0; a <= random; ++a) {
            for(b = 0; b < box.length; ++b) {
                if(!isClick[b]) {
                   isClick[b] = true;
                   box[b].setSelected(true);
                   b = 10;
                }
              }
          }
          computersTurn = false;
          if(isCheckAll()) { 
              String winner = "Computer Wins";
              printWinner(winner); 
          }
          count = 0;
    }
 }
 
 //isCheckAll method
 public boolean isCheckAll() {
       boolean isDone = true;
       for(a = 0; a < box.length; ++a) {
       if(!isClick[a])
       isDone = false;
      }
        return isDone;
 }
 
 //printWinner method
 public void printWinner(String winner)
 {
       for(a = 0; a < box.length; ++a)
       remove(box[a]);
       remove(button);
       JLabel done = new JLabel(winner);
       add(done);
       validate();
       repaint();
 }
 
  public static void main(String[] arguments)
   {
          LastManStanding frame = new LastManStanding();
          frame.setSize(360,100);
          frame.setVisible(true);
    }
}
