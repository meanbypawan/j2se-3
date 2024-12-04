class A{
    public A(){
        System.out.println("A-default...");
    }
    public A(int x){
        System.out.println("A-parameterized...");
    }
}
class B extends A{
    public B(){
      System.out.println("B-default...");
    }
    public B(int x){
        System.out.println("B-parameterized...");
    }
}
class TestMain {
   public static void main(String args[]){
     new B(100);
   }  
}
