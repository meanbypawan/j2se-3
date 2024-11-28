/*
 Var-arg :- Variable Length Argument
 zero or any number of argument
 public void m1(int x){
  
  }

  m1(10,2,3,5,6,7,8);
 */
class Test{
   public void m1(int a, int b, int...x){
     System.out.println("a : "+a);
     System.out.println("b : "+b);
     System.out.println("Var arg data....."); 
     for(int i=0; i<x.length; i++)
       System.out.println(x[i]);
   }
}
class TestMain{
   public static void main(String args[]){
      Test obj = new Test();
      //obj.m1(1,2,3,4,5);
      //obj.m1(10,20);
    }
}