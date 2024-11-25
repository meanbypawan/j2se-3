class Addition{
    private int a;
    private int b;
    public void add(){
        System.out.println("Addition : "+(a+b));
    }
    public void setData(int x, int y){
        a = x;
        b = y;
    }
}

class TestMain{
    public static void main(String args[]){
        Addition obj = new Addition();// obj :{a:0,b:0}
        obj.setData(20,10); // obj :{a:20,b:10}
        obj.add();
    }
}