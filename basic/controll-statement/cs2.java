/*
  WAP to enter an integer number b/w 1 to 5 and print it in word from
  for example :-
  n = 1  --> One
  n = 2  ---> Two

  Compile Time Expression
   20+10 ----> 30
  Runtime Expression
  a + b -----> Execution
 */
import java.util.Scanner;
class TestMain{
    public static void main(java.lang.String args[]){
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter an number b/w 1 to 5");
       int n = sc.nextInt();
       
       // n = 3
       int a = 2,b=1;
       switch(n){
          case 1: System.out.println("One");break;
          case 2: System.out.println("Two");break;
          case 2+1: System.out.println("Three");break;
          case 4-1: System.out.println("Four");break;
          case 5: System.out.println("Five");break;
          default: System.out.println("Invalid value...");
          
       }
    }
}