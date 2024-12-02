class TestMain{
    public static void main(String args[]){
        String s1 = "A";
        String s2 = "B";
        String s3 = new String("A");
        String s4 = "A";

        System.out.println(s1 == s4); // true
        System.out.println(s1 == s3); // false
    }
}