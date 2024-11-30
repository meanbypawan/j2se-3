/*
 static 
   1. Variable [Data member]
   2. method
   3. class [Inner class]
   4. block
   ------------------------------------------
   static-context :--
     static method
     static block

   Note :- In static context we can not use non-static member[instance]
   directly.  
 */
class Test{
  public static void display(){
    System.out.println("display executed....");
  }
}
class TestMain {
    public static void main(String args[]){
      Test.display();
    }
}
