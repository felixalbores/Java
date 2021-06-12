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
    
    String[] factsTopic = {"Human Torch made the first appearance of any Marvel hero in the comics.",
                           "There are an estimated 100-400 billion stars in our galaxy, the Milky Way",         
                           "In a lifetime, you make 396 friends, but only 1 out of 12 friendships lasts.",
                           "Small pockets of air inside cranberries cause them to bounce and float in water.",
                           "There is no sound in space because molecules are too far apart to transmit sound.",
                           "The shortest living animal in the world is the Mayfly.It’s entire lifespan is just 24hrs."};
                           
    String[] newTopics = {"Approximately 43% of Republicans and 67% of Democrats believe in evolution.",
                          "Thomas Edison- He set up his first lab in his parent's basement at the age of 10.",
                          "The company that invented the modem was a successor of Alexander Graham Bell",
                          "A whiteout or heavy snowfall that makes it difficult to see, can make you feel sick.",
                          "A person can live about a month without food, but only about a week without water.",
                          "ASCII, invented in 1963, allowed characters to have uniformity across any computer.",
                          };
    
    
    JLabel[] facts = new JLabel[6];
    JButton button = new JButton("Button");
    JLabel[]  newFact = new JLabel[6];
    byte count = 0;
    byte MAX = 6;
    
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
               
         
         remove(facts[count]);
         //initialize                       //A whiteout or heavy
         newFact[count] = new JLabel(newTopics[count]); 
         add(newFact[count++]);//add the label in the JFrame
         
         //execute when its MAX = 6
         if(count == MAX){
            count = 0;
             newTopics = factsTopic;//array of String[] they it iniatilize  
             facts = newFact;//what happen here.
        }
            
         validate();
         repaint();
        
    
      }
      
       
     public static void main(String[] args){
         JFacts frame = new JFacts();
     }
}