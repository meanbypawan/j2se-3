class Test{
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public int add(int a, int b, int c, int d){
        return a+b+c+d;
    }
}
class TestMain {
    public static void main(String args[]){
     Test obj = new Test();
     System.out.println("Result : "+obj.add(20,10,5,2));
    }
}
