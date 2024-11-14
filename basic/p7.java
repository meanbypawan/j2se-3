/*
   short :- 2-byte :- 16-bit :- -2^15 to 2^15-1
   -32768 to +32767 , -32768, -32767
   int :- 4-byte :- 32-bit -2^31 to 2^31-1
   -2147483648 to 2147493647

   1 , 2,5000, 65000,-70000
 */
class TestMain{
    public static void main(String args[]){
       int a,b,c;
       a = 20;
       b = 10;
       c = a + b;
       System.out.println(c);
    }
}