import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.*;

public class JBookQuote2 extends JFrame implements ActionListener {
      
      JButton button_1 = new JButton("");
      JButton button_2 = new JButton("");
      JLabel  bookQuote_1 = new JLabel("Keep on asking, and it will be given you; keep on seeking, and you will find; keep on knocking, and it will be opened to you.Dont give up until you find answers that you can trust. - Bible");
      JLabel  bookQuote_2 = new JLabel("Every disadvantege has its advantage");
      
      public JBookQuote2(){
            super("Favorite Book");
            setLayout(new FlowLayout());
            setSize(500,100);
            
            add(button_1);
            add(button_2);
            
            button_1.addActionListener(this);
            button_2.addActionListener(this);
            
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
            
      }
      
    @Override
    public  void actionPerformed(ActionEvent e){
        Object source = e.getSource();

       if(source == button_1)
            add(bookQuote_1);
       else
            add(bookQuote_2);
      
       setVisible(true);

   }    
    
   public static void main(String[] args){
          JBookQuote2 frame = new JBookQuote2();
          
       
   }
}