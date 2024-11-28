/* 
 20,10 ----> add(int a, int b){}
 20,10,5---> add(int a, int b, int c){}
 20,10,50,4-> add(int a, int b, int c, int d){}
*/
class Test{
   public int add(int... x){
     int sum = 0;
     for(int element : x)
      sum = sum + element;
     return sum; 
    }
}
class TestMain {
    public static void main(String args[]){
        Test obj  = new Test();
        int a = obj.add(20,10);
        int b = obj.add(20,10,2);
        int c = obj.add(20,10,2,1);
        System.out.println("First Result : "+a);
        System.out.println("Second Result : "+b);
        System.out.println("Third Result : "+c);
    }
}
