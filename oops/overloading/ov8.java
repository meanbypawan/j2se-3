/*
 Var-arg :- Variable Length Argument
 zero or any number of argument
 public void m1(int x){
  
  }

  m1(10,2,3,5,6,7,8);
 */
class Test{
   
   public void m1(int x){
    System.out.println("Integer version....");
   }
   public void m1(int... x){
    System.out.println("Var-arg version....");
   }
}
class TestMain{
   public static void main(String args[]){
      Test obj = new Test();
      obj.m1(); // HMP : 1, TOP : int
   }
}