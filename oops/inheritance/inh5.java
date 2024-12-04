class A{
    public void m1(){
        System.out.println("A-m1()");
    }
}
class B extends A{
    public void m1(){
      System.out.println("B-m1()");   
      super.m1(); // this.m1()
    }
}
class TestMain {
    public static void main(String args[]){
       B obj = new B();
       obj.m1();
    }
}
