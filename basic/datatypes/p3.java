/*
  c/c++

  int x;
  x = 20;
  java TestMain hello
  java TestMain 20 10 30
  java TestMain true
  java TestMain t

  "hello", "20"  "true"  "t"
 ------------------------------
 public static void main(String args[])  
 public static final void main(String args[])
 pubilc static synchronized void main(String args[])
 public static strictp void main(String args[])
 public static final strictfp synchroinzed void main(String args)
 public static void main(String []args)
 public static void main(String[] args)
 public static void main(String... args) // ... var-arg
 */
class TestMain{
    public static final strictfp synchronized void main(String... args){
      System.out.println("Hello...");
    }
}