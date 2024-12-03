/*
 Object
 hashCode() & equals()


 */
class TestMain {
    public static void main(String ags[]){
        String s1 = "AB";
        System.out.println("s1 : "+s1.hashCode());
        s1 = null;
        String s2 = "AB";
        System.out.println("s2 : "+s2.hashCode()); 

        String s3 = new String(" AB");
        String s4 = new String("AB");

        System.out.println("s3 : "+s3.hashCode());
        System.out.println("s4 : "+s4.hashCode());
    }
}
