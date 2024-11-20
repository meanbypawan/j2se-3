class TestMain{
    public static void main(java.lang.String args[]){
        int i=5;
        while(i<=10){
            System.out.println(i); // Unreachable Statement
            i++;
            break;
        }
    }
}