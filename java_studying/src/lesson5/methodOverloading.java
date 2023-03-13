package lesson5;

public class methodOverloading {
    void show(int i1){
        System.out.println(i1);
    }
    void show(boolean b1){
        System.out.println(b1);
    }
    void show (int a, int b){
        System.out.println();
    }
    void show(String s1){
        System.out.println(s1);
    }
    void show(String s, int b){
        System.out.println(s + b);
    }
    void show(int b, String s){
        System.out.println("wow");
    }
}

class methodOverloadingTest{
    public static void main(String[] args) {
        methodOverloading mO = new methodOverloading();
        int a = 500;
        mO.show(a);
        boolean b1 = true;
        mO.show(b1);
        String s1 = "privet";
        mO.show(s1);
        mO.show("privet", 10);
        mO.show(11, "hellow");   
     }
}
