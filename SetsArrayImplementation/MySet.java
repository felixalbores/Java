/**
   MySet interface
*/

public interface MySet{
   
   //define sentinel methods
   public boolean isFull();
   public boolean isEmpty();
   
   //utility methods
    public boolean isItem(Object item);
    public boolean addItem(Object item);
    public boolean deleteItem(Object item);
    public void clear();
    
    //allowable operations
    public MySet union(MySet paraset);
    public MySet intersect(MySet paraset);
    public MySet subtract(MySet paraset);
    public MySet crossProduct(MySet paraset);
    public int cardinality();  //return the count of the actual element in a Set
   
}//end of interface