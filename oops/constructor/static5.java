class A{
    static{
        System.out.println("Block-1");
    }
    static{
        System.out.println("Block-2");
    }
    static{
        System.out.println("Block-3");
    }

}
class TestMain{
    public static void main(String args[]){
        A obj = new A(); // A.class
    }
}