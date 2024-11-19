// Conditional Operator In Java
/*
   (condition/Boolean Expression) ? expression-2 : expression-3;
 */
import java.util.Scanner;
class TestMain{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 differ integer value..");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = (a > b) ? a : b;
        System.out.println(max+" is greater...");
    }
}