/*
  Valid Switch Expression Value
    byte, short, int, char, String [1.7]
 */
class TestMain{
    public static void main(java.lang.String args[]){
      java.lang.String x = "Hello";
      switch(x){ // int
        case "Hello": System.out.println("Hello Matched...");break;
        default : System.out.println("Not matched....");
      }
    }
}