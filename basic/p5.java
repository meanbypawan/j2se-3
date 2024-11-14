/**
 byte :-- 1 byte --- 8-bit --- -2^7 to 2^7 -1 ----> -128 to 127
 int x;
 x = 20.5; // 20
 ---------------
 Typecasing :- Process of converting one type of value into another
 is called Tyepecasting
 a. Implicit :- Typecasing which is automatically done by the compiler or system
 b. Explicit :- Typecasting which done by the programmer forcefully.
 */
class TestMain{
    public static void main(String args[]){
        byte a,b,c;
        a = 20;
        b = 10;
        c = (byte)(a + b);
        
        System.out.println(c);
    }
}