class TestMain {
    public static void main(String args[]){
        String s1 = "             AB                ";
        System.out.println("@"+s1+"@");
        s1 = s1.trim(); // "AB" --> HEAP
        System.out.println("@"+s1+"@");
    }
}
