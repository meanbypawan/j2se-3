class TestMain{
    public static void main(String args[]){
        String s1 = "A";
        String s2 = "B";
        String s3 = s1 + s2;
        String s4 = s1 + s2;

        System.out.println(s3 == s4); // false

        String s5 = "AB"; // SCP-->AB
        String s6 = "A"+"B";

        System.out.println(s5 == s6);
    }
}