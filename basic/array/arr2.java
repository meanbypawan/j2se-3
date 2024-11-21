class TestMain{
    public static void main(String args[]){
        byte a[] = new byte[10];
        short b[] = new short[10];
        int c[] = new int[10];
        long d[] = new long[10];
        char e[] = new char[10];
        float f[] = new float[10];
        double g[] = new double[10];
        boolean h[]= new boolean[10];
        TestMain obj = new TestMain();
        System.out.println(" obj : "+obj.getClass().getName());
        System.out.println("Byte : "+a.getClass());
        System.out.println("Short : "+b.getClass().getName());
        System.out.println("Int : "+c.getClass().getName());
        System.out.println("Long : "+d.getClass().getName());
        System.out.println("Char : "+e.getClass().getName());
        System.out.println("Float : "+f.getClass().getName());
        System.out.println("Double : "+g.getClass().getName());
        System.out.println("Boolean : "+h.getClass().getName());
    }
}