/*
   Point-1
   c + c = i
   b + b = i
   b + s = i
   s + s = i
   i + i = i
   b + L = L
   s + L = L
   i + L = L
   L + L = L
   ----------------------
      no typecasing is required
   ----------------------------->
   byte----short----int----long
   <--------------------------
       typecasing is required
  c/c++/Java
  There are 3 ways to represent integer
  a. Decimal [0-9]
  b. Octal   [0-7]
  c. Hexadecimal [0-9,a,b,c,d,e,f]    
 */
class TestMain{
    public static void main(String args[]){
       long a = 2147483648L; // interger number too large
       System.out.println(a);
    }
}