class Test{
    public void m1(byte x){
        System.out.println("Byte Flavour");
    }
    public void m1(short x){
        System.out.println("Short Flavour");
    }
    public void m1(int x){
        System.out.println("Integer Flavour called...");
    }
    public void m1(long x){
        System.out.println("Long Flavour");
    }
}

class TestMain {
     public static void main(String args[]){
       Test obj = new Test();
       //byte x = 20;
       //obj.m1((short)20); // HMP : 1, TOP : byte
      obj.m1(20); 
    }
}
