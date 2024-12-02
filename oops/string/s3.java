/*
  Object
  public class Object{
    public boolean equals(Object o){
      // Address Comparison
      if(Address same);
        return true;
      return false;
    }
  }
  public class String extends Object{
    public boolean equals(Object o){
       // Content Comparision
    }
  }  
  class StringBuffer{
    
  }  
 */
class TestMain{
    public static void main(String args[]){
       String s1 = new String("A");
       String s2 = new String("A");

       System.out.println(s1 == s2); // false
       System.out.println(s1.equals(s2));// true

       // == v/s equals
       
    
    }
}