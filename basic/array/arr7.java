/*  0  1  2
   [10 20 30] // 0  ------> x[0]  ---> 10,20,30   
   [40 50 60] // 1  ------> x[1]  ---> 40,50,60
   [70 80 90] // 2
      3 X 3 == 9   
    int ---> 00
    int----> 01   ---> r=0, c= 0 to 2
    int----->02

    int ---> 10
    int----> 11  -----> r=1, c= 0 to 2
    int----->12

    int ---> 20
    int----> 21 ------> r=2, c = 0 to 2
    int----->22
 */
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
       int x[][] = new int[3][3];
       Scanner sc = new Scanner(System.in);
       
       for(int r=0; r<x.length; r++){
          System.out.println("Enter "+x[r].length+" element of "+(r+1)+" row");
          for(int c=0; c<x[r].length; c++){
            x[r][c] = sc.nextInt();
          }
       }

       System.out.println("Given Matrix...");
       for(int r=0; r<x.length; r++){
         for(int c=0; c<x[r].length; c++){
            System.out.print("  "+x[r][c]);
         }
         System.out.println();
       }
    }
}