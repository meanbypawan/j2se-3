/*
 String
  1. Immutable[that can not be change] / Thread Safe
 
 StringBuffer
   1. Mutable
   2. Thread Safe
   3. Slow
 StringBuilder
   1. Mutable
   2. Not a Thread Safe
   3. Fast
   */
class TestMain {
   public static void main(String args[]){
    //StringBuffer sb1 = new StringBuffer("A");
    StringBuilder sb1 = new StringBuilder("A");
    sb1.append("B");
    System.out.println(sb1);
   } 
}
// Inheritance
