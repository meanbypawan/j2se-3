/*
 Constructor :-
   It is special member of java class because of the following reasons.

   1. Name of the constructor is the same as the class name
   2. There is not return type of the construc...
   3. Call automatically when object is created.
   4. Const is not inheritated
   5. contructor can not be static


   Types of Construcotr
     a. Default Const.
     b. Parameterized cont.
 
   Why constructor :-
     To initialize the object at the time of object creation.
     
   class A{} ------>
    class A{  
      public A(){}
    }
   
   new XYZ("hello"); -----> Error
  */
  class Test{
     public Test(int x){
        System.out.println("Int version....");  
     }
     public Test(boolean x){
        System.out.println("Boolean version....");
     }
     public Test(){
        System.out.println("Default version...");
     }
  }
  class TestMain{
    public static void main(String args[]){
      //new Test();
      new Test(100);
      new Test(true);
      new Test();
    }
  }