class A{
    static{
        System.out.println("Block-1");
    }
    public static void m1(){
        System.out.println("m1() executed....");
    }
}
class TestMain{
    static{
        System.out.println("Main-Block....");
    }
    public static void main(String args[]){
       System.out.println("Main started....");
       A.m1();
       System.out.println("Main-end.....");
    }
}