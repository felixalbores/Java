/*
Write an application for Lambert’s Vacation Rentals. Use separate 
ButtonGroups to allow a client to select one of three locations, the number 
of bedrooms, and whether meals are included in the rental. Assume that 
the locations are parkside for $600 per week, poolside for $750 per week, or 
lakeside for $825 per week. Assume that the rentals have one, two, or three 
bedrooms and that each bedroom greater than one adds $75 to the base price. 
Assume that if meals are added, the price is $200 more per rental. Save the file 
as JVacationRental.java
*/
import javax.swing.ButtonGroup;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JVacationRental extends JFrame implements ItemListener{ 
   
   
   
   ButtonGroup side = new ButtonGroup();
   JCheckBox parkSide = new JCheckBox("$600 perWeek ParkSide");
   JCheckBox poolSide = new JCheckBox("$750 perWeek PoolSide");
   JCheckBox lakeSide = new JCheckBox("$825 perWeek LakeSide");
   

   
   JCheckBox oneBedRoom = new JCheckBox("One Bed Room");
   JCheckBox twoBedRoom = new JCheckBox("Two Bed Room");
   JCheckBox threeBedRoom = new JCheckBox("Three Bed Room"); 
   ButtonGroup bed = new ButtonGroup();
   
   
   JTextField basePrice = new JTextField("Price",5);
   
  int count = 0; 
   public JVacationRental(){
      setSize(300,300);
      setLayout(new FlowLayout());
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      
      //Parking Area
      add(parkSide);
      side.add(parkSide);
      parkSide.addItemListener(this);
      
      
      add(poolSide);
      side.add(poolSide);
      poolSide.addItemListener(this);
      
      add(lakeSide);
      side.add(lakeSide);
      lakeSide.addItemListener(this);
      
      
      //Bed Room
      add(oneBedRoom);
      bed.add(oneBedRoom);
      oneBedRoom.addItemListener(this);
      
      add(twoBedRoom);
      bed.add(twoBedRoom);
      twoBedRoom.addItemListener(this);
      
      add(threeBedRoom);
      bed.add(threeBedRoom);
      threeBedRoom.addItemListener(this);
   }
   public void itemStateChanged(ItemEvent e){
      
      
      //Something wrong here everytime i clicked double it doesn't execute properly
       if(parkSide.isSelected())
         System.out.println("Park Side.");
       else if(poolSide.isSelected())
         System.out.println("Pool Side");
       else if(lakeSide.isSelected())
            System.out.println("LakeSide");
       else if(oneBedRoom.isSelected())   
            System.out.println("One Bed Room");
      else if(twoBedRoom.isSelected())
            System.out.println("Two Bed Room");
      else if(threeBedRoom.isSelected())
            System.out.println("Three Bed Room");
   }
   
   
   public static void main(String args[]){
      JVacationRental frameRental = new JVacationRental();
   }
}