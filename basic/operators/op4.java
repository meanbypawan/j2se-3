class TestMain{
    public static void main(String args[]){
       int x=5,y;
       //y = ++x; 
       y = x++;
       /*
          y = ++x;
          y = x;
          x = x+1
        */
       System.out.println(x);
       System.out.println(y);
    }
}