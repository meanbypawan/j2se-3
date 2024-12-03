/*
 length() : int
 toUpperCase() : String
 toLowerCase() : String
 charAt(int index) : char
 indexOf(char/string) : int
 lastIndexOf(char/string) : int
 compareTo(String) : int [0, +ve, -ve]
 compareToIgnoreCase(String) : int [0, +ve, -ve]
 "    A      "
 trim() : String
 substring(int beginingIndex) : String
 substring(int begIndex, int endIndex) : String

 */
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter 1st string");
       String s1 = sc.next();
       
       System.out.println("Enter 2nd string");
       String s2 = sc.next();
    
       int x = s1.compareToIgnoreCase(s2);
       if(x == 0)
         System.out.println(s1+" == "+s2);
       else if(x > 0)
              System.out.println(s1+" > "+s2);
            else
              System.out.println(s1+" < "+s2);    
    }
}
