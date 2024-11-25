class Addition{
    private int a;
    private int b;
    public void add(){
        System.out.println("Addition : "+(this.a+this.b));
    }
    public void sub(){
        System.out.println("Subtraction : "+(this.a-this.b));
    }
    public void multiplication(){
        System.out.println("Mulitplication : "+(this.a*this.b));
    }
    public void setData(int a, int b){
        this.a = a;
        this.b = b;
    }
}

class TestMain{
    public static void main(String args[]){
        Addition obj = new Addition();// obj :{a:0,b:0}
        obj.setData(20,10); // obj :{a:20,b:10}
        obj.add();
        obj.sub();
        obj.multiplication();
    }
}
/*
 void add(int a, int b){
   printf("%d",(a+b));
 }
 void sub(int a, int b){
   printf("%d",(a-b));
 }  
 void multiplication(int a, int b){
     printf("%d",(a*b));
 }  
 */