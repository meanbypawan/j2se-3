// String
class A{
   class B{  // B is a static member of A
      static{
        System.out.println("B classed loaded.....");
      }
      public void m1(){
        System.out.println("Inner class B ka m1()");
      }
   }
}
class TestMain {
    public static void main(String args[]){
      A obj = new A();
      obj.new B().m1();
    }
}
