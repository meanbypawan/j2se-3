import java.util.Scanner;
class Addition{
    private int a;
    private int b;
    public void setData(int a, int b){
        this.a  = a;
        this.b = b;
    }
    public void setA(int a){
        this.a = a;
    }
    public void setB(int b){
        this.b = b;
    }
    public int getA(){
        return this.a;
    }
    public int getB(){
        return b;
    }
    public int add(){
        return a + b;
    }
}
class TestMain {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st value");
        int x = sc.nextInt();
        System.out.println("Enter 2nd value");
        int y = sc.nextInt();
        Addition obj = new Addition();
        obj.setA(x);
        obj.setB(y);
        System.out.println("Addition : "+obj.add());
    }
}
