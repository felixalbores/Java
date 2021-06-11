/*
Create an application with a JFrame and at least six labels that contain facts about 
your favorite topic—for example, the French Revolution or astronomy. Every 
time the user clicks a JButton, remove one of the labels and add a different one. 
Save the file as JFacts.java
*/

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class JFacts extends JFrame implements ActionListener{
    
    String[] factsTopic = {"Human Torch made the first appearance of any Marvel hero in the comics.",
                           "There are an estimated 100-400 billion stars in our galaxy, the Milky Way",         
                           "In a lifetime, you make 396 friends, but only 1 out of 12 friendships lasts.",
                           "Small pockets of air inside cranberries cause them to bounce and float in water.",
                           "There is no sound in space because molecules are too far apart to transmit sound.",
                           "The shortest living animal in the world is the Mayfly.It’s entire lifespan is just 24hrs.",
                           "20% of Earth’s oxygen is produced by the Amazon rainforest",
                           "Octopuses have three hearts, nine brains, and blue blood."};
    
    JLabel[] facts = new JLabel[6];
    JButton button = new JButton("Button");
    
    
    JLabel label_1 = new JLabel();
    JLabel label_2 = new JLabel();
    JLabel label_3 = new JLabel();
    JLabel label_4 = new JLabel();
    JLabel label_5 = new JLabel();
    JLabel label_6 = new JLabel();
      
      public JFacts(){
         super("Facts Topics");
         setSize(500,220);
         setLayout(new FlowLayout());
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         
         
         for(int i = 0;i<facts.length;i++){
            facts[i] = new JLabel(factsTopic[i]);
            add(facts[i]);
         }
         
         add(button);
         button.addActionListener(this);
         
         setVisible(true);
      }
      
      @Override
      public void actionPerformed(ActionEvent event){
          Random random = new Random();
          int r1 = random.nextInt(6);              
         
         remove(facts[r1]);
  
         validate();
         repaint();
        
    
      }
      
       
     public static void main(String[] args){
         JFacts frame = new JFacts();
     }
}