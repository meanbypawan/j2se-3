class Addition{
    private int a;
    private int b;
    public void add(){
        System.out.println("Addition : "+(a+b));
    }
    public void setData(int a, int b){
        this.a = a;
        this.b = b;
    }
}

class TestMain{
    public static void main(String args[]){
        Addition obj = new Addition();// obj :{a:0,b:0}
        obj.setData(20,10); // obj :{a:0,b:0}
        obj.add();
    }
}