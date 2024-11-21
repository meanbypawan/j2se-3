import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        int x[] = new int[5];
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 5 element...");
        for(int i=0; i<5; i++){
           // cin>>x[i]; ---> cpp
           // scanf("%d",&x[i]); ---> c
           x[i] =  sc.nextInt();
        }
        System.out.println("....................................");
        for(int i=0; i<5;i++)
         System.out.println(x[i]);
    }
}