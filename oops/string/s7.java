/*
 class Object{
    public String toString(){
     // returing hashcode;
    }
 }
 public class String{
   private String data;
   public String(String msg){
      this.data = msg;
   }
   public String toString(){
     return data;
   }   
 }
 */
class TestString{
    private String data;
    public TestString(String data){
        this.data = data;
    }
    public String toString(){
        return data;
    }
}
class TestMain{
    public static void main(String args[]){
        String s1 = new String("ABC");
        System.out.println(s1); // s1.toString()
        
        TestString ts = new TestString("XYZ");
        System.out.println(ts); // ts.toString();
    }
}
