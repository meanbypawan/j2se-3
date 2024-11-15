/*
   Relational Operator
   20 > 10 :--> true | false
    Logical Op
    Scanner
 */
class TestMain{
    public static void main(String args[]){
       int a,b,c,d;
       a = 10;
       b = 10;
       c = 10;
       d = 10;
       boolean x = (a == b) == (c == d);
       /*
         x = a == b == c == d
             10 == 10
                true == 10 : incomparable type : boolean and int
                    error
        */
       System.out.println(x);
    }
}