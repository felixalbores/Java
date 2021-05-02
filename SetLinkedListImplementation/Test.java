public class Test{
   public static void main(String args[]){
      
      MyListInterface list=new MyListLinkedList(new String[]{"a","b","c","d","e","f"});
   
      list.deleteItem(new String("a"));
      System.out.println(list);
      list.replaceItem(new String("d"),new String("x"));
      System.out.println(list);
      list.insertBefore(new String("e"),new String("y"));
      System.out.println(list);
      list.deleteItem(new String("y"));
     
      System.out.println(list);
      list.insertAfter(new String("b"),new String("w"));
      System.out.println(list);
      
      list.clear();
      
   }
}