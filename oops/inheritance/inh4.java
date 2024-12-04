/*
  Developer [Java Team Member]
  Progreammer []
  User
 */
class A{
    /*public A(){
        System.out.println("A-default...");
    }*/
    public A(int x){
        System.out.println("A-parameterized...");
    }
}
class B extends A{
    public B(){
        super(100);
    }
    public B(int x){
      super(x); 
      System.out.println("B-default...");
    }
}
class TestMain {
   public static void main(String args[]){
     new B(100);
   }  
}
