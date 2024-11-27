/*
  Polymorphism :-
   One things has different implmentation
     or
   One thing having many forms
  In Java :- 2 types of polymorphism
  1. Compile time Polymorphism [Overloading]
  2. Runtieme Polymorphism [Overriding]
  
  Overloading :-
  Why
  What :- When we define multiple method with the same name whose
  parameters are different is called method overloading.
  Different Parameter :-
   a. Numbers
   b. Types
   c. Sequence
   
  How
  add(int a, int b){}
  add(int a, int b, int c){}
  add(int a, int b, int c, int d){}
  ------------------------------------
  println(byte)
  println(short)
  println(int)
  println(long)
  println(String)
  */
  class TestMain{
    public static void main(String args[]){
        byte a = 20;
        short b = 30;
        int c = 40;
        long d = 50;
        String s = "hello";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(s);
    }
  }
