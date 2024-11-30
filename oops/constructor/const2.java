// this.variableName
// this()  ---> this call
class Test{
    public Test(boolean x, String y){
      System.out.println("Boolean String Version...");
    }
    public Test(int x, int y){
        this(x);
        System.out.println("I-I version...");
    }
    public Test(int x){
        this();
        System.out.println("I version....");
    }
    public Test(){
        System.out.println("Default version....");
    }
}
class TestMain {
    public static void main(String args[]){
        //Test obj = new Test(true,"A");
        Test obj = new Test(20,10);
    }
}
