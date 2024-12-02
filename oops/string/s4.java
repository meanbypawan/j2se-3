/*
 java.lang.String
   |---String()
   |---String(String)
   |---String(char [])
   |---String(byte[])
 */
class A{
    String s = "Hello";
    public String toString(){
       System.out.println("toString()-called......");
       return ""+ this.hashCode();
    }
}
class TestMain {
    public static void main(String args[]){
       String s1=null;
       String s2 = new String();

       System.out.println(s1);
       System.out.println(s2);

       char ch[] = {'A','B','C'};
       String s3 = new String(ch);
       System.out.println(ch);
       System.out.println(s3);

       byte b[] = {65,66,67}; // -128 to 127
       String s4 = new String(b);
       System.out.println(b);
       System.out.println(s4);
    
       A obj = new A(); // {s:"Hello"}
       String ss = new String("Hello"); // 
       System.out.println(ss); // ss.toString()
       System.out.println(obj);//obj.toString()
    }
}
