/**
     Name      : Felix Albores
     Subject   : Data Structure and Algorithm
     EDPCode  : 05173
     Schedule : MW - 3:00 - 5:30 PM
*/
import java.util.StringTokenizer;
public class MySetArray implements MySet{
      int size;
      Object[] set;
      int count;
      int index;//position
   
   public MySetArray(String[] newItems){
         size = newItems.length;
         set = new Object[size];
         for(int i = 0;i<size;i++){
            addItem(newItems[i]);
         }
   }
   public MySetArray(){}
   public MySetArray(int size){
      this.size = size;
      set = new Object[size];
   }
   //Empty()
   public boolean isEmpty(){return set[0] == null;}
   //Full
   public boolean isFull(){return count == size;}
   
   //IsItem
    public boolean isItem(Object item){
            boolean found = false;
            
          if(!isEmpty()){
            for(int i = 0;i<count;i++){
               if(set[i].equals(item)){
                 found = true;
                  index = i;
                 break;
               }   
            }
          }
            return found;
    }
   //Add Item
   public boolean addItem(Object item){
        boolean ok = isItem(item);
      
      if(!ok){
        if(!isFull()) 
          set[count++]  = item;
         else{
            size = count*2;
            Object[] newItems = new Object[size];
            for(int i = 0;i<count;i++)
               newItems[i] = set[i];
               set = newItems;
               set[count++] = item;
         }
          
       }   
         return ok;
}
   //Deleted Item
   public boolean deleteItem(Object item){
      boolean ok  = isItem(item);
         
         int i = index;
           if(ok){   
           try{    
                for(;i<count;i++)
                     set[i] = set[i+1];    
                        }catch(ArrayIndexOutOfBoundsException e){
                           set[i] = null;
                        }
                         count--;
                 }      
      return ok;
   }
   
   //clear
   public void clear(){
        int sizes = count;
        
        for(int i = 0;i<sizes;i++){
          set[i] = null;
          count--;
        }
   }
   
   
   //public MySet union(MySet paraset);
    public MySet union(MySet paraset){
         MySet result = new MySetArray(10);
         
         for(int i = 0;i<count;i++){
            result.addItem(set[i]);
         }      
         StringTokenizer st = new java.util.StringTokenizer(paraset.toString(),"{},");
         while(st.hasMoreTokens()){
            String token = st.nextToken();
            result.addItem(token);
         }
               return result;
      }
      
    //public MySet intersect(MySet paraset)
    public MySet intersect(MySet paraset){
         MySet result = new MySetArray(10);
         StringTokenizer st = new java.util.StringTokenizer(paraset.toString(),"{},");
         while(st.hasMoreTokens()){
            String token = st.nextToken();
               if(isItem(token))
                  result.addItem(token);
         }   
         return result;
    } 
    
    //Substract
    public MySet subtract(MySet paraset){
         MySet result = new MySetArray(10);
         StringTokenizer st = new java.util.StringTokenizer(paraset.toString(),"{},");
         
         for(int i = 0; i<count;i++)
            if(!paraset.isItem(set[i]))
               result.addItem(set[i]);
         
         return result;
     }
 //Cross Product
   public MySet crossProduct(MySet paraset){
      MySet result = new MySetArray(10);
     
     for(int i = 0;i<count;i++){
      StringTokenizer st = new StringTokenizer(paraset.toString(),"{},");
         while(st.hasMoreTokens()){
            String token = st.nextToken();
            MySet tempset = new MySetArray(10);
               tempset.addItem(set[i]);
               tempset.addItem(token);
             if(tempset.cardinality() == 2)
                  result.addItem(tempset);
             }      
        }      
        return result;  
   }
   //cardinality
   public int cardinality(){return count;}
   
   //toString
   public String toString(){
      StringBuffer sb = new StringBuffer();
      sb.append("{");
      for(int i = 0;i<count;i++){
         sb.append(set[i]);
          if(i<count-1)
            sb.append(",");
      }
      sb.append("}");
      return sb.toString();
   }
   
}//end of class