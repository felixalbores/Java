/*
a.Write an application that allows a user to select one of at least five television 
shows to watch on demand. When the user selects a show, display a brief synopsis. Save the file as JTVDownload.java

   
*/
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class JTVDownload extends JFrame implements ItemListener{
   
   String[] televisionShowArray = {"Nevertheless","18 Again","mine","Trese","The 100"}; 
   String[] briefSypnosisArray = {"An uncertain romance begins between a heartbroken woman who no longer believes in love and a flirtatious man who does not want to commit to a relationship",
                                 "Jung Da-jung (Kim Ha-neul) and Hong Dae-young (Yoon Sang-hyun) are married and have a set of fraternal twins, Hong Shi-ah (Roh Jeong-eui) and Hong Shi-woo (Ryeoun [ko]).",
                                 "The series glimpses into the high society's lifestyle and follows strong and ambitious women who are trying to find the real 'mine'.Seo Hi-soo (Lee Bo-young), a former top actress.",
                                 "It tells the story of Alexandra Trese,a detective who deals with crimes of supernatural origin.Its first issue was published in 2005, and the series went on to win several accolades.",
                                 "Ninety-seven years after a devastating nuclear apocalypse wipes out almost all life on Earth, thousands of people now live in a space station orbiting Earth, which they call the Ark."};
   
   JComboBox televisionShow = new JComboBox(televisionShowArray);
   JTextField televisionTextField = new JTextField(briefSypnosisArray[0],89);
   
   public JTVDownload(){
      super("5 Television Shows");
      setSize(1000,100);
      setLayout(new FlowLayout());
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      
     add(televisionShow);
     televisionShow.addItemListener(this);
     add(televisionTextField);
    
   }      
   
   @Override
   public void itemStateChanged(ItemEvent list){
      Object source = list.getSource();
      
      if(source == televisionShow){
         int num = televisionShow.getSelectedIndex();
         televisionTextField.setText(briefSypnosisArray[num]);
      }
   setVisible(true);
   }

   public static void main(String args[]){
      JTVDownload frame = new JTVDownload();
    
   }
}