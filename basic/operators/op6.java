/*
 gcc :- 3 step
 turbo : pre --> post ---> expression
 */
class TestMain{
    public static void main(String args[]){
        int x = 5, y;
        y = ++x - x-- + --x * ++x / x++;
        /*
          x = 6
          y = ++x - x-- + --x * ++x / x++;
                6 - 6   +   4 *  5 / 5  
                6 - 6 + 20 /5
                6 - 6 + 4
                0 + 4
                 4
         */
        System.out.println("x : "+x+" y : "+y);
    }
}