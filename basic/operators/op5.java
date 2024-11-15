class TestMain{
    public static void main(String args[]){
        int x;
        x = ++10;
        /*
          x = ++y

          10 = 10 + 1  ==> 10 = 11
          x = 10

          required: variable
          found : value
         */
        System.out.println(x);
    }
}