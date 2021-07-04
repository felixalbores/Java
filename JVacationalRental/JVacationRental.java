/*
Write an application for Lambert’s Vacation Rentals. Use separate ButtonGroups to allow a client to select one of three locations,
the number of bedrooms, and whether meals are included in the rental. Assume that the locations are parkside for $600 per week, 
poolside for $750 per week, or lakeside for $825 per week. Assume that the rentals have one, two, or three bedrooms and 
that each bedroom greater than one adds $75 to the base price.Assume that if meals are added, the price is $200 more per rental.
Save the file as JVacationRental.java
*/
import javax.swing.ButtonGroup;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class JVacationRental extends JFrame implements ItemListener{ 
   
   
   
   ButtonGroup side = new ButtonGroup();
   JCheckBox parkSide = new JCheckBox("$600 perWeek ParkSide");
   JCheckBox poolSide = new JCheckBox("$750 perWeek PoolSide");
   JCheckBox lakeSide = new JCheckBox("$825 perWeek LakeSide");

   

   ButtonGroup bed = new ButtonGroup();
   JCheckBox oneBedRoom = new JCheckBox("One Bed Room");
   JCheckBox twoBedRoom = new JCheckBox("Two Bed Room");
   JCheckBox threeBedRoom = new JCheckBox("Three Bed Room"); 
   
   ButtonGroup mealGroup = new ButtonGroup();
   JCheckBox meal = new JCheckBox("Meals");
   JCheckBox noMeal = new JCheckBox("No Meals");
   
      
   //Base Price
   final short BASE_PRICE = 200;
   final short PARK_SIDE = 600;
   final short POOL_SIDE = 750;
   final short LAKE_SIDE = 825;
   final byte ADD_PRICE = 75;
   int totalPrice = 0;
   
   JLabel priceLabel = new JLabel("Total Price ");
   JTextField totalAmount = new JTextField(4);
   
   
  int count = 0; 
   public JVacationRental(){
      super("Lambert's Vacation's Rental's");
      setSize(550,150);
      setLayout(new FlowLayout());
      setResizable(false);
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
      
      add(priceLabel);
      add(totalAmount);
      
      //Meals
      add(meal);
      mealGroup.add(meal);
      meal.addItemListener(this);
      add(noMeal);
      mealGroup.add(noMeal);
      noMeal.addItemListener(this);
      
      totalAmount.setText("$" + totalPrice);
    
   }
   
   @Override
   public void itemStateChanged(ItemEvent event){
     Object source  = event.getSource();
     int select = event.getStateChange();
    
  //Location Side
  //When the checkBox is check, one of the three location and and one of the three room. it automatically changes the total price. 
     if(source == parkSide)
         if(select == ItemEvent.SELECTED)
               totalPrice += PARK_SIDE;
         else
              totalPrice -=PARK_SIDE;
    else if(source == poolSide)
         if(select == ItemEvent.SELECTED)
               totalPrice += POOL_SIDE;
         else
               totalPrice -= POOL_SIDE;    
    else if(source == lakeSide)
         if(select == ItemEvent.SELECTED)
              totalPrice += LAKE_SIDE;
         else
              totalPrice -= LAKE_SIDE;
   
  //Each bedroom greater than one add $75 dollars to the basePrice.- base price is 0
    final short THREE_BED_ROOM_PRICE = 150;
     if(source == twoBedRoom)
         if(select == ItemEvent.SELECTED)
               totalPrice += ADD_PRICE;
         else
               totalPrice -= ADD_PRICE;
      else if(source == threeBedRoom)
            if(select == ItemEvent.SELECTED)
                totalPrice += THREE_BED_ROOM_PRICE;
            else
               totalPrice -= THREE_BED_ROOM_PRICE;  
     
     //Meals 
     if(source == meal)
         if(select == ItemEvent.SELECTED)
               totalPrice += BASE_PRICE;
         else
             totalPrice -= BASE_PRICE; 
     
            
       totalAmount.setText("$" + totalPrice);
        
   }
   
   
   public static void main(String args[]){
      JVacationRental frameRental = new JVacationRental();
   }
}