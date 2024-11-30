class A{
   static{
     System.out.println("Block-A");
   }
}
class B{
    static{
        System.out.println("Block-B");
    }
    public void m1(){
        System.out.println("B ka m1() method...");
    }
}
class C{
    static{
        System.out.println("Block-C");
    }
    public void m2(){
        System.out.println("C ka m2() method...");
    }
}
class TestMain {
    public static void main(String args[]){
        System.out.println("Main started.....");
        A obj = new A(); // ---> Block-A
        B obj2 = new B(); //---> Block-B
        obj2.m1();
        B obj3 = new B();
        System.out.println("Main end.....");
    }
}
/*
 Compilation :- A.class, B.class, C.class, TestMain.class
 java TestMain 
 JVM  TestMain.main() 
 JRE [Java Runtime Enviornment]
   JVM [Java Virtual Machine]
    Class - Loader
      |---TestMain.class -------------> TestMain.main()
      |---A.class---------------------obj
      |---B.class---------------------obj2, obj3
 */