/**
  MyListArray
*/
public class MyListLinkedList implements MyListInterface {
      MyLink head,tail,temp;
      int count;
     
      
     public MyListLinkedList(String[] list){
         for(int i = 0;i<list.length;addItem(list[i]),i++);
     }
     
     public boolean isEmpty(){return count == 0;}
     public boolean isFull(){return false;}

     //Add Item
     public boolean addItem(Object item){
          boolean ok = !isItem(item);
            MyLink newLink = null; 
              if(ok){
                   newLink = new MyLink(item);
                  if(!isEmpty()) 
                     tail.setNext(newLink);
                   else
                     head = newLink;
                     tail = newLink;
                     count++;
                     
              }
              return ok;
     }
     
     //IsItem
     public boolean isItem(Object item){
         boolean found = false;
         //create traversing link
            for(MyLink tlink = head; tlink != null; tlink = tlink.getNext()){
                if(tlink.getItem().equals(item) ){
                  temp = tlink;
                  found = true; 
                  break;
                 }
            }
            return found;
     }
     
     //DeleteItem
     public boolean deleteItem(Object item){
          boolean ok = isItem(item);
            if(ok){
                if(head == temp)
                  head = temp.getNext();
               else{    
                    MyLink temp2 = head;                     
                    for(;temp2.getNext() != temp;temp2 = temp2.getNext()); //Process to the previous node
    
                  if(temp == tail){
                      tail = temp2;
                      tail.setNext(null);
                   }
                   else temp2.setNext(temp.getNext());
               }     
                temp = null;
                  count--;      
            }
 
         return ok;
     }
     

    //insertAfter()
    public boolean insertAfter(Object item,Object newitem){
         boolean ok = isItem(item);
     
     MyLink link = null;
     if(ok){
            link = new MyLink(newitem);
               if(temp == tail){
                  tail.setNext(link);
                  tail = link;
               }else{
                   MyLink temp2 = temp.getNext();
                   temp.setNext(link);
                   link.setNext(temp2);
              }
           count++;
       }
        return ok;   
    }    
    
    
   //InsertBefore                                   
     public boolean insertBefore(Object item1, Object item2){
      boolean ok = isItem(item1);
         MyLink link = null;
             if(ok){
                  link = new MyLink(item2);
                  if(head == temp){
                        link.setNext(head);
                        head = link;
                  }    
                    else{       
                        MyLink temp2 = head;                 
                        for(;temp2.getNext() != temp; temp2 = temp2.getNext());
                            temp2.setNext(link);
                            link.setNext(temp); 
                  }
                          count++;
            }
            return ok;
        }
        
    //ReplaceItem
   public boolean replaceItem(Object item,Object newitem){
        boolean ok = isItem(item);
         if(ok)temp.setItem(newitem);
      return ok;
   }
      //clear
      public void clear(){
           MyLink temp2 = null;
            for(;head != null;){
               temp2 = head;   
               head = temp2.getNext();
               temp2 = null;
               count--;
            }
      }
      public  int size(){return count;}
   
     //toString()
     public String toString(){
       StringBuffer sb = new StringBuffer();
            sb.append("[");
          for(MyLink tlink = head; tlink != null;tlink = tlink.getNext()){
               sb.append(tlink.getItem());
               if(tlink.getNext() != null)
                    sb.append(",");
          }
          sb.append("]");
          return sb.toString();
     }
}//end of class