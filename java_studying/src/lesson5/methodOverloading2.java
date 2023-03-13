package lesson5;

public class methodOverloading2 {
    public int sum(int i1, int i2){
        return i1 + i2;
    }
    protected String sum (String s1, String s2){
        return s1 + s2;
    }
}

class methodOverloading2Test{
    public static void main(String[] args) {
        methodOverloading2 mO = new methodOverloading2();
        int a = mO.sum(1, 2);
        String s = mO.sum("Privet", " poka");
        System.out.println(a);
        System.out.println(s);
    }
}