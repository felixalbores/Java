/**
   MySetTest
*/
public class MySetTest{
   static public void main(String... args){
      MySet setA = new MySetArray(new String[]{"A","B","C","D"});
      MySet setB = new MySetArray(new String[]{"C","D","E"});
      MySet setD = new MySetArray(new String[]{"1","2","3","4","5","6"});
    
   
       System.out.println("Set A: "+setA);
       System.out.println("Set B: "+setB);
        
        MySet setC = setA.union(setB);
        System.out.println("A U B: "+setC);
        setC= setA.intersect(setB);
        System.out.println("A ^ B: "+setC);
        setC= setA.subtract(setB);
        System.out.println("A - B: "+setC);
        setC= setB.subtract(setA);
        System.out.println("B - A: "+setC);
        setC= setA.crossProduct(setB);
        System.out.println("A x B: "+setC);

        System.out.println("Set D: "+setD);
        setD.deleteItem("3");
        System.out.println("Set D: "+setD);

        setD.clear();
        System.out.println("Set D: "+setD);
   }
}//end of class 