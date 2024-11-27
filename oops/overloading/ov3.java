/*
 In case of method overloading compiler first go for perfact matching
 if perfact mathcing is not found then it will go for suitable matching
 if suitable matching not found then compiler will generate error.

 Note :- If multiple suitable matching found then compiler
 will generate ambiguity error.
 */
class Test{
    public void m1(int x){
        System.out.println("Integer Flavour called...");
    }
    public void m1(float x){
        System.out.println("Float Flavour called....");
    }
}

class TestMain {
     public static void main(String args[]){
       Test obj = new Test();
       obj.m1(20); // HMP : 1, TOP : int
     }
}
