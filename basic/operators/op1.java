/*
   Operators:-
    1. Arithmetic [+,-,*,/,%]
    2. Relational 
    3. Logical 
    4. Increment/Decrement
    5. Bitwise
    6. Conditional
    7. Assignment
    8. Shorthand
    9. instanceOf
  ----------------------------
  WAP to calculate following formula
  area = 1/2*b*h
  where b & h both are the integer
 */
class TestMain{
    public static void main(String args[]){
       int b,h;
       b = 3;
       h = 3;
       //float area = (float)(1/2*b*h); 
       //float area = (b*h)/2;
       //float area = (float)((b*h)/2);
       //float area = (float)(0.5 * b * h);
       float area = 1/2f * b * h;
       System.out.println("Area : "+area);
    }
}