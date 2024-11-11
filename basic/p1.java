// Documents/j2se-3/basic/p1.java
// Test.class
/*
  Every Single Java Class
  Inner Class
  Annonymous Inner Class
  Interface
  Enum
  -------------
  Escape sequence character
  \n
  \t
  \r
  \b
  \a 
  class System{
     static PrintStream out;
  }
  class PrintStream{
  
  }
  String,System----------> lang ==> it is default package of java
  System : It is built-in java class available in lang package
  class :- It is keyword used to define class in java
  String :- It is bult-in java class availbale in lang package
  out - It is static member of System class, Object of PrintStream class
  println :- Instance method of PrintStream class
  public,static, void these are all keyword , having some special meaning
 */
class Test{
    public static void main(String x[]){
      System.out.println("Welcome In Java");
      System.out.print("ABC\n");
      System.out.printf("XYZ\n"); // 1.7
      System.err.println("Error Message....");
    }
}