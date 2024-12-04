class A{
    // Initializer block
    {
      System.out.println("A-initalizer......");
    }
    static{
        System.out.println("Block-A");
    }
    public A(){
        System.out.println("A-default....");
    }
}
class B extends A{
   {
       System.out.println("B-initialzer....");
   } 
   static{
    System.out.println("Block-B");
   }
   public B(){
    System.out.println("B-default....");
   }
}
class TestMain {
   public static void main(String args[]){
     new B();
   }    
}
