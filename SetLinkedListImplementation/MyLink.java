/**
   MyLink class
*/
public class MyLink{
   //define the attributes of MyLink
   private Object item;
   private MyLink next;
   
   //define constructor
   public MyLink(Object item) { this.item=item; }
   //define a default constructor
   public MyLink()            {}
   //setters
   public void setItem(Object item) { this.item=item; }
   public void setNext(MyLink next) { this.next=next; }
   //getters
   public Object getItem()          { return item; }
   public MyLink getNext()          { return next; }
}//end of class