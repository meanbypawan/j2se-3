class Test{
   public void m1(int a, long b){
    System.out.println("I-L Version..");
   }
   public void m1(long a, int b){
    System.out.println("L-I version...");
   }
}

class TestMain {
     public static void main(String args[]){
       Test obj = new Test();
       obj.m1(20,10) ;
    }
}
