/*
 Var-arg :- Variable Length Argument
 zero or any number of argument
 public void m1(int x){
  
  }

  m1(10,2,3,5,6,7,8);
 */
class Test{
   public void m1(int... x){
   //   int yy[] = new int[10];
   //   System.out.println(yy.getClass().getName()); 
     System.out.println(x.getClass().getName()); 
     for(int i=0; i<x.length; i++)
       System.out.println(x[i]);
   }
}
class TestMain{
   public static void main(String args[]){
      Test obj = new Test();
      obj.m1(1,2,3,4,5);
   }
}