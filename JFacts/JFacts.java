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

public class JFacts extends JFrame implements ActionListener{
    
    String[] factsTopic = {"Earth is the only planet not named after a god.",
                          "In a lifetime, you make 396 friends, but only 1 out of 12 friendships lasts.",
                          "Killer whales are actually dolphins",
                          "Hummingbirds are the only known birds that can also fly backwards",
                          "Octopuses have three hearts, nine brains, and blue blood",
                          "The shortest living animal in the world is the Mayfly. It’s entire lifespan is just 24hrs",
                          "20% of Earth’s oxygen is produced by the Amazon rainforest",
                          "Venus is the only planet to spin clockwise",};
    
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
         setVisible(true);
         
         
         for(int i = 0;i<facts.length;i++){
            facts[i] = new JLabel(factsTopic[i]);
            add(facts[i]);
         }
         
         add(button);
         button.addActionListener(this);
         
      }
      
      @Override
      public void actionPerformed(ActionEvent event){
            
      }
      
       
     public static void main(String[] args){
         JFacts frame = new JFacts();
     }
}